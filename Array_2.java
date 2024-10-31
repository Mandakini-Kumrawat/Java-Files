import java.util.Scanner ;
public class Array_2 {
    static void Print_Array ( int [] arr ) {
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            System.out.print ( " " + arr [ i ] + " " ) ;
        }
        System.out.println () ;
    }
    static int [] Prefix_Sum ( int [] arr ) {
        int n = arr.length ;
        int [] pref = new int [ n ] ;
        pref [ 0 ] = arr [ 0 ] ;
        for ( int i = 1 ; i < n ; i ++ ) {
            pref [ i ] = pref [ i - 1 ] + arr [ i ] ;
        }
        return pref ;
    }
    static int [] Make_Prefix_Sum ( int [] arr ) {
        for ( int i = 1 ; i < arr.length ; i ++ ) {
            arr [ i ] += arr [ i - 1 ] ;
        }
        return arr ;
    }
    static int [] Suffix_Sum ( int [] arr ) {
        int n = arr.length ;
        int [] suff = new int [ n ] ;
        suff [ n - 1 ] = arr [ n - 1 ] ;
        for ( int i = n - 2 ; i >= 0 ; i -- ) {
            suff [ i ] = suff [ i + 1 ] + arr [ i ] ;
        }
        return suff ;
    }
    static boolean Subarray_Pair ( int [] arr ) {
        int n = arr.length ;
        int TotalSum = 0 ;
        for ( int i = 0 ; i < n ; i ++ ) {
            TotalSum += arr [ i ] ;
        }
        for ( int i = 1 ; i < n ; i ++ ) {
            arr [ i ] += arr [ i - 1 ] ;
            int suffix = TotalSum - arr [ i ] ;
            if ( arr [ i ] == suffix ) return true ;
        }
        return false ;
    }
    public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System.in ) ;
        System.out.println ( " Size : " ) ;
        int n = scan.nextInt () ;
        int [] arr = new int [ n ] ;
        System.out.println ( " Enter Array : " ) ;
        for ( int i = 0 ; i < n ; i ++ ) {
            arr [ i ] = scan.nextInt () ;
        }
        System.out.println ( " Your Array : " ) ;
        Print_Array ( arr ) ;
        System.out.println ( " Answer : " + Subarray_Pair ( arr ) ) ;
//        Prefix_Sum ( arr ) ;
//        System.out.println ( " Answer Array : " ) ;
//        Print_Array ( arr ) ;
//        int [] pref = Make_Prefix_Sum ( arr ) ;
//        System.out.println ( " Enter Queries : " ) ;
//        int q = scan.nextInt () ;
//        while ( q -- > 0 ) {
//            System.out.println ( " Enter Range : " ) ;
//            int st = scan.nextInt () ;
//            int lt = scan.nextInt () ;
//            System.out.println ( " Answer : " + ( pref [ lt ] - pref [ st - 1 ] ) ) ;
//        }
//        int [] suff = Suffix_Sum ( arr ) ;
//        Print_Array ( suff ) ;
        
    }
}

import java.util.Scanner ;
public class target_Sum {
    static int Repeating_Value ( int [] arr ) {
        int ans = -1 ;
        for ( int i = 0 ; i < arr.length - 1 ; i ++ ) {
            for ( int j = i + 1 ; j < arr.length ; j ++ ) {
                if ( arr [ i ] == arr [ j ] ) return arr [ i ] ;
            }
        }
        return ans ;
    }
    static int Maximum ( int [] arr ) { // 4 8 3 5
        int max = Integer.MIN_VALUE ; // max = 8
        int sec_max = max ;
        for ( int i = 0 ; i < arr.length ; i ++ ) { // // i = 0 , 1 , 2  ,
            if ( arr [ i ] > max ) { // sec max = 4
                sec_max = max ;
                max = arr [ i ] ; // max = 4 , 8
            }
        }
        return sec_max ;
    }
    static int Unique_Number ( int [] arr ) {
        int ans = 0 ;
        for ( int i = 0 ; i < arr.length - 1 ; i ++ ) {
            for ( int j = i + 1 ; j < arr.length ; j ++ ) {
                if ( arr [ i ] == arr [ j ] ) {
                    arr [ i ] = - 1 ; arr [ j ] = - 1 ;
                }
            }
        }
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            if ( arr [ i ] > 0 ) ans = arr [ i ] ;
        }
        return ans ;
    }
    static int Pair_Of_Sum ( int [] arr , int target ) {
        int n = arr.length ;
        int ans = 0 ;
        for ( int i = 0 ; i < n - 2 ; i ++ ) {
            for ( int j = i + 1 ; j < n - 1 ; j ++ ) {
                for ( int k = j + 1 ; k < n ; k ++ ) {
                    if (arr [ i ] + arr [ j ] + arr [ k ] == target) {
                        System.out.println(" ( " + arr[i] + " , " + arr[j] + " , " + arr [ k ] + " ) " ) ;
                        ans++;
                    }
                }
            }
        }
        return ans ;
    }
    static void swap ( int a , int b ) {
        System.out.println( " Original Value : a = " + a + " , b = " + b ) ;
        a += b ; // 12
        b = a - b ; // -9
        a -= b ; //
        System.out.println( " After Value : a = " + a + " , b = " + b ) ;
    }
    static int [] Reverse_Array ( int [] arr ) {
        int n = arr.length ;
        int [] ans = new int [ n ] ;
        int j = 0 ;
        for ( int i = n - 1 ; i >= 0 ; i -- ) {
            ans [ j ++ ] = arr [ i ] ;
        }
        return ans ;
    }
    static void Reverse_Array_Again ( int [] arr, int st , int lt ) {
        int i = st , j = lt ;
        while ( i <= j ) {
            int temp = arr [ i ] ;
            arr [ i ] = arr [ j ] ;
            arr [ j ] = temp ;
            i ++ ; j -- ;
        }
    }
    static int [] Rotate_Array ( int [] arr , int k ) {
        int n = arr.length ;
        k = k % n ;
        int [] ans = new int [ n ] ;
        int j = 0 ;
        for ( int i = n - k ; i < n ; i ++ ) {
            ans [ j ++ ] = arr [ i ] ;
        }
        for ( int i = 0 ; i < n - k ; i ++ ) {
            ans [ j ++ ] = arr [ i ] ;
        }
        return ans ;
    }
    static void Rotate_In_Place ( int [] arr , int k ) {
        int n = arr.length ;
        k = k % n ;
        Reverse_Array_Again ( arr , 0 , n - k - 1 ) ;
        Reverse_Array_Again ( arr , n - k , n - 1 ) ;
        Reverse_Array_Again ( arr , 0 , n - 1 );
    }
    static int [] Make_Frequency_Array ( int [] arr ) {
        int [] freq = new int [ 100005 ] ;
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            freq [ arr [ i ] ] ++ ;
        }
        return freq ;
    }
    static void Print_Array ( int [] arr ) {
        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.print ( " " + arr [ i ] + " " ) ;
        }
        System.out.println () ;
    }
    static void Sort_0s_1s ( int [] arr ) { // 0 1 1 0 1 0 1 0 0 0 1
        int n = arr.length ; // n = 10
        int left = 0 ; // left = 0 1 2 3 4 5
        int right = n - 1 ; // right = 9 8 7 6 5 4
        while ( left <= right ) { // 0 0 0 0 0 1 1 1 1 1
            if ( arr [ left ] != arr [ right ] ) {
                if ( arr [ left ] > arr [ right ] ) {
                    int temp = arr [ left ] ;
                    arr [ left ] = arr [ right ] ;
                    arr [ right ] = temp ;
                    left ++ ; right -- ;
                } else {
                    left ++ ; right -- ;
                }
            } else {
                if ( arr [ left ] == 0 ) left ++ ;
                else right -- ;
            }
        }
    }
    static void Sort_Even_Odd ( int [] arr ) { // 8 37 5 61 3 90 // 8 90 5 61 3 37
        int n = arr.length ; // n = 6                  i  j
        int i = 0 , j = n - 1 ; // i = 0 1 2          odd odd
        while ( i < j ) { // j = 5 4 3 2
            if ( ( arr [ i ] % 2 != 0 ) && ( arr [ j ] % 2 == 0 ) ) {
                int temp = arr [ i ] ;
                arr [ i ] = arr [ j ] ;
                arr [ j ] = temp ;
                i ++ ; j -- ;
            }
            if ( ( arr [ i ] % 2 == 0 ) && ( arr [ j ] % 2 == 0 ) ) i ++ ;
            else j -- ;
        }
    }
    static int [] Square_Of_Elements ( int [] arr ) {
        int n = arr.length ;
        int left = 0 , right = n - 1 ;
        int [] ans = new int [ n ] ;
        int k = n - 1 ;
        while ( left <= right ) {
            if ( Math.abs ( arr [ left ] ) > Math.abs ( arr [ right ] ) ) {
                ans [ k -- ] = arr [ left ] * arr [ left ] ;
                left ++ ;
            } else {
                ans [ k -- ] = arr [ right ] * arr [ right ] ;
                right -- ;
            }
        }
        return ans ;
    }
    public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System.in ) ;
        System.out.println ( " Enter Length : " ) ;
        int n = scan.nextInt () ;
        int [] arr = new int [ n ] ;
        System.out.println ( " Enter Array : " ) ;
        for ( int i = 0 ; i < n ; i ++ ) {
            arr [ i ] = scan.nextInt () ;
        }
        System.out.println ( " Original Array : " ) ;
        Print_Array ( arr ) ;
//        Sort_0s_1s ( arr ) ;
//        Sort_Even_Odd ( arr ) ;
//        System.out.println ( " Sorted Array : " ) ;
//        Print_Array ( arr ) ;
//        System.out.println ( " Number Of Queries : " ) ;
//        int q = scan.nextInt () ;
//        int [] freq = Make_Frequency_Array ( arr ) ;
//        while ( q > 0 ) {
//            System.out.println ( " Enter Number : " ) ;
//            int num = scan.nextInt () ;
//            if ( freq [ num ] > 0 ) System.out.println ( " YES ! " ) ;
//            else System.out.println ( " NO ! " ) ;
//            q -- ;
//        }
//        System.out.println ( " Enter Rotation : " ) ;
//        int k = scan.nextInt () ;
//        System.out.println ( " Enter Target Sum : " ) ;
//        int TS = scan.nextInt () ;
//        System.out.println ( " Number Of Pairs : " + Pair_Of_Sum ( arr , TS ) ) ;
//        System.out.println ( " Unique Number : " + Unique_Number ( arr ) ) ;
//        System.out.println ( " Maximum Number : " + Maximum ( arr ) ) ;
//        System.out.println ( " Repeated Value : " + Repeating_Value ( arr ) ) ;
//        int a = 9 ;
//        int b = 3 ;
//        int [] arr = { 1 , 2 , 3 , 4 , 5 } ;
//        swap ( a , b ) ;
//        int [] ans = Reverse_Array  ( arr ) ;
        int [] ans = Square_Of_Elements ( arr ) ;
        System.out.println( " Answer Array : " ) ;
        Print_Array ( ans ) ;
//        Reverse_Array_Again ( arr ) ;
//        Rotate_In_Place ( arr , k ); ;
//        for ( int i = 0 ; i < arr.length ; i ++ ) {
//            System.out.print( " " + arr [ i ] ) ;
//        }
    }
}

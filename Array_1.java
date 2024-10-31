import java.util.Scanner;
import java.util.Arrays ;
class Demo_Array {
    int [] Sorted ( int [] arr ) {
        Arrays.sort ( arr ) ;
        Print_Array( arr ) ;
        int [] ans = { arr [ 0 ] , arr [ arr.length - 1 ] } ;
        return ans ;
    }
     void Print_Array ( int [] arr ) {
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            System.out.print( " " + arr [ i ] + " " ) ;
        }
        System.out.println();
    }
    void Taking_Input_Array () {
        Scanner scan = new Scanner ( System.in ) ;
        int [] arr = new int [ 5 ] ;
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            arr [ i ] = scan.nextInt () ;
        }
        System.out.println ( " Your Array : " ) ;
//        for ( int i = 0 ; i < arr.length ; i ++ ) {
//            System.out.println( i + " -> " + arr [ i ] ) ;
//        }
        Print_Array( arr ) ;
    }
    void Find_X () {
        int [] arr = { 5 , 6 , 5 , 3 , 5 , 4 } ;
        int ans = - 1 ;
        int x = 5 ;
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            if ( arr [ i ] == x ) {
                ans = i ;
            }
        }
        System.out.println( " Answer = " + ans ) ;
    }
    void Max_Array () {
        int [] arr = { 5 , 3 , 6 , 2 , 8 , 4 } ;
        int ans = 0 ;
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            if ( arr [ i ] > ans ) ans = arr [ i ] ;
        }
        System.out.println ( " Answer = " + ans ) ;
    }
    void Sum_Of_Elements () {
        int [] arr = { 1 , 4 , 2 } ;
        int sum = 0 ;
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            sum += arr [ i ] ;
        }
        System.out.println( " Answer : " + sum ) ;
    }
    void PrintArray () {
        int [] arr = { 2 , 5 , 6 , 1 , 3 , 9 , 7 } ;
//        for ( int i = 0 ; i < arr.length ; i ++ ) {
//            System.out.println ( i + " -> " + arr [ i ] ) ;
//        }
        System.out.println( " Length : " + arr.length ) ;
//        for ( int each : arr ) {
//            System.out.println ( each ) ;
//        }
        int i = 0 ;
        while ( i < arr.length ) {
            System.out.println( i + " -> " + arr [ i ] ) ;
            i ++ ;
        }
    }
    void MultiArray () {
        int [] [] multi = new int [ 3 ] [ 2 ] ;
        int [] [] mul = { { 51 , 20 } , { 45 , 18 } , { 13 , 93 } } ;
//        System.out.println ( " (0,0) -> " + mul [ 0 ] [ 0 ] ) ;
//        System.out.println ( " (0,1) -> " + mul [ 0 ] [ 1 ] ) ;
//        System.out.println ( " (1,0) -> " + mul [ 1 ] [ 0 ] ) ;
//        System.out.println ( " (1,1) -> " + mul [ 1 ] [ 1 ] ) ;
//        System.out.println ( " (2,0) -> " + mul [ 2 ] [ 0 ] ) ;
//        System.out.println ( " (2,1) -> " + mul [ 2 ] [ 1 ] ) ;
        for ( int i = 0 ; i < 3 ; i ++ ) {
            for ( int j = 0 ; j < 2 ; j ++ ) {
                System.out.println ( " ( " + i + " , " + j + " )    -> " + mul [ i ] [ j ] ) ;
            }
        }
    }
    void DemoArray () {
        int [] ages = new int [ 3 ] ;
        float [] weight = new float [ 3 ] ;
        String [] name = { "Rahul" , "Raj" , "Mohan" , " bruh " } ;
//        ages [ 0 ] = 34 ;
//        ages [ 1 ] = 44 ;
//        ages [ 2 ] = 83 ;
//        System.out.println( " Age 0 -> " + ages [ 0 ] ) ;
//        System.out.println( " Age 1 -> " + ages [ 1 ] ) ;
//        System.out.println( " Age 2 -> " + ages [ 2 ] ) ;
//        System.out.println( " Name 0 -> " + name [ 0 ] ) ;
//        System.out.println( " Name 1 -> " + name [ 1 ] ) ;
//        System.out.println( " Name 2 -> " + name [ 2 ] ) ;
        System.out.println( " Ages -> " + ages.length ) ;
        System.out.println( " Weight -> " + weight.length ) ;
        System.out.println( " Name -> " + name.length ) ;
    }
    void Count_X () {
         int [] a = { 1 , 1 , 4 , 5 , 3 , 5 } ;
         int x = 5 ;
         int count = 0 ;
         for ( int i = 0 ; i < a.length ; i ++ ) {
             if ( a [ i ] == x ) count ++ ;
         }
         System.out.println ( " Answer : " + count ) ;
    }
    boolean Sorted_Or_Not () {
         int [] arr = { 22 , 33 ,44 , 55  } ;
         for ( int i = 1 ; i < arr.length ; i ++ ) {
             if ( arr [ i ] < arr [ i - 1 ] ) return false ;
         }
         return true ;
    }
}
public class Array_1 {
    public static void main ( String [] args ) {
        Demo_Array obj = new Demo_Array () ;
        int [] a = { 9 , 9 , 3 , 1 , 0 , 0 } ;
//        if ( obj.Sorted_Or_Not () ) System.out.println( " Sorted " ) ;
//        else System.out.println( " Not Sorted ! " ) ;
        obj.Print_Array ( obj.Sorted ( a ) ) ;
    }
}

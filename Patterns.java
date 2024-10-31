import java.util.Scanner ;
public class Patterns {
    public static void main ( String [] args ) {
        Scanner scan = new Scanner( System.in ) ;
        System.out.println ( " Level : " ) ;
        int n = scan.nextInt () ;
//        System.out.println ( " Row : " ) ;
//        int r = scan.nextInt () ;
//        System.out.println ( " Column : " ) ;
//        int c = scan.nextInt () ;
//        for ( int i = 1 ; i <= r ; i ++ ) {
//            for ( int j = 1 ; j <= c ; j ++ ) {
//                if ( i == 1 || i == r || j == 1 || j == c ) {
//                    System.out.print(" * ") ;System.out.println( " Enter Level : " ) ;
//        int n = scan.nextInt () ;
//                } else {
//                    System.out.print( "   " ) ;
//                }
//            }
//            System.out.println() ;
//        }
//        for ( int i = 1 ; i <= r ; i ++ ) { // i = 1 , 2 , 3
//            for ( int j = 1 ; j <= i ; j ++ ) { // j =
//                System.out.print( " * " ) ;
//            }
//            System.out.println() ;
//        }
//        for ( int i = 1 ; i <= n ; i ++ ) {
//            for ( int j = i ; j <= n ; j ++ ) {
//                System.out.print ( " * " ) ;
//            }
//            System.out.println() ;
//        }
//        for ( int i = 1 ; i <= n ; i ++ ) {
//            for ( int j = 1 ; j <= n - i ; j ++ ) {
//                System.out.print( "   " ) ;
//            }
//            for ( int k = 1 ; k <= 2 * i - 1 ; k ++ ) {
//                System.out.print( " * " ) ;
//            }
//            System.out.println();
//        }
//        for ( int i = 1 ; i <= n ; i ++ ) {
//            for ( int j = i ; j <= n ; j ++ ) {
//                System.out.print( " " + j + " " ) ;
//            }
//            for ( int k = 1 ; k <= i - 1 ; k ++ )  {
//                System.out.print( " " + k + " " ) ;
//            }
//            System.out.println();
//        }
//        for ( int i = 1 ; i <= r ; i ++ ) {
//            for ( int j = 1 ; j <= c ; j ++ ) {
//                if ( ( i + j ) % 2 == 0 ) {
//                    System.out.print( " " + 1 + " " ) ;
//                } else {
//                    System.out.print( " " + 2 + " " );
//                }
//            }
//            System.out.println();
//        }
//        for ( int i = 1 ; i <= n ; i ++ ) {
//            for ( int j = 1 ; j <= n - i ; j ++ ) {
//                System.out.print( "   " ) ;
//            }
//            for ( int k = 1 ; k <= i ; k ++ ) {
//                System.out.print( " " + k + " " ) ;
//            }
//            for ( int a = i - 1 ; a >= 1 ; a -- ) {
//                System.out.print( " " + a + " " ) ;
//            }
//            System.out.println() ;
//        }
        for ( int i = 1 ; i <= n ; i ++ ) { // i = 1 , 2 , 3 , 4
            for ( int j = 1 ; j <= n - i ; j ++ ) { // j = 1 (1)
                System.out.print( "   " ) ;
            } // (1) (3) (5) (7)
            for ( int k = 1 ; k <= 2 * i - 1 ; k ++ ) { // k = 1 , 2 (7)
                if ( k == 1 || k == ( 2 * i - 1 ) || i == n ) { // k
                    System.out.print( " " + i + " " ) ;
                } else {
                    System.out.print ( "   " ) ;
                }
            }
            System.out.println() ;
        }
    }
}
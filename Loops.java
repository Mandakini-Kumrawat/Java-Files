import java.util.Scanner ;
public class Loops {
    public static void main ( String [] args ) {
        Scanner scan = new Scanner( System.in ) ;
//        System.out.println ( " Enter Number : " ) ;
//        int n = scan.nextInt () ;
//        int sum = 0 ;
//        for ( int i = 1 ; i <= n ; i ++ ) {
//            sum += i ;
//        }
//        System.out.println ( " Answer : " + sum ) ;
//        while ( n != -1 ) {
//            sum += n ;
//            n = scan.nextInt () ;
//        }
//        System.out.println ( " Answer : " + sum ) ;
//        int n = 1 ;
//        while ( true ) {
//            if ( ( n % 5 == 0 ) && ( n % 7 == 0 ) ) {
//                System.out.println(" Found " + n);
//                break;
//            } n ++ ;
//        }
//        for ( int num = 1 ; num <= 50 ; num ++ ) {
//            if ( num % 3 == 0 ) continue ;
//            System.out.println( num ) ;
//        }
//        int count = 0 ;
//        while ( n != 0 ) {
//            count ++ ;
//            n /= 10 ;
//        }
//        System.out.println( " Answer : " + count ) ;
//        int sum = 0 ;
//        while ( n > 0 ) {
//            sum += n % 10 ;
//            n /= 10 ;
//        }
//        System.out.println( " Answer : " + sum ) ;
//        int ans = 1 ;
//        while ( n > 0 ) { // 0
//            ans = ans * 10 + ( n % 10 ) ; // ans = 6432
//            n /= 10 ; // n = 0
//        }
//        System.out.println( " Answer : " + ans ) ;
//        for ( int i = 1 ; i <= n ; i ++ ) { // 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 =
//            if ( i % 2 == 0 ) {
//                ans -= i ;
//            } else {
//                ans += i ;
//            }
//        }
//        System.out.println( " Answer : " + ans ) ;
//        for ( int i = 1 ; i <= n ; i ++ ) {
//            ans *= i ;
//            System.out.println( " Answer : " + ans ) ;
//        }
//        System.out.println( " Final Answer : " + ans ) ;
        System.out.println ( " First Number : " ) ;
        int a = scan.nextInt () ;
        System.out.println ( " Second Number : " ) ;
        int b = scan.nextInt () ;
        int ans = 1 ;
        for ( int i = 0 ; i < b ; i ++ ) {
            ans *= a ;
        }
        System.out.println( " Answer : " + ans ) ;
    }
}

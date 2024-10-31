import java.util.Scanner ;
public  class Number_System {
    public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System.in ) ;
        System.out.println ( " Enter A Number : " ) ;
        int n = scan.nextInt () ;
        // Binary To Decimal Conversion ;
//        int ans = 0 ;
//        int pw = 1 ;
//        while ( n > 0 ) { // 2 * 2 * 2
//            int a = n % 10 ;
//            ans += ( a * pw ) ;
//            n /= 10 ;
//            pw *= 2 ;
//        }
//        System.out.println( " Answer : " + ans ) ;


        // Decimal To Binary Conversion ;
        int ans = 0 ;
        int pw = 1 ;
        while ( n > 0 ) {
            int a = n % 2 ;
            n /= 2 ;
            ans += ( a * pw ) ;
            pw *= 10 ;
        }
        System.out.println( " Answer : " + ans ) ;
    }
}
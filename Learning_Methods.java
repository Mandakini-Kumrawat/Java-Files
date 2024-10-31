import java.util.Scanner ;
class Algebra {
    int add ( int a , int b ) {
        int ans = a + b ;
        return ans ;
    }
}
public class Learning_Methods {
    public static void main ( String [] args ) {
//        Algebra obj = new Algebra () ;
//        Scanner scan = new Scanner ( System.in ) ;
//        System.out.println ( " Enter First Number : " ) ;
//        int a = scan.nextInt () ;
//        System.out.println ( " Enter Second Number : " ) ;
//        int b = scan.nextInt () ;
//        int ans = obj.add ( a , b ) ;
//        System.out.println ( " Answer : " + ans ) ;
        System.out.println ( " 24 -> " + Math.sqrt( 24 ) ) ;
        System.out.println ( " 16 -> " + Math.sqrt( 16 ) ) ;
        System.out.println ( " 5.3 -> " + Math.floor( 5.3 ) ) ;
        System.out.println ( " 5.8 -> " + Math.floor( 5.8 ) ) ;
        System.out.println ( " 5.3 -> " + Math.ceil( 5.3 ) ) ;
        System.out.println ( " 5.8 -> " + Math.ceil( 5.8 ) ) ;
    }
}
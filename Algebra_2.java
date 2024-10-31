import java.util.Scanner ;
class Al {
    int a ;
    int b ;
    Al ( int x , int y ) {
        System.out.println ( " Constructor Is Called. " ) ;
        a = x ;
        b = y ;
    }
    int add ( ) {
        return a + b ;
    }
    int sub () {
        return a - b ;
    }
    int mul () {
        return a * b ;
    }
}
public class Algebra_2 {
    public static void main ( String [] args ) {
        Al obj1 = new Al( 5 , 7 ) ;
        Scanner scan = new Scanner ( System.in ) ;
//        System.out.println ( " A = " ) ;
//        int a = scan.nextInt () ;
//        System.out.println ( " B = " ) ;
//        int b = scan.nextInt () ;
        int ans = obj1.add () ;
        System.out.println ( " Answer Add : " + ans ) ;
        System.out.println ( " Answer Sub : " + obj1.sub() ) ;
        System.out.println ( " Answer Mul : " + obj1.mul() ) ;
        Al obj2 = new Al ( 2 , 3 ) ;
        System.out.println ( " Answer Add : " + obj2.add () ) ;
        System.out.println ( " Answer Sub : " + obj2.sub () ) ;
        System.out.println ( " Answer Mul : " + obj2.mul () ) ;
    }
}

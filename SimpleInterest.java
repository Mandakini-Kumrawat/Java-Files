import java.util.Scanner;

public class SimpleInterest {
    public  static  void main ( String [ ] args ) {
        Scanner scan = new Scanner( System.in ) ;
        System.out.println ( " Principle : " ) ;
        int p = scan.nextInt() ;
        System.out.println ( " Rate : " ) ;
        float r = scan.nextFloat() ;
        System.out.println ( " Time : " ) ;
        int t = scan.nextInt() ;
        float i = ( p * r * t ) / 100 ;
        System.out.println ( " ( " + p + " + " + r + " + " + t + " ) / 100 " ) ;
        System.out.println ( " Interest : " + i ) ;
    }
}
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static  void main ( String [ ] args ) {
        Scanner scan = new Scanner( System.in ) ;
        System.out.println( " Enter First Number : " ) ;
        int one = scan.nextInt() ;
        System.out.println( " Enter Second Number : " ) ;
        int two = scan.nextInt() ;
        int sum = one + two ;
        System.out.println ( " Answer = " + sum ) ;
    }
}

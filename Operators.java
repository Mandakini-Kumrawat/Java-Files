public class Operators {
    public static void main(String[] args) {
        int p = 9 , q = 10 ;
//        System.out.println ( " Is Equal To : " + ( p == q ) ) ;
//        System.out.println ( " Is Not Equal To : " + ( p != q ) ) ;
//        System.out.println ( " Smaller Than : " + ( p < q ) ) ;
//        System.out.println ( " Greater Than : " + ( p > q ) ) ;
//        System.out.println ( " Equal Or Smaller : " + ( p <= q ) ) ;
//        System.out.println ( " Equal Or Greater : " + ( p >= q ) ) ;
//        System.out.println ( " Answer : " + p / q ) ;
//        System.out.println ( " Answer : " + p % q ) ;
        System.out.println ( " Bitwise OR : " + ( p | q ) ) ; // 11
        System.out.println ( " Bitwise AND : " + ( p & q ) ) ; // 8
        System.out.println ( " Bitwise XOR : " + ( p ^ q ) ) ; // 3
        System.out.println ( " Bitwise Left Shift : " + ( p << 1 ) ) ; // 18
        System.out.println ( " Bitwise Left Shift : " + ( p << 2 ) ) ; // 36
        System.out.println ( " Bitwise Right Shift : " + ( q >> 1 ) ) ; // 5
        System.out.println ( " Bitwise Right Shift : " + ( q >> 2 ) ) ; // 2
    }
}

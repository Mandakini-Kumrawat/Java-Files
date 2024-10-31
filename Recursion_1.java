import java.util.Scanner ;
import java.util.ArrayList ;
public class Recursion_1 {
    static void Print_1_To_N_Numbers ( int n ) {
        if ( n == 0 ) return ;
        Print_1_To_N_Numbers ( n - 1 ) ;
        System.out.print ( " " + n + " " ) ;
    }
    static void Print_N_To_1_Numbers ( int n ) {
        if ( n == 0 ) return ;
        System.out.print ( " " + n + " " ) ;
        Print_N_To_1_Numbers ( n - 1 ) ;
    }
    static int Factorial ( int n ) {
        if ( n == 0 ) return 1 ;
        return n * Factorial ( n - 1 ) ;
    }
    static int Fibonacci ( int n ) {
        if ( n == 0 || n == 1 ) return n ;
        return Fibonacci ( n - 1 ) + Fibonacci ( n - 2 ) ;
    }
    static int Sum_Of_Digits ( int n ) {
        if ( n >=0 && n <= 9 ) return n ;
        return n % 10 + Sum_Of_Digits ( n / 10 ) ;
    }
    static int P_Power_Q ( int p , int q ) {
        if ( q == 0 ) return 1 ;
        int smallPow = P_Power_Q ( p , q / 2 ) ;
        if ( q % 2 == 0 ) return smallPow * smallPow ;
        else return p * smallPow * smallPow ;
    }
    static void Multiple_Of_Number ( int n , int k ) { // n = 12 , k = 5 , 12 4
        if ( k == 0 ) return ;
        Multiple_Of_Number ( n , k - 1 ) ;
        System.out.print ( " " + n * k + " " ) ;
    }
    static int Sum_Of_Numbers ( int n ) {
        if ( n == 0 ) return 0 ;
        return n + Sum_Of_Numbers ( n - 1 ) ;
    }
    static int Sum_Of_Alternate_Numbers ( int n ) {
        if ( n == 0 ) return 0 ;
        if ( n % 2 == 0 ) return Sum_Of_Alternate_Numbers ( n - 1 ) - n ;
        else return Sum_Of_Alternate_Numbers ( n - 1 ) + n ;
    }
    static int GCD_Brute_Force ( int x , int y ) {
        int i = 0 ;
        if ( x < y ) i = x ;
        else i = y ;
        while ( i > 0 ) {
            if ( x % i == 0 && y % i == 0 ) return i ;
            i -- ;
        }
        return 0 ;
    }
    static int GCD_Iterative ( int x , int y ) {
        while ( x % y != 0 ) {
            int rem = x % y ;
            x = y ;
            y = rem ;
        }
        return y ;
    }
    static int GCD_Euclids ( int x , int y ) {
        if ( y == 0 ) return x ;
        return GCD_Euclids ( y , x % y ) ;
    }
    static void Print_Array ( int [] arr , int idx ) {
        if ( idx == arr.length ) return ;
        System.out.print ( " " + arr [ idx ] + " " ) ;
        Print_Array ( arr , idx + 1 ) ;
    }
    static int Max_Value_Array ( int [] arr , int idx ) {
        if ( idx == arr.length - 1 ) return arr [ idx ] ;
        int max = Math.max ( arr [ idx ] , Max_Value_Array ( arr , idx + 1 ) ) ;
        return max ;
    }
    static int Sum_Of_Array ( int [] arr , int idx ) {
        if ( idx == arr.length - 1 ) return arr [ idx ] ;
        int sum = arr [ idx ] + Sum_Of_Array ( arr , idx + 1 ) ;
        return sum ;
    }
    static boolean Target_Exist_Or_Not ( int [] arr , int x , int idx ) {
        if ( idx == arr.length ) return false ;
        if ( arr [ idx ] == x ) return true ;
        else return Target_Exist_Or_Not ( arr , x , idx + 1 ) ;
    }
    static ArrayList < Integer > Target_Indices ( int [] arr , int x , int idx ) {
        if ( idx == arr.length ) return new ArrayList < Integer > () ;
        ArrayList < Integer > ans = new ArrayList <> () ;
        if ( arr [ idx ] == x ) ans.add ( idx ) ;
        ArrayList < Integer > Smallans = Target_Indices ( arr , x , idx + 1 ) ;
        ans.addAll ( Smallans ) ;
        return ans ;
    }
    static String Remove_Char ( String s , int idx ) { // abcax
        if ( idx == s.length () ) return " " ;
        String SmallAns = Remove_Char ( s , idx + 1 ) ;
        if ( s.charAt ( idx ) == 'a' ) return SmallAns ;
        else return s.charAt ( idx ) + SmallAns ;
    }
    static String Reverse_String ( String s , int idx ) {
        String ans = " " ;
        if ( idx == s.length () ) return ans ;
        return ans = Reverse_String ( s , idx + 1 ) + s.charAt ( idx ) ;
    }
    static boolean Palindrom_String ( String s , int l , int r ) {
        if ( l >= r ) return true ;
        if ( s.charAt ( l ) == s.charAt ( r ) ) return Palindrom_String ( s , l + 1 , r - 1 ) ;
        else return false ;
    }
    static ArrayList < String > SubSequence ( String s ) {
        ArrayList < String > ans = new ArrayList <> () ;
        if ( s.length () == 0 ) { ans.add ( " " ) ; return ans ; }
        ArrayList < String > smallAns = SubSequence ( s.substring ( 1 ) ) ;
        for ( String ss : smallAns ) {
            ans.add ( ss ) ;
            ans.add ( s.charAt ( 0 ) + ss ) ;
        }
        return ans ;
    }
    static void SubSequence_Print ( String s , String currAns ) {
        if ( s.length () == 0 ) {
            System.out.print ( currAns ) ; return ;
        }
        String remString = s.substring ( 1 ) ;
        SubSequence_Print ( remString , s.charAt ( 0 ) + currAns ) ;
        SubSequence_Print ( remString , currAns ) ;
    }
    static void Add_SubSet ( int [] a , int n , int idx , int CurrSum ) {
        if ( idx >= n ) {
            System.out.print ( " " + CurrSum + " " ) ;
            return ;
        }
        Add_SubSet ( a , n , idx + 1 , CurrSum + a [ idx ] ) ;
        Add_SubSet ( a , n , idx + 1 , CurrSum ) ;
    }
    static int Frog_Jump ( int [] arr , int n , int idx ) {
        if ( idx == n - 1 ) return 0 ;
        int cost1 = Math.abs ( arr [ idx ] - arr [ idx + 1 ] ) + Frog_Jump ( arr , n , idx + 1 ) ;
        if ( idx == n - 2 ) return cost1 ;
        int cost2 = Math.abs ( arr [ idx ] - arr [ idx + 2 ] ) + Frog_Jump ( arr , n , idx + 2 ) ;
        return Math.min ( cost1 , cost2 ) ;
    }
    static void Alphabet_Numerics ( String [] Keypad , String s , String currAns ) {
        if ( s.length () == 0 ) {
            System.out.print ( " " + currAns + " " ) ; return ; }
        int c = s.charAt ( 0 ) - '0' ;
        String str = Keypad [ c ] ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            Alphabet_Numerics ( Keypad , s.substring ( 1 ) , currAns + str.charAt ( i ) ) ;
        }
    }
    public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System.in ) ;
//        System.out.println ( " Enetr Number : " ) ;
//        int n = scan.nextInt () ;
//        Print_1_To_N_Numbers ( n ) ;
//        Print_N_To_1_Numbers ( n ) ;
//        System.out.println ( " Factorial : " + Factorial ( n ) ) ;
//        System.out.println ( " Fibonacci : " + Fibonacci ( n ) ) ;
//        System.out.println ( " Sum Of Digits : " + Sum_Of_Digits ( n ) ) ;
//        System.out.print ( " X = " ) ;
//        int x = scan.nextInt () ;
//        System.out.print ( " Y = " ) ;
//        int y = scan.nextInt () ;
//        System.out.println ( " P^Q : " + P_Power_Q ( p , q ) ) ;
//        System.out.println ( " Multiples Of Number : " ) ;
//        Multiple_Of_Number ( n , k ) ;
//        System.out.println ( " Sum Of Numbers : " + Sum_Of_Numbers ( n ) ) ;
//        System.out.println ( " Sum Of Numbers : " + Sum_Of_Alternate_Numbers ( n ) ) ;
//        System.out.println ( " Greater Common Divider By Brute Force : " + GCD_Brute_Force ( x , y ) ) ;
//        System.out.println ( " Greater Common Divider By Iterative : " + GCD_Iterative ( x , y ) ) ;
//        System.out.println ( " Greater Common Divider By Euclids Algorithm : " + GCD_Euclids ( x , y ) ) ;
        String [] Keypad = { "" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz" } ;
//        System.out.println ( " Target : " ) ;
//        int x = scan.nextInt () ;
//        System.out.println ( " Array Recursion : " ) ;
//        Print_Array ( arr , 0 ) ;
//        System.out.println ( " Maximum Value In Array : " + Max_Value_Array ( arr , 0 ) ) ;
//        System.out.println ( " Sum Of Array : " + Sum_Of_Array ( arr , 0 ) ) ;
//        if ( Target_Exist_Or_Not ( arr , x , 0 ) ) System.out.println ( " Yes : " ) ;
//        else System.out.println ( " No : " ) ;
//        ArrayList < Integer > AL = Target_Indices ( arr , x , 0 ) ;
//        for ( Integer i : AL ) {
//            System.out.print ( " " + i + " " ) ;
//        }
//        Strings ---------->
//        String s = scan.nextLine () ;
//        System.out.println ( Remove_Char ( s , 0 ) ) ;
//        System.out.println ( Reverse_String ( s , 0 ) ) ;
//        System.out.println ( " Palindrom_String " ) ;
//        String Palindrom = Reverse_String ( s , 0 ) ;
//        if ( Palindrom_String ( s , 0 , s.length () - 1 ) ) System.out.println ( " Yes. " ) ;
//        else System.out.println ( " No. " ) ;
//        ArrayList < String > ans = SubSequence ( s ) ;
//        System.out.print ( ans ) ;
//        SubSequence_Print ( s , " " ) ;
//        Add_SubSet ( arr , arr.length , 0 , 0 ) ;
//        System.out.println ( " Cost : " + Frog_Jump ( arr , arr.length , 0 ) ) ;
        String s = "23" ;
        Alphabet_Numerics ( Keypad , s , " " ) ;
    }
}
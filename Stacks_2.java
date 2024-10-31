import java.util.Scanner ;
import java.util.Stack ;
public class Stacks_2 {
    public static boolean Balanced_Stack ( String str ) {
        if ( str.length () % 2 != 0 ) return false ;
        Stack < Character > st = new Stack <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            if ( str.charAt ( i ) == '(' ) {
                st.push ( str.charAt ( i ) ) ;
            } else {
                if ( st.size () == 0 ) {
                    return false ;
                } else {
                    st.pop () ;
                }
            }
        }
        if ( st.size () > 0 ) return false ;
        else return true ;
    }
    public static boolean Valid_Brackets ( String str ) {
        if ( str.length () % 2 != 0 ) return false ;
        Stack < Character > st = new Stack <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            if ( str.charAt ( i ) == '(' || str.charAt ( i ) == '{' || str.charAt ( i ) == '[' ) {
                st.push ( str.charAt ( i ) ) ;
            } else {
                if ( st.size () == 0 ) { return false ; }
                else if ( str.charAt ( i ) == ')' ) {
                    if ( st.peek () == '(' ) st.pop () ;
                    else return false ;
                } else if ( str.charAt ( i ) == '}' ) {
                    if ( st.peek () == '{' ) st.pop () ;
                    else return false ;
                } else {
                    if ( st.peek () == '[' ) st.pop () ;
                    else return false ;
                }
            }
        }
        if ( st.size () > 0 ) return false ;
        else return true ;
    }
    public static int [] Consecutive_Subsequence ( int [] input ) {
        Stack < Integer > st = new Stack <> () ;
        for ( int i = 0 ; i < input.length ; i ++ ) {
            if ( ( st.size () == 0 ) || ( st.peek () != input [ i ] ) ) { st.push ( input [ i ] ) ; }
            else if ( input [ i ] == st.peek () ) {
                if ( ( i == input.length - 1 ) || ( input [ i ] != input [ i + 1 ] ) ) st.pop () ;
            }
        }
        int [] output = new int [ st.size () ] ;
        int m = output.length ;
        for ( int i = m - 1 ; i >= 0 ; i -- ) {
            output [ i ] = st.pop () ;
        }
        return output ;
    }
    public static int [] Next_Greater_Element ( int [] input ) {
        int n = input.length ;
        Stack < Integer > st = new Stack <> () ;
        int [] res = new int [ n ] ;
        res [ n - 1 ] = - 1 ;
        st.push ( input [ n - 1 ] ) ;
        for ( int i = n - 2 ; i >= 0 ; i -- ) {
            res [ i ] = - 1 ;
            while ( st.size () != 0 && st.peek () < input [ i ] ) {
                st.pop () ;
            }
            if ( st.size () == 0 ) res [ i ] = -1 ;
            else res [ i ] = st.peek () ;
            st.push ( input [  i ] ) ;
        }
        return res ;
    }
    public static int [] Stock_Price_Span ( int [] input ) { // 10  4  5  90  120  80
        int n = input.length ;                               //  1  1  2   4   5    1
        Stack < Integer > st = new Stack <> () ;             //  1
        int [] res = new int [ n ] ;
        res [ 0 ] = 1 ;
        for ( int i = 0 ; i < n ; i ++ ) {
            while ( st.size () != 0 && input [ st.peek () ] < input [ i ] ) {
                st.pop () ;
            }
            if ( st.size () == 0 ) res [ i ] = i + 1 ;
            else res [ i ] = i - st.peek () ;
            st.push (  i ) ;
        }
        return res ;
    }
    public static int Largest_Histogram_Rectangle ( int [] input ) {
        int n = input.length ;
        Stack < Integer > st = new Stack <> () ;
        int [] nse = new int [ n ] ;
        int [] pse = new int [ n ] ;
        // Calculating Next Smaller Element -
        nse [ n - 1 ] = n ;
        st.push ( n - 1 ) ;
        for ( int i = n - 2 ; i >= 0 ; i -- ) {
            while ( st.size () > 0 && input [ st.peek () ] >= input [ i ] ) {
                st.pop () ;
            }
            if ( st.size () == 0 ) nse [ i ] = n ;
            else nse [ i ] = st.peek () ;
            st.push ( i ) ;
        }
        // Empty The Stack -
        while ( st.size () > 0 ) st.pop () ;
        // Calculating Previous Smaller Element -
        pse [ 0 ] = - 1 ;
        st.push ( 0 ) ;
        for ( int i = 1 ; i < n ; i ++ ) {
            while ( st.size () > 0 && input [ st.peek () ] >= input [ i ] ) {
                st.pop () ;
            }
            if ( st.size () == 0 ) pse [ i ] = - 1 ;
            else pse [ i ] = st.peek () ;
            st.push ( i ) ;
        }
        // Calculating Maximum Area Of Rectangle -
        int max = -1 ;
        for ( int i = 0 ; i < n ; i ++ ) {
            int area = input [ i ] * ( nse [ i ] - pse [ i ] - 1 ) ;
            max = Math.max ( max , area ) ;
        }
        return max ;
    }
    // Min_Stack First Approach - Using Extra Stack -
    public static class Min_Stack_1 {
        Stack < Integer > st = new Stack <> () ;
        Stack < Integer > min = new Stack <> () ;
        public Min_Stack_1 () {
            // Constructor
        }
        public void Push ( int data ) {
            if ( st.size () == 0 ) {
                st.push(data);
                min.push(data);
            } else {
                st.push ( data ) ;
                if ( data < min.peek () ) min.push(data);
                else min.push ( min.peek () ) ;
            }
        }
        public void Pop () {
            st.pop () ;
            min.pop () ;
        }
        public int Peek () {
            return st.peek () ;
        }
        public int getMin () {
            return min.peek () ;
        }
    }
    // Min_Stack Second Approach Without Using Extra Stack -
//    public static class Min_Stack_2 {
//        Stack < long > st = new Stack <> () ;
//        long min = -1 ;
//        public Min_Stack_2 () {
//            // Constructor
//        }
//        public void Push ( int data ) {
//            long x = ( long ) data ;
//            if ( st.size () == 0 ) {
//                st.push ( x ) ;
//                min = x ;
//            } else {
//                if ( x < min ) {
//                    st.push ( 2 * x - min ) ;
//                    min = x ;
//                } else {
//                    st.push ( x ) ;
//                }
//            }
//        }
//        public void Pop () {
//            if ( st.size () == 0 ) return ;
//            if ( st.peek () > min ) {
//                st.pop () ;
//            } else {
//                long old_min = 2 * min - st.peek () ;
//                min = old_min ;
//                st.pop () ;
//            }
//        }
//        public int Peek () {
//            if ( st.size () == 0 ) return -1 ;
//            long q = st.peek () ;
//            if ( q >= min ) return ( int ) ( q ) ;
//            else return ( int ) min ;
//        }
//        public int getMin () {
//            if ( st.size () == 0 ) return -1 ;
//            return ( int ) min ;
//        }
//    }
    public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System.in ) ;
//        String str = scan.nextLine () ;

//        1. Check If The Given String Is Balanced Or Not -
//        System.out.println ( " Balanced : " + Balanced_Stack ( str ) ) ;

//        2. Chack Whether A Given Brackets Valid Or not -
//        System.out.println ( " Valid : " + Valid_Brackets ( str ) ) ;

//        3. Remove Consecutive Subsequences From The Array -
//        Input - 1   2   2   3   10   10   10   4   4   4   5   7   7   2
//        Output - 1   3   5   2
//        int [] input = { 1 , 2 , 2 , 3 , 10 , 10 , 10 , 4 , 4 , 4 , 5 , 7 , 7 , 2 } ;
//        int [] output = Consecutive_Subsequence ( input ) ;
//        System.out.println ( " Answer Array : " ) ;
//        for ( int i = 0 ; i < output.length ; i ++ ) {
//            System.out.print ( " " + output [ i ] + " " ) ;
//        }
//        System.out.println () ;

//        4. Find Next Greater Element Of An Array Element -
//        Input - 1   3   2   1   8   6   3   4
//        Output - 3   8   8   8   -1   -1   4   -1
//        int [] input = { 1 , 3 , 2 , 1 , 8 , 6 , 3 , 4 } ;
//        int [] output = Next_Greater_Element ( input ) ;
//        System.out.println ( " Answer Array : " ) ;
//        for ( int i = 0 ; i < output.length ; i ++ ) {
//            System.out.print ( " " + output [ i ] + " " ) ;
//        }
//        System.out.println () ;

//        5. Calculate The Span Of Stock Price For All n Days.
//        Input - 100   80   60   70   60   75   85
//        Output - 1    1    1    2     1    4    6
//        int [] input = { 10 , 4 , 5 , 90 , 120 , 80 } ; // 1 1 2 4 5 1
//        int [] output = Stock_Price_Span ( input ) ;
//        System.out.println ( " Answer Array : " ) ;
//        for ( int i = 0 ; i < output.length ; i ++ ) {
//            System.out.print ( " " + output [ i ] + " " ) ;
//        }
//        System.out.println () ;

//        6. Find Out The Largest Rectangle In Histogram -
//          Input - 2   1   5   6   2   3   Output - 10
//        int [] input = { 2 , 1 , 5 , 6 , 2 , 3 } ;
//        int output = Largest_Histogram_Rectangle ( input ) ;
//        System.out.println ( " Answer : " + output ) ;

//        7. Min Stack - Design A Stack That Supports Push , Pop , Peek And Retrieving The Minimum Element In
//                Constant Time. With Using Extra Space For Stack.

//        8. Min Stack - Design A Stack That Supports Push , Pop , Peek And Retrieving The Minimum Element In
//                Constant Time. Without Using Extra Space For Stack.
    }
}

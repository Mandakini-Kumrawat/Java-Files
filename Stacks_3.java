import java.util.Stack ;
public class Stacks_3 {
    public static int Infix_Expression ( String str ) {
        Stack < Integer > val = new Stack <> () ;
        Stack < Character > op = new Stack <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            char ch = str.charAt ( i ) ;
            int ascii = ( int ) ch ;
            // '0' -> 48 & '9' -> 57
            if ( ascii >= 48 && ascii <= 57 ) {
                val.push ( ascii - '0' ) ;
            } else if ( op.size () == 0 || ch == '(' || op.peek () == '(' ) {
                op.push ( ch ) ;
            } else if ( ch == ')' ) {
                while ( op.peek () != '(' ) {
                    int val2 = val.pop () ;
                    int val1 = val.pop () ;
                    if ( op.peek () == '+' ) val.push ( val1 + val2 ) ;
                    else if ( op.peek () == '-') val.push ( val1 - val2 ) ;
                    else if ( op.peek () == '*') val.push ( val1 * val2 ) ;
                    else val.push ( val1 / val2 ) ;
                    op.pop () ;
                } op.pop () ;
            } else {
                if ( ch == '+' || ch == '-' ) {
                    int val2 = val.pop () ;
                    int val1 = val.pop () ;
                    if ( op.peek () == '+' ) val.push ( val1 + val2 ) ;
                    else if ( op.peek () == '-') val.push ( val1 - val2 ) ;
                    else if ( op.peek () == '*') val.push ( val1 * val2 ) ;
                    else val.push ( val1 / val2 ) ;
                    op.pop () ;
                    op.push ( ch ) ;
                }
                if ( ch == '*' || ch == '/' ) {
                    if ( op.peek () == '*' || op.peek () == '/' ) {
                        int val2 = val.pop () ;
                        int val1 = val.pop () ;
                        if ( op.peek () == '*') val.push ( val1 * val2 ) ;
                        else val.push ( val1 / val2 ) ;
                        op.pop () ;
                        op.push ( ch ) ;
                    } else {
                        op.push ( ch ) ;
                    }
                }
            }
        }
        while ( val.size () > 1 ) {
            int val2 = val.pop () ;
            int val1 = val.pop () ;
            if ( op.peek () == '+' ) val.push ( val1 + val2 ) ;
            else if ( op.peek () == '-') val.push ( val1 - val2 ) ;
            else if ( op.peek () == '*') val.push ( val1 * val2 ) ;
            else val.push ( val1 / val2 ) ;
            op.pop () ;
        }
        return val.peek () ;
    }
    public static String Infix_To_Prefix_Evolution ( String str ) {
        Stack < String > stri = new Stack <> () ;
        Stack < Character > op = new Stack <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            char ch = str.charAt ( i ) ;
            int ascii = ( int ) ch ;
            if ( ascii >= 48 && ascii <= 57 ) {
                String s = "" + ch ;
                stri.push ( s ) ;
            } else if ( op.size () == 0 || ch == '(' || op.peek () == '(' ) {
                op.push ( ch ) ;
            } else if ( ch == ')' ) {
                while ( op.peek () != '(' ) {
                    String val2 = stri.pop () ;
                    String val1 = stri.pop () ;
                    char o = op.pop () ;
                    String t = o + val1 + val2 ;
                    stri.push ( t ) ;
                } op.pop () ;
            } else {
                if ( ch == '+' || ch == '-' ) {
                    String val2 = stri.pop () ;
                    String val1 = stri.pop () ;
                    char o = op.pop () ;
                    String t = o + val1 + val2 ;
                    stri.push ( t ) ;
                    op.push ( ch ) ;
                } else {
                    if ( op.peek () == '*' || op.peek () == '/' ) {
                        String val2 = stri.pop () ;
                        String val1 = stri.pop () ;
                        char o = op.pop () ;
                        String t = o + val1 + val2 ;
                        stri.push ( t ) ;
                        op.push ( ch ) ;
                    } else {
                        op.push ( ch ) ;
                    }
                }
            }
        }
        while ( stri.size () > 1 ) {
            String val2 = stri.pop () ;
            String val1 = stri.pop () ;
            char o = op.pop () ;
            String t = o + val1 + val2 ;
            stri.push ( t ) ;
        }
        String ans = stri.peek () ;
        return ans ;
    }
    public static String Infix_To_Postfix_Evolution ( String str ) {
        Stack < String > stri = new Stack <> () ;
        Stack < Character > op = new Stack <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            char ch = str.charAt ( i ) ;
            int ascii = ( int ) ch ;
            if ( ascii >= 48 && ascii <= 57 ) {
                String s = "" + ch ;
                stri.push ( s ) ;
            } else if ( op.size () == 0 || ch == '(' || op.peek () == '(' ) {
                op.push ( ch ) ;
            } else if ( ch == ')' ) {
                while ( op.peek () != '(' ) {
                    String val2 = stri.pop () ;
                    String val1 = stri.pop () ;
                    char o = op.pop () ;
                    String t = val1 + val2 + o ;
                    stri.push ( t ) ;
                } op.pop () ;
            } else {
                if ( ch == '+' || ch == '-' ) {
                    String val2 = stri.pop () ;
                    String val1 = stri.pop () ;
                    char o = op.pop () ;
                    String t = val1 + val2 + o ;
                    stri.push ( t ) ;
                    op.push ( ch ) ;
                } else {
                    if ( op.peek () == '*' || op.peek () == '/' ) {
                        String val2 = stri.pop () ;
                        String val1 = stri.pop () ;
                        char o = op.pop () ;
                        String t = val1 + val2 + o ;
                        stri.push ( t ) ;
                        op.push ( ch ) ;
                    } else {
                        op.push ( ch ) ;
                    }
                }
            }
        }
        while ( stri.size () > 1 ) {
            String val2 = stri.pop () ;
            String val1 = stri.pop () ;
            char o = op.pop () ;
            String t = val1 + val2 + o ;
            stri.push ( t ) ;
        }
        String ans = stri.pop () ;
        return ans ;
    }
    public static int Postfix_To_Infix ( String str ) {
        Stack < Integer > st = new Stack <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            char ch = str.charAt ( i ) ;
            int ascii = ( int ) ch ;
            if ( ascii >= 48 && ascii <= 57 ) {
            st.push ( ascii - '0' ) ;
            } else {
                int val2 = st.pop () ;
                int val1 = st.pop () ;
                if ( ch == '+' ) st.push ( val1 + val2 ) ;
                else if ( ch == '-' ) st.push ( val1 - val2 ) ;
                else if ( ch == '*' ) st.push ( val1 * val2 ) ;
                else st.push ( val1 / val2 ) ;
            }
        }
        int a = st.pop () ;
        return a ;
    }
    public static int Prefix_To_Infix ( String str ) {
        Stack < Integer > st = new Stack <> () ;
        for ( int i = str.length () - 1 ; i >= 0 ; i -- ) {
            char ch = str.charAt ( i ) ;
            int ascii = ( int ) ch ;
            if ( ascii >= 48 && ascii <= 57 ) {
                st.push ( ascii - '0' ) ;
            } else {
                int val1 = st.pop () ;
                int val2 = st.pop () ;
                if ( ch == '+' ) st.push ( val1 + val2 ) ;
                else if ( ch == '-' ) st.push ( val1 - val2 ) ;
                else if ( ch == '*' ) st.push ( val1 * val2 ) ;
                else st.push ( val1 / val2 ) ;
            }
        }
        int a = st.pop () ;
        return a ;
    }
    public static String Prefix_To_Postfix ( String str ) {
        Stack < String > st = new Stack <> () ;
        for ( int i = str.length () - 1 ; i >= 0 ; i -- ) {
            char ch = str.charAt ( i ) ;
            int ascii = ( int ) ch ;
            if ( ascii >= 48 && ascii <= 57 ) {
                String s = "" + ch ;
                st.push ( s ) ;
            } else {
                String val1 = st.pop () ;
                String val2 = st.pop () ;
                char o = ch ;
                String t = val1 + val2 + o ;
                st.push ( t ) ;
            }
        }
        return st.peek () ;
    }
    public static String Postfix_To_Prefix ( String str ) {
        Stack < String > st = new Stack <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            char ch = str.charAt ( i ) ;
            int ascii = ( int ) ch ;
            if ( ascii >= 48 && ascii <= 57 ) {
                String s = "" + ch ;
                st.push ( s ) ;
            } else {
                String val2 = st.pop () ;
                String val1 = st.pop () ;
                char o = ch ;
                String t = o + val1 + val2 ;
                st.push ( t ) ;
            }
        }
        return st.peek () ;
    }
    public static int Celebrity_Problem ( int [] [] arr , int n ) {
        Stack < Integer > st = new Stack <> () ;
        for ( int i = 0 ; i < n ; i ++ ) {
            st.push ( i ) ;
        }
        while ( st.size () > 1 ) {
            int i = st.pop () ;
            int j = st.pop () ;
            if ( arr [ i ] [ j ] == 0 ) st.push ( i ) ; // 2
            else if ( arr [ i ] [ j ] == 1 && arr [ j ] [ i ] == 1 ) return -1 ;
            else st.push ( j ) ; // 1
        }
        if ( st.size () == 0 ) return - 1 ;
        int p = st.pop () ;
        for ( int j = 0 ; j < n ; j ++ ) {
            if ( arr [ p ] [ j ] == 1 ) return -1 ;
        }
        for ( int i = 0 ; i < n ; i ++ ) {
            if ( arr [ i ] [ p ] == 0 && i != p ) return -1 ;
        }
        return p ;
    }
    public static int [] Sliding_Window ( int [] arr , int k ) {
        int n = arr.length ;
        int [] ans = new int [ n - k + 1 ] ;
        int z = 0 ;
        // Find Next Greter Element -
        Stack < Integer > st = new Stack <> () ;
        int [] nge = new int [ n ] ;
        nge [ n - 1 ] = n ;
        st.push ( n - 1 ) ;
        for ( int i = arr.length - 2 ; i >= 0 ; i -- ) {
            if ( arr [ i ] > arr [ st.peek () ] ) {
                while ( arr [ i ] > arr [ st.peek ( ) ] ) { st.pop () ; }
            }
            if ( st.size () == 0 ) nge [ i ] = n ;
            else nge [ i ] = st.peek () ;
            st.push ( i ) ;
        }
        int j = 0 ; 
        for ( int i = 0 ; i < n - k + 1 ; i ++ ) { // 3
            if ( j > i + k - 1 ) j = i ;
            int max = arr [ j ] ;
            while ( j <= i + k - 1 ) {
                max = arr [ j ] ;
                j = nge [ j ] ;
            }
            ans [ k ++ ] = max ;
        }
        return ans ;
    }
    public static void main ( String [] args ) {
//        String str_1 = "9-(5+3)*4/6" ;
        // Infix Evolution
//        int ch = Infix_Expression ( str ) ;
//        System.out.println ( " Answer : " + ch ) ;
        // Infix To Prefix Evolution
//        String str_ans = Infix_To_Prefix_Evolution ( str ) ;
//        System.out.println ( str_ans ) ;
        // Infix To Postfix Evolution
//        String str_ans = Infix_To_Postfix_Evolution ( str ) ;
//        System.out.println ( str_ans ) ;

        // Postfix_To_Infix Evolution -
//        String str_2 = "953+4*6/-" ;
//        int ch = Postfix_To_Infix ( str_2 ) ;
//        System.out.println ( " Answer : " + ch ) ;

        // Prefix To Infix Evolution -
//        String str_3 = "-9/*+5346" ;
//        int ch = Prefix_To_Infix ( str_3 ) ;
//        System.out.println ( " Answer : " + ch ) ;

//        Prefix To Postfix Evolution -
//        String str_3 = "-9/*+5346" ;
//        String str = Prefix_To_Postfix ( str_3 ) ;
//        System.out.println ( " Answer : " + str ) ;

//        Postfix To Prefix Evolution -
//        String str_2 = "953+4*6/-" ;
//        String str = Postfix_To_Prefix ( str_2 ) ;
//        System.out.println ( " Answer : " + str ) ;

//        Celebrity Problem - A Celebrity In A Party , Who Does'nt Know Anyone But Everyone Knows Him.
//        int [] [] arr = { { 0 , 1 , 0 } , { 0 , 0 , 0 } , { 0 , 1 , 0 } } ;
//        int m = 3 , n = 3 ;
//        int a = Celebrity_Problem ( arr , m ) ;
//        if (  a >= 0 ) System.out.println ( " Answer : " + a );
//        else System.out.println ( " No Celebrity " ) ;

        // Sliding Window Problem - Return Array Containing Maximum Number Of A Window
        int [] arr = { 1 , 3 , -1 , -3 , 5 , 3 , 6 , 7 } ;
        int k = 3 ;
        int [] ans = Sliding_Window ( arr , k )  ;
        for ( int i = 0 ; i < ans.length ; i ++ ) {
            System.out.print ( " " + ans [ i ] + " " ) ;
        }
        System.out.println () ;
    }
}

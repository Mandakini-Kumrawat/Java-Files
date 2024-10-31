import  java.util.Queue ;
import java.util.LinkedList ;
import java.util.Arrays ;
import java.util.Deque ;
import java.util.ArrayDeque ;
import java.util.Stack ;
public class Queue_2 {
//    // Implement Stack Using Queue -
//    public static class Stack_Of_Queue {
//        Queue < Integer > q = new LinkedList <> () ;
//
//        // Push Efficient - Push O(1) , Pop O(n) , Top O(n).
//        public void Push ( int data ) { // Push () - O ( 1 )
//            if ( q.size () == 0 ) q.add ( data ) ;
//            q.add ( data ) ;
//        }
//        public int Top () { // Top () - O ( n )
//            for ( int i = 1 ; i <= q.size() - 1 ; i ++ ) {
//                q.add ( q.remove () ) ;
//            }
//            int x = q.peek () ;
//            q.add ( q.remove () ) ;
//            return x ;
//        }
//        public int Pop () { // Pop () - O ( n )
//            for ( int i = 1 ; i <= q.size() - 1 ; i ++ ) {
//                q.add ( q.remove () ) ;
//            }
//            int x = q.remove () ; ;
//            return x ;
//        }
//        public boolean Empty () { // Empty () - O ( 1 )
//            if ( q.size () == 0 ) return true ;
//            else return false ;
//        }
//
//        // Pop/Top Efficient - Push O(n) , Pop O(1) , Top O(1).
//        public void Push ( int data ) { // Push () - O ( n )
//            if ( q.size () == 0 ) q.add ( data ) ;
//            q.add ( data ) ;
//            for ( int i = 1 ; i <= q.size () - 1 ; i ++ ) {
//                q.add ( q.remove () ) ;
//            }
//        }
//        public int Top () { // Top () - O ( 1 )
//            return q.peek () ;
//        }
//        public int Pop () { // Pop () - O ( 1 )
//            return q.remove () ;
//        }
//        public boolean Empty () { // Empty () - O ( 1 )
//            if ( q.size () == 0 ) return true ;
//            else return false ;
//        }
//    }
//    public static class Queue_Of_Stack {
//        Stack < Integer > st1 = new Stack <> () ;
//        Stack < Integer > st2 = new Stack <> () ;
//
//        // Add Efficient - Add O(1) , Remove O(n) , Peek O(n).
//        public void Add ( int data ) { // Add () - O ( 1 )
//            st1.push ( data ) ;
//        }
//        public int Peek () { // Pop () - O ( n )
//            while ( st1.size () > 1 ) st2.push ( st1.pop () ) ;
//            int x = st1.peek () ;
//            while ( st2.size () > 0 ) st1.push ( st2.pop () ) ;
//            return x ;
//        }
//        public int Remove () { // Remove () - O ( n )
//            while ( st1.size () > 1 ) st2.push ( st1.pop () ) ;
//            int x = st1.pop () ;
//            while ( st2.size () > 0 ) st1.push ( st2.pop () ) ;
//            return x ;
//        }
//        public boolean Empty () { // Empty () - O ( 1 )
//            if ( st1.size () == 0 ) return true ;
//            else return false ;
//        }
//
//        // Remove/Peek Efficient - Add O(n) , Remove O(1) , Peek O(1).
//        public void Add ( int data ) { // Add () - O ( n )
//            if ( st1.size () == 0 ) st1.push ( data ) ;
//            while ( st1.size () > 0 ) st2.push ( st1.pop () ) ;
//            st1.push ( data ) ;
//            while ( st2.size () > 0 ) st1.push ( st2.pop () ) ;
//        }
//        public int Peek () { // Pop () - O ( 1 )
//            return st1.peek () ;
//        }
//        public int Remove () { // Remove () - O ( 1 )
//            return st1.pop () ;
//        }
//        public boolean Empty () { // Empty () - O ( 1 )
//            if ( st1.size () == 0 ) return true ;
//            else return false ;
//        }
//    }
    public static int [] Negative_Integer_Window ( int [] arr , int n , int k ) {
        int [] result = new int [ n - k + 1 ] ; // 12 -1 -7 8 -15 30 16 28
        Queue < Integer > q = new LinkedList <> () ;
        for ( int i = 0 ; i < n ; i ++ ) {
            if ( arr [ i ] < 0 ) q.add ( i ) ; // q = 1 , 2 , 4
        }
        for ( int i = 0 ; i < n - k + 1 ; i ++ ) { // 0 1 2 3 4 5 // i = (5) 5,6,7
            if ( i > q.peek () ) q.remove () ;
            if ( q.size () > 0 && q.peek () <= i + k - 1 ) result [ i ] = arr [ q.peek () ] ;
            else result [ i ] = 0 ;
        }
        return result ; // result = (0),-1  (1),-1  (2),0  (3),0  (4),-15  (5),0
    }
    public static void main ( String [] args ) {
        // 1. Implement Stack Using Queue - 1. Push Efficient 2. Pop/Peek Efficient
        // 2. Implement Queue Using Stack - 1. Add Efficient 2. Remove/Peek Efficient

        // 3. First Negative Integer In Every Window Of Size K -
//        int [] arr = { 12 , -1 , -7 , 8 , -15 , 30 , 16 , 28 } ;
//        int k = 3 ;
//        int n = 8 ;
//        int [] ans = Negative_Integer_Window ( arr , n , k ) ;
//        for ( int i = 0 ; i < ans.length ; i ++ ) {
//            System.out.print ( " " + ans [ i ] + " " ) ;
//        }
//        System.out.println () ;

        // 4. Reorder Queue - Interleave The First Half Of The Queue with Second Half - Using Stack
        // Input - 1  2  3  4  5  6  7  8
        // Output - 1  5  2  6  3  7  4  8
        Queue < Integer > Q = new LinkedList <> () ;
        Q.add ( 1 ) ; Q.add ( 2 ) ; Q.add ( 3 ) ; Q.add ( 4 ) ; Q.add ( 5 ) ; Q.add ( 6 ) ;
        Q.add ( 7 ) ; Q.add ( 8 ) ; int n = Q.size () ;
        System.out.println ( " Original Queue   :   " + Q ) ;
        Stack < Integer > st = new Stack <> () ;
        for ( int i = 1 ; i <= n / 2 ; i ++ ) {
            st.push ( Q.remove () ) ;
        }
        while ( st.size () > 0 ) {
            Q.add ( st.pop () ) ;
        }
        for ( int i = 1 ; i <= n / 2 ; i ++ ) {
            st.push ( Q.remove () ) ;
        }
        for ( int i = 1 ; i <= n / 2 ; i ++ ) {
            Q.add ( st.pop () ) ;
            Q.add ( Q.remove () ) ;
        }
        while ( Q.size () > 0 ) {
            st.push ( Q.remove () ) ;
        }
        while ( st.size () > 0 ) {
            Q.add ( st.pop () ) ;
        }
        System.out.println ( " Result Queue   :   " + Q ) ;
    }
}

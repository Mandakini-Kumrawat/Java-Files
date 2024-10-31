//import java.util.Stack ;
//import java.util.Scanner ;
public class Stacks_1 {
//    public static void Display_Stack_Recursively ( Stack <Integer> st ) {
//        if ( st.size () == 0 ) return ;
//        int x = st.pop () ;
//        Display_Stack_Recursively ( st ) ;
//        System.out.print ( " " + x + " " ) ;
//        st.push ( x ) ;
//    }
//    public static void Insert_At_bottom ( Stack <Integer> st , int data ) {
//        Stack < Integer > temp = new Stack <> () ;
//        while ( st.size () > 0 ) {
//            temp.push ( st.pop () ) ;
//        }
//        st.push ( data ) ;
//        while ( temp.size () > 0 ) {
//            st.push ( temp.pop () ) ;
//        }
//    }
//    public static void Reverse_Stack_Recusively ( Stack < Integer > st ) {
//        if ( st.size () == 1 ) return ;
//        int top = st.pop () ;
//        Reverse_Stack_Recusively ( st ) ;
//        Insert_At_bottom ( st , top ) ;
//        return ;
//    }

    // For Array Implementation Of Stack -

    public static class Array_Stack {
        private int [] arr = new int [ 5 ] ;
        private int idx = 0 ;
        void Push ( int data ) {
            if ( IsFull () ) {
                System.out.println ( " Stack Is Full ! " ) ;
                return ;
            }
            arr [ idx ] = data ;
            idx ++ ;
        }
        int Peek () {
            if ( idx == 0 ) {
                System.out.println ( " Stack Is Empty ! " ) ;
                return 0 ;
            }
            return arr [ idx - 1 ] ;
        }
        int Pop () {
            if ( idx == 0 ) {
                System.out.println ( " Stack Is Empty ! " ) ;
                return 0 ;
            }
            int top = arr [ idx - 1 ] ;
            arr [ idx - 1 ] = 0 ;
            idx -- ;
            return top ;
        }
        void Display () {
            for ( int i = 0 ; i < idx ; i ++ ) {
                System.out.print ( " " + arr [ i ] + " " ) ;
            }
            System.out.println () ;
        }
        int Size () { return idx ; }
        boolean IsEmpty () {
            if ( Size () == 0 ) return true ;
            else return false ;
        }
        boolean IsFull () {
            if ( idx == arr.length ) return true ;
            else return false ;
        }
        int Capacity () { return arr.length ; }
    }

//    For Singly Linked List Implementation Of Stack -

    public static class Node {
        int data ;
        Node next ;
        Node ( int data ) { this.data = data ; }
    }
    public static class LL_Stack {
        private Node head = null ;
        private int size = 0 ;
        void Push ( int data ) {
            Node temp = new Node ( data ) ;
            temp.next = head ;
            head = temp ;
            size ++ ;
        }
        int Pop () {
            if ( head == null ) {
                System.out.println ( " Stack Is Empty ! " ) ;
                return 0 ;
            }
            int x = head.data ;
            head = head.next ;
            size -- ;
            return x ;
        }
        int Peek ( ) {
            if ( head == null ) {
                System.out.println ( " Stack Is Empty ! " ) ;
                return 0 ;
            }
            return head.data ;
        }
        void Display_2 ( Node h ) {
            if ( h.next == null ) return ;
            Display_2 ( h.next ) ;
            System.out.print ( " " + h.data + " " ) ;
            return ;
        }
        void Display_1 () {
            Display_2 ( head ) ;
            System.out.println () ;
        }
        int Size () { return size ; }
        boolean IsEmpty () {
            if ( size == 0 ) return true ;
            else return false ;
        }
    }
    public static void main ( String [] args ) {
//        Scanner scan = new Scanner ( System.in ) ;
//        Stack < Integer > s = new Stack <> () ;
//        // push () - To Push Element Into Stack -
//        int n ;
//        System.out.println ( " Number Of Elements : " ) ;
//        n = scan.nextInt () ;
//        System.out.println ( " Enter Elemnets : " ) ;
//        for ( int i = 0 ; i < n ; i ++ ) {
//            int x = scan.nextInt () ;
//            st.push ( x ) ;
//        }
//        System.out.println ( st ) ;

        // peek () - To Get The Top Of Stack -
//        System.out.println ( " Peek : " + st.peek () ) ;
//        System.out.println ( st ) ;

        // pop () - To Pop The Element Out From The Stack -
//        st.pop () ;
//        System.out.println ( st ) ;

        // size () - To Get The Size Of The Stack -
//        System.out.println ( " Size : " + st.size () ) ;
//        while ( st.size () > 1 ) {
//            st.pop () ;
//        }
//        System.out.println ( " Peek : " + st.peek () ) ;

//        st.push ( 34 ) ;
//        st.push ( 12 ) ;
//        st.push ( 65 ) ;
//        st.push ( 6 ) ;

        // isEmpty () - Gives True , If Stack Is Empty. False If Stack
//        System.out.println ( " Empty : " + st.isEmpty () ) ;
//        System.out.println ( st ) ;

//        1. Copy One Stack st to Another Stack Copied -
//        Stack < Integer > temp = new Stack <> () ;
//        while ( st.size () > 0 ) {
//            temp.push ( st.pop () ) ;
//        }
//        Stack < Integer > copied = new Stack <> () ;
//        while ( temp.size () > 0 ) {
//            copied.push ( temp.pop () ) ;
//        }
//        System.out.println ( copied ) ;

//        2. Insert At Index Of The Stack -
//        System.out.println ( " Insert : " ) ;
//        int insert = scan.nextInt () ;
//        System.out.println ( " Index : " ) ;
//        int index = scan.nextInt () ;
//        Stack < Integer > temp = new Stack <> () ;
//        while ( st.size () > index ) {
//            temp.push ( st.pop () ) ;
//        }
//        st.push ( insert ) ;
//        while ( temp.size () > 0 ) {
//            st.push ( temp.pop () ) ;
//        }
//        System.out.println ( st ) ;

//        3. Display Stack Recursively -
//        Display_Stack_Recursively ( st ) ;

//        4. Insert Data At The Bottom Of The Stack -
//        Insert_At_bottom ( st , 100 ) ;
//        System.out.println ( st ) ;

//        5. Reverse Stack Recursively -
//        Reverse_Stack_Recusively ( st ) ;
//        System.out.println ( st ) ;

//        After Implementing Stack Through Array -
        LL_Stack st = new LL_Stack ( ) ;
        st.Push ( 3 ) ;
        st.Display_1 () ;
        st.Push ( 1 ) ;
        st.Display_1 () ;
        st.Push ( 8 ) ;
        st.Display_1 () ;
        st.Push ( 5 ) ;
        st.Display_1 () ;
        st.Push ( 2 ) ;
        st.Display_1 () ;
        System.out.println ( " Peek : " + st.Peek () ) ;
        st.Pop () ;
        st.Display_1 () ;
        st.Push ( 2 ) ;
        st.Push ( 12 ) ;
        st.Display_1 () ;
    }
}

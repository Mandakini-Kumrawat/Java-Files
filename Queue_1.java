import java.util.LinkedList;
import java.util.Queue ;
import java.util.Deque ;
public class Queue_1 {
    // Array Implementation Of Queue -
//    public static class Array_Queue {
//        int front = -1 ;
//        int rear = -1 ;
//        int Size = 0 ;
//        int [] arr = new int [ 50 ] ;
//        public void Add ( int data ) {
//            if ( rear == arr.length - 1 ) {
//                System.out.println ( " Queue Is Full ! " ) ;
//                return ;
//            }
//            if ( front == -1 ) {
//                arr [ 0 ] = data ;
//                front = rear = 0 ;
//            } else {
//                arr [ ++ rear ] = data ;
//            }
//            Size ++ ;
//        }
//        public int Remove () {
//            if ( front == -1 ) {
//                System.out.println ( " Queue Is Empty ! " ) ;
//                return front ;
//            }
//            front ++ ;
//            Size -- ;
//            return arr [ front - 1 ] ;
//        }
//        public int Peek () {
//            if ( front == -1 ) {
//                System.out.println ( " Queue Is Empty ! " ) ;
//                return front ;
//            }
//            return arr [ front ] ;
//        }
//        public boolean Empty () {
//            if ( Size == 0 ) return true ;
//            else return false ;
//        }
//        public boolean Full () {
//            if ( Size == arr.length ) return true ;
//            else return false ;
//        }
//        public int size () {
//            return Size ;
//        }
//        public void Display () {
//            if ( Size == 0 ) {
//                System.out.println ( " Queue Is Empty ! " ) ;
//            } else {
//                for ( int i = front ; i <= rear ; i ++ ) {
//                    System.out.print ( " " + arr [ i ] + " " ) ;
//                }
//                System.out.println () ;
//            }
//        }
//    }

    // Singely Linked List Of Queue -
//    public static class Node {
//        int data ;
//        Node next ;
//        Node ( int data ) { this.data = data ; }
//    }
//    public static class LL_Queue {
//        Node head = null ;
//        Node tail = null ;
//        int Size = 0 ;
//        public void Add ( int data ) {
//            Node temp = new Node ( data ) ;
//            if ( Size == 0 ) {
//                head = tail = temp ;
//            } else {
//                tail.next = temp ;
//                tail = temp ;
//            }
//            Size ++ ;
//        }
//        public int Peek () {
//            if ( Size == 0 ) {
//                System.out.println ( " Queue Is Empty ! " ) ;
//                return -1 ;
//            }
//            return head.data ;
//        }
//        public int Remove () {
//            if ( Size == 0 ) {
//                System.out.println ( " Queue Is Empty ! " ) ;
//                return -1 ;
//            }
//            int x = head.data ;
//            head = head.next ;
//            Size -- ;
//            return x ;
//        }
//        public void Display () {
//            if ( Size == 0 ) System.out.println ( " Queue Is Empty ! " ) ;
//            Node temp = head ;
//            while ( temp != null ) {
//                System.out.print ( " " + temp.data + " " ) ;
//                temp = temp.next ;
//            }
//            System.out.println () ;
//        }
//        public boolean Empty () {
//            if ( Size == 0 ) return true ;
//            else return false ;
//        }
//        public int size () {
//            return Size ;
//        }
//    }

    // Circular Queue Array Implementation -
//    public static class Array_CQueue {
//        int front = -1 ;
//        int rear = -1 ;
//        int [] arr = new int [ 8 ] ;
//        int Size = 0 ;
//        public void Add ( int data ) throws Exception {
//            if ( Size == arr.length ) {
//                throw new Exception ( "Queue Is Full ! " ) ;
//            } else if ( Size == 0 ) {
//                front = rear = 0 ;
//                arr [ 0 ] = data ;
//            } else if ( rear < arr.length - 1 ){
//                arr [ ++ rear ] = data ;
//            } else if ( rear == arr.length - 1 ) {
//                rear = 0 ;
//                arr [ 0 ] = data ;
//            }
//            Size ++ ;
//        }
//        public int Remove () throws Exception {
//            if ( Size == 0 ) {
//                throw new Exception ( " Queue Is Empty ! " ) ;
//            } else {
//                int x = arr [ front ] ;
//                if ( front == arr.length - 1 ) front = 0 ;
//                else front ++ ;
//                Size -- ;
//                return x ;
//            }
//        }
//        public int Peek () throws Exception {
//            if ( Size == 0 ) throw new Exception ( " Queue Is Empty ! " ) ;
//            else return arr [ front ] ;
//        }
//        public boolean Empty () {
//            if ( Size == 0 ) return true ;
//            else return false ;
//        }
//        public void Display () {
//            if ( Size == 0 ) {
//                System.out.println ( " Queue Is Empty ! " ) ;
//            } else {
//                if ( front <= rear ) {
//                    for ( int i = front ; i <= rear ; i ++ ) {
//                        System.out.print ( " " + arr [ i ] + " " ) ;
//                    }
//                } else {
//                    for ( int i = front ; i < arr.length ; i ++ ) {
//                        System.out.print ( " " + arr [ i ] + " " ) ;
//                    }
//                    for ( int i = 0 ; i <= rear ; i ++ ) {
//                        System.out.print ( " " + arr [ i ] + " " ) ;
//                    }
//                }
//            } System.out.println () ;
//        }
//        public int size () throws Exception {
//            if ( Size == 0 ) throw new Exception ( " Queue Is Empty ! " ) ;
//            else return Size ;
//        }
//    }
    public static void main(String[] args) throws Exception {
        // Array Implementation Of Queue -
//        Array_Queue aq = new Array_Queue () ;
//        aq.Display () ;
//        aq.Add ( 33 ) ;
//        aq.Add ( 14 ) ;
//        aq.Add ( 75 ) ;
//        aq.Add ( 41 ) ;
//        aq.Add ( 88 ) ;
//        System.out.println ( " Size : " + aq.size () ) ;
//        aq.Display () ;
//        aq.Remove () ;
//        aq.Display () ;
//        System.out.println ( " Peek : " + aq.Peek () ) ;
//        System.out.println ( " Size : " + aq.size () ) ;

        // Singely Linked List Implementation Of Queue -
//        LL_Queue llq = new LL_Queue () ;
//        llq.Display () ;
//        llq.Add ( 33 ) ;
//        llq.Add ( 14 ) ;
//        llq.Add ( 75 ) ;
//        llq.Add ( 41 ) ;
//        llq.Add ( 88 ) ;
//        System.out.println ( " Size : " + llq.size () ) ;
//        llq.Display () ;
//        llq.Remove () ;
//        llq.Display () ;
//        System.out.println ( " Peek : " + llq.Peek () ) ;
//        System.out.println ( " Size : " + llq.size () ) ;

        // Circular Queue Array Implementation -
//        Array_CQueue acq = new Array_CQueue () ;
//        acq.Display () ;
//        acq.Add ( 33 ) ;
//        acq.Add ( 14 ) ;
//        acq.Add ( 75 ) ;
//        acq.Add ( 41 ) ;
//        acq.Add ( 88 ) ;
//        System.out.println ( " Size : " + acq.size () ) ;
//        acq.Display () ;
//        acq.Remove () ;
//        acq.Display () ;
//        System.out.println ( " Peek : " + acq.Peek () ) ;
//        System.out.println ( " Size : " + acq.size () ) ;
//        acq.Remove () ; acq.Remove () ; acq.Remove () ; acq.Remove () ;
//        System.out.println ( " Size : " + acq.size () ) ;

        // Deque In STL - Standard Template Library -
        Deque < Integer > dq = new LinkedList <> () ;
        System.out.println ( " Size : " + dq.size () ) ;
        dq.add ( 67 ) ;
        dq.add ( 61 ) ;
        dq.add ( 85 ) ;
        dq.add ( 45 ) ;
        dq.add ( 50 ) ;
        System.out.println ( " Deque : " + dq ) ;
        System.out.println ( " Size : " + dq.size () ) ;
        dq.addLast ( 30 ) ;
        dq.addFirst ( 120 ); ;
        System.out.println ( " Deque : " + dq ) ;
    }
}
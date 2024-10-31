public class Singly_Linked_List_1 {
    public static class Node {
        int data ;
        Node next ;
        Node ( int data ) {
            this.data = data ;
        }
    }
    public static class linkedlist {
        Node head = null ;
        Node tail = null ;
        int size = 0 ;
        void Insert_At_Tail ( int data ) {
            Node temp = new Node ( data ) ;
            if ( head == null ) {
                head = temp ;
                tail = temp ;
            }
            tail.next = temp ;
            tail = temp ;
            size ++ ;
        }
        void Insert_At_Head ( int data ) {
            Node temp = new Node ( data ) ;
            if ( head == null ) {
                head = temp ;
                tail = temp ;
            }
            temp.next = head ;
            head = temp ;
            size ++ ;
        }
        void Insert_At_Index ( int index , int data ){
            Node New_Node = new Node ( data ) ;
            Node temp = head ;
            if ( index == size ) {
                Insert_At_Tail ( data ) ;
                return ;
            } else if ( index == 0 ) {
                Insert_At_Head ( data ) ;
                return ;
            } else if ( index < 0 || index > size ) {
                System.out.println ( " Wrong Index ! " ) ;
            } else {
                for (int i = 1; i <= index - 1; i++) {
                    temp = temp.next;
                }
                New_Node.next = temp.next;
                temp.next = New_Node;
            }
            size ++ ;
        }
        int Get_At ( int index ) {
             if ( index < 0 || index > size ) {
                System.out.println ( " Wrong Index ! " ) ;
                return - 1 ;
            }
            Node temp = head ;
            for ( int i = 1 ; i <= index ; i ++ ) {
                temp = temp.next ;
            }
            return temp.data ;
        }
        void Delete_At_Index ( int index ) {
            if ( index == 0 ) {
                head = head.next;
                size--;
            }
            Node temp = head ;
            for ( int i = 1 ; i < index - 1 ; i ++ ) {
                temp = temp.next ;
            }
            temp.next = temp.next.next ;
            if ( index == size ) tail = temp ;
            size -- ;
        }
        void Display () {
            Node temp = head ;
            while ( temp != null ) {
                System.out.print ( " " + temp.data + " " ) ;
                temp = temp.next ;
            }
            System.out.println () ;
        }
    }
    public static void Display_Recursive ( Node head ) {
        if ( head == null ) return ;
        System.out.print ( " " + head.data + " " ) ;
        Display_Recursive ( head.next ); ;
    }
    public static void Display_Iterative ( Node head ) {
        Node temp = head ;
        while ( temp != null ) {
            System.out.print ( " " + temp.data + " " ) ;
            temp = temp.next ;
        }
        System.out.println () ;
    }
    public static int Length_Iterative ( Node head ) {
        int count = 0 ;
        while ( head != null ) {
            count ++ ;
            head = head.next ;
        }
        return count ;
    }
    public static int Length_Recursive ( Node head ) {
        int count = 0 ;
        if ( head == null ) return 0 ;
        count ++ ;
        return count += Length_Recursive ( head.next ) ;
    }
    public static void main ( String [] args ) {
        linkedlist ll = new linkedlist ( ) ;
        ll.Insert_At_Tail ( 5 ) ;
        ll.Insert_At_Tail ( 1 ) ;
        ll.Insert_At_Tail ( 8 ) ;
        ll.Insert_At_Tail ( 3 ) ;
        ll.Display () ;
        System.out.println ( " Size : " + ll.size ) ;
        ll.Insert_At_Head ( 14 ) ;
        ll.Display () ;
        ll.Insert_At_Index ( 3 , 11 ) ;
        ll.Display () ;
        System.out.println ( " Data : " + ll.Get_At ( 4 ) ) ;
        ll.Delete_At_Index ( 0 ) ;
        ll.Display () ;
        System.out.println ( " Tail : " + ll.tail.data ) ;
        System.out.println ( " Head : " + ll.head.data ) ;
    }
}

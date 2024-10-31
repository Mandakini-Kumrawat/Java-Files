public class Doubly_Linked_List {
    // Another Node Class With Child Pointer -
    public static class Node1 {
        int data ;
        Node1 next ;
        Node1 prev ;
        Node1 child ;
        Node1 ( int data ) { this.data = data ; }
    }
    public static class Node {
        int data ;
        Node next ;
        Node prev ;
        Node ( int data ) { this.data = data ; }
    }
    public static class DLL {
        Node head = null ;
        Node tail = null ;
        int size = 0 ;
        void Display_From_Head ( ) {
            Node temp = head ;
            while ( temp != null ) {
                System.out.print ( " " + temp.data + " " ) ;
                temp = temp.next ;
            }
            System.out.println () ;
        }
        void Display_From_Tail ( ) {
            Node temp = tail ;
            while ( temp != null ) {
                System.out.print ( " " + temp.data + " " ) ;
                temp = temp.prev ;
            }
            System.out.println () ;
        }
        void Insert_At_Tail ( int data ) {
            Node temp = new Node ( data ) ;
            if ( head == null && tail == null ) {
                head = temp ;
                tail = temp ;
            }
            tail.next = temp ;
            temp.prev = tail ;
            tail = temp ;
            size ++ ;
        }
        void Insert_At_Head ( int data ) {
            Node temp = new Node ( data ) ;
            if ( head == null && tail == null ) {
                head = temp ;
                tail = temp ;
            }
            temp.next = head ;
            head.prev = temp ;
            head = temp ;
            size ++ ;
        }
        void Insert_At_Index ( int index , int data ) {
            Node New_Node = new Node ( data ) ;
            Node temp = head ;
            if ( index == 0 ) {
                Insert_At_Head ( data ) ;
                return ;
            } else if ( index == size ) {
                Insert_At_Tail ( data ) ;
                return ;
            } else if ( index < 0 || index > size ) {
                System.out.println ( " Wrong Index ! " ) ;
            } else {
                for ( int i = 1 ; i < index - 1 ; i ++ ) {
                    temp = temp.next ;
                }
                New_Node.next = temp.next ;
                temp.next.prev = New_Node ;
                New_Node.prev = temp ;
                temp.next = New_Node ;
                size ++ ;
            }
        }
        int Get_At ( int index ) {
            if ( index < 0 || index > size ) {
                System.out.println ( " Wrong Index ! " ) ;
                return 0 ;
            }
            Node temp = head ;
            for ( int i = 1 ; i < index ; i ++ ) {
                temp = temp.next ;
            }
            return temp.data ;
        }
        void Delete_At_Index ( int index ) {
            if ( index == 0 ) {
                head = head.next ;
                head.prev = null ;
                size -- ;
            }
            Node temp = head ;
            for ( int i = 1 ; i < index - 1 ; i ++ ) {
                temp = temp.next ;
            }
            temp.next = temp.next.next ;
            if ( temp.next == null ) tail = temp ;
            else temp.next.prev = temp ;
            size -- ;
        }
    }
    public static Node1 Flatten_List ( Node1 head ) {
        Node1 temp = head ;
        while ( temp != null ) {
            Node1 t = temp.next ;
            if ( temp.child != null ) {
                Node1 c = Flatten_List ( temp.child ) ;
                temp.next = c ;
                c.prev = temp ;
                while ( c.next != null ) c = c.next ;
                c.next = t ;
                if ( t != null ) t.prev = c ;
            } temp.child = null ; temp = t ;
        }
        return head ;
    }
    public static void main ( String [] args ) {
//        DLL dll = new DLL () ;
//        dll.Insert_At_Tail ( 2 ) ;
//        dll.Insert_At_Tail ( 1 ) ;
//        dll.Insert_At_Tail ( 4 ) ;
//        dll.Insert_At_Tail ( 3 ) ;
//        dll.Insert_At_Tail ( 5 ) ;
//        dll.Display_From_Head ( ) ;
//        System.out.println ( " Size : " + dll.size + " Head : " + dll.head.data ) ;
//        dll.Insert_At_Head ( 34  ) ;
//        dll.Display_From_Head ( ) ;
//        System.out.println ( " Size : " + dll.size + " Head : " + dll.head.data ) ;
//        dll.Insert_At_Index ( 3 , 78 ) ;
//        dll.Display_From_Head ( ) ;
//        System.out.println ( " Size : " + dll.size + " Head : " + dll.head.data ) ;
//        System.out.println ( " Data At Index : " + dll.Get_At ( 4 ) ) ;
//        dll.Delete_At_Index ( 5 ) ;
//        dll.Display_From_Head ( ) ;
//        System.out.println ( " Size : " + dll.size + " Head : " + dll.head.data ) ;

//        Flatten A Multilevel Doubly Linked List -
//        1    2    3    4    5    6
//                  7    8    9   10
//                       11   12
        Node1 a = new Node1 ( 1 ) ;
        Node1 b = new Node1 ( 2 ) ;
        Node1 c = new Node1 ( 3 ) ;
        Node1 d = new Node1 ( 4 ) ;
        Node1 e = new Node1 ( 5 ) ;
        Node1 f = new Node1 ( 6 ) ;
        Node1 g = new Node1 ( 7 ) ;
        Node1 h = new Node1 ( 8 ) ;
        Node1 i = new Node1 ( 9 ) ;
        Node1 j = new Node1 ( 10 ) ;
        Node1 k = new Node1 ( 11 ) ;
        Node1 l = new Node1 ( 12 ) ;
        a.next = b ; b.next = c ; c.next = d ; d.next = e ; e.next = f ; g.next = h ; h.next = i ;
        i.next = j ; k.next = l ;
        l.prev = k ; j.prev = i ; i.prev = h ; h.prev = g ; f.prev = e ; e.prev = d ; d.prev = c ;
        c.prev = b ; b.prev = a ;
        c.child = g ; h.child = k ;
        Node1 Flatten = Flatten_List ( a ) ;
        Node1 temp = Flatten ;
        while ( temp != null ) {
            System.out.print ( " " + temp.data + " " ) ;
            temp = temp.next ;
        }
        System.out.println () ;
    }
}

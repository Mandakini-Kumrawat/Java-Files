public class Circular_Linked_List {
    // Singly Circular Linked List Node - SCN
    public static class SCN {
        int data ;
        SCN next ;
        SCN ( int data ) { this.data = data ; }
    }
    public static class SCLL {
        SCN head = null ;
        SCN tail = null ;
        int size = 0 ;
        void Display_SC () {
            SCN temp = head ;
            while ( temp.next != head ) {
                System.out.print ( " " + temp.data + " " ) ;
                temp = temp.next ;
            }
            System.out.println () ;
        }
    }

    // Doubly Circular Linked List Node - DCN
    public static class DCN {
        int data ;
        DCN next ;
        DCN prev ;
        DCN ( int data ) { this.data = data ; }
    }
    public static class DCLL {
        DCN head = null ;
        DCN tail = null ;
        int size ;
    }
    public static void dis ( SCN h ) {
        SCN temp = h.next ;
        while ( temp.next != h ) {
            System.out.print ( " " + temp.data + " " ) ;
            temp = temp.next ;
        }
        System.out.println ( ) ;
    }
    public static void main ( String [] args ) {
        SCN a = new SCN ( 3 ) ;
        SCN b = new SCN ( 2 ) ;
        SCN c = new SCN ( 5 ) ;
        SCN d = new SCN ( 9 ) ;
        d.next = a ;
        dis ( a ) ;
    }
}

import java.awt.*;

public class Singly_Linked_List_2 {
    public static class Node {
        int data ;
        Node next ;
        Node ( int data ) {
            this.data = data ;
        }
    }
    public static class Node1 {
        int data ;
        Node random ;
        Node next ;
        Node1 ( int data ) { this.data = data ; }
    }
    public static class LinkedList {
        Node head = null ;
        Node tail = null ;
        int size = 0 ;
        void Display () {
            Node temp = head ;
            while ( temp != null ) {
                System.out.print ( " " + temp.data + " " ) ;
                temp = temp.next ;
            }
            System.out.println () ;
        }
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
        void Insert_At_Index ( int index , int data ) {
            Node New_Node = new Node ( data ) ;
            Node temp = head ;
            if ( index == 0 ) {
                Insert_At_Head ( data ) ; return ;
            } else if ( index == size ) {
                Insert_At_Tail ( data ) ; return ;
            } else {
                for ( int i = 1 ; i < index - 1 ; i ++ ) {
                    temp = temp.next ;
                }
                New_Node.next = temp.next ;
                temp.next = New_Node ;
                size ++ ;
            }
        }
        int Get_Data ( int index ) {
            if ( index < 0 || index > size ) {
                System.out.println ( " Wrong Index ! " ) ;
                return - 1 ;
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
                size -- ;
            }
            Node temp = head ;
            for ( int i = 1 ; i < index - 1 ; i ++ ) {
                temp = temp.next ;
            }
            temp.next = temp.next.next ;
            if ( index == size ) tail = temp ;
            size -- ;
        } }
        public static Node Nth_Node_From_Last ( Node head , int index ) {
//            int size = 0 ;
//            Node temp = head ;
//            while ( temp != null ) {
//                size ++ ;
//                temp = temp.next ;
//            }
//            temp = head ;
//            for ( int i = 1 ; i <= ( size - index + 1 ) - 1 ; i ++ ) {
//                temp = temp.next ;
//            }
//            return temp ;

            // With Only One Traversal - Slow And Fast Pointers - Turtle And Rabbit
            Node fast = head ;
            Node slow = head ;
            for ( int i = 1 ; i <= index ; i ++ ) {
                fast = fast.next ;
            }
            while ( fast != null ) {
                slow = slow.next ;
                fast = fast.next ;
            }
            return slow ;
        }
        public static Node Remove_Nth_Node_From_Last ( Node head , int index ) {
            Node slow = head ;
            Node fast = head ;
            for ( int i = 1 ; i <= index ; i ++ ) {
                fast = fast.next ;
            }
            if ( fast == null ) { head = head.next ; return head ; }
            while ( fast.next != null ) {
                slow = slow.next ;
                fast = fast.next ;
            }
            slow.next = slow.next.next ;
            return head ;
        }
        public static Node Intersection ( Node head1 , Node head2 ) {
            Node temp1 = head1 ;
            Node temp2 = head2 ;
            int size1 = 0 , size2 = 0 ;
            while ( temp1 != null ) {
                size1 ++ ;
                temp1 = temp1.next ;
            }
            while ( temp2 != null ) {
                size2 ++ ;
                temp2 = temp2.next ;
            }
            temp1 = head1 ;
            temp2 = head2 ;
            if ( size1 > size2 ) {
                for ( int i = 1 ; i <= size1 - size2 ; i ++ ) {
                    temp1 = temp1.next ;
                }
            } else {
                for ( int i = 1 ; i <= size2 - size1 ; i ++ ) {
                    temp2 = temp2.next ;
                }
            }
            while ( temp1 != temp2 ) {
                temp1 = temp1.next ;
                temp2 = temp2.next ;
            }
            return temp1 ;
        }
        public static Node Middle_Node ( Node head ) {
            Node slow = head ;
            Node fast = head ;
            while ( fast != null && fast.next != null ) {
                fast = fast.next.next ;
                slow = slow.next ;
            }
            return slow ;
        }
        public static void Delete_Middle_Node ( Node head ) {
            if ( head.next == null ) return ;
            Node slow = head ;
            Node fast = head ;
            while ( fast.next.next != null && fast.next.next.next != null ) {
                fast = fast.next.next ;
                slow = slow.next ;
            }
            slow.next = slow.next.next ;
        }
        public static boolean Cycle_List ( Node head ) {
            if ( head == null || head.next == null ) return false ;
            Node slow = head ;
            Node fast = head ;
            while ( fast != null ) {
                if ( slow == null ) return false ;
                slow = slow.next ;
                if ( fast.next == null ) return false ;
                fast = fast.next.next ;
                if ( fast == slow ) return true ;
            }
            return false ;
        }
        public static Node Cycle_List_Node ( Node head ) {
            Node fast = head ;
            Node slow = head ;
            while ( fast != null ) {
                slow = slow.next ;
                fast = fast.next.next ;
                if ( slow == fast ) break ;
            }
            Node temp = head ;
            while ( temp != slow ) {
                temp = temp.next ;
                slow = slow.next ;
            }
            return temp ;
        }
        public static Node Merge_Two_List_1 ( Node head1 , Node head2 ) {
            Node temp1 = head1 ;
            Node temp2 = head2 ;
            Node head = new Node ( 100 ) ;
            Node temp = head ;
            while ( temp1 != null && temp2 != null ) {
                if ( temp1.data < temp2.data ) {
                    Node New_Node = new Node ( temp1.data ) ;
                    temp.next = New_Node ;
                    temp = temp.next ;
                    temp1 = temp1.next ;
                } else if ( temp2.data < temp1.data ) {
                    Node New_Node = new Node ( temp2.data ) ;
                    temp.next = New_Node ;
                    temp = temp.next ;
                    temp2 = temp2.next ;
                } else {
                    Node New_Node_1 = new Node ( temp1.data ) ;
                    temp.next = New_Node_1 ;
                    temp = temp.next ;
                    Node New_Node_2 = new Node ( temp2.data ) ;
                    temp.next = New_Node_2 ;
                    temp = temp.next ;
                    temp1 = temp1.next ;
                    temp2 = temp2.next ;
                }
            }
            if ( temp1 == null ) temp.next = temp2 ;
            else temp.next = temp1 ;
            return head = head.next ;
        }
        public static Node Merge_Two_List_2 ( Node head1 , Node head2 ) {
            Node temp1 = head1 ;
            Node temp2 = head2 ;
            Node head = new Node ( 100 ) ;
            Node t = head ;
            while ( temp1 != null && temp2 != null ) {
                if ( temp1.data < temp2.data ) {
                    t.next = temp1 ;
                    t = temp1 ;
                    temp1 = temp1.next ;
                } else {
                    t.next = temp2 ;
                    t = temp2 ;
                    temp2 = temp2.next ;
                }
            }
            if ( temp1 == null ) t.next = temp2 ;
            else t.next = temp1 ;
            return head = head.next ;
        }
        public static Node Even_Odd_List ( Node head ) {
            Node temp = head ;
            Node Even = new Node ( 0 ) ;
            Node et = Even ;
            Node Odd = new Node ( -1 ) ;
            Node ot = Odd ;
            while ( temp != null ) {
                if ( temp.data % 2 == 0 ) {
                    et.next = temp ;
                    et = et.next ;
                } else {
                    ot.next = temp ;
                    ot = ot.next ;
                }
                temp = temp.next ;
            }
            Odd = Odd.next ;
            Even = Even.next ;
            ot.next = Even ;
            return Odd ;
        }
        public static Node Remove_Duplicate_Nodes ( Node head ) {
            Node temp = head ;
            Node t = head ;
            while ( temp != null ) {
                if ( temp.next == null ) {
                    if ( temp.data == t.data )  {
                        t.next = null ;
                        return t = head ;
                    }
                    else {
                        t.next = temp ;
                        t = temp ;
                        return t = head ;
                    }
                }
                else if ( temp.next.data == temp.data ) {
                    temp = temp.next ;
                } else {
                    temp = temp.next ;
                    t.next = temp ;
                    t = temp ;
                }
            }
            return t = head ;
        }
        public static Node Reverse_List_Recursively ( Node head ) {
            if ( head.next == null ) return head ;
            Node h = Reverse_List_Recursively ( head.next ) ;
            Node t = head ;
            t.next.next = t ;
            t.next = null ;
            return h ;
        }
        public static Node Reverse_List_Iteratively ( Node head ) {
            Node prev = null ;
            Node curr = head ;
            Node Next = prev ;
            while ( curr != null ) {
                Next = curr.next ;
                curr.next = prev ;
                prev = curr ;
                curr = Next ;
            }
            return prev ;
        }
        public static boolean Palindrome ( Node head ) {
            Node slow = head ;
            Node fast = head ;
            while ( fast.next != null && fast.next.next != null  ) {
                slow = slow.next ;
                fast = fast.next.next ;
            }
            Node temp2 = Reverse_List_Iteratively ( slow.next ) ;
            slow.next = temp2 ;
            Node temp1 = head ;
            while ( temp2 != null ) {
                if ( temp1.data != temp2.data ) return false ;
                temp2 = temp2.next ;
                temp1 = temp1.next ;
            }
            return true ;
        }
        public static int Maximum_Twin_Sum ( Node head ) {
            Node slow = head ;
            Node fast = head ;
            while ( fast.next.next != null ) {
                slow = slow.next ;
                fast = fast.next.next ;
            }
            Node temp2 = Reverse_List_Iteratively ( slow.next ) ;
            slow.next = temp2 ;
            Node temp1 = head ;
            int max = Integer.MIN_VALUE ;
            int val1 = 0 , val2 = 0 ;
            while ( temp2 != null ) {
                int sum = temp1.data + temp2.data ;
                if ( sum >= max ) {
                        max = sum ;
                        val1 = temp1.data ;
                        val2 = temp2.data ;
                }
                temp1 = temp1.next ;
                temp2 = temp2.next ;
            }
            System.out.println ( " Values : " + val1 + " + " + val2 ) ;
            return max ;
        }
        public static Node Odd_Even_Indices ( Node head ) {
            Node temp = head ;
            Node Even = new Node ( 0 ) ;
            Node et = Even ;
            Node Odd = new Node ( -1 ) ;
            Node ot = Odd ;
            while ( temp != null ) {
                ot.next = temp ;
                temp = temp.next ;
                ot = ot.next ;
                et.next = temp ;
                if ( temp == null ) break ;
                temp = temp.next ;
                et = et.next ;
            }
            Even = Even.next ;
            Odd = Odd.next ;
            ot.next = Even ;
            return Odd ;
        }
        public static void main ( String [] args ) {
            LinkedList ll = new LinkedList ( ) ;
            ll.Insert_At_Tail ( 1 ) ;
            ll.Insert_At_Tail ( 1 ) ;
            ll.Insert_At_Tail ( 2 ) ;
            ll.Insert_At_Tail ( 2 ) ;
            ll.Insert_At_Tail ( 2 ) ;
            ll.Insert_At_Tail ( 3 ) ;
            ll.Insert_At_Tail ( 4 ) ;
            ll.Insert_At_Tail ( 5 ) ;
            ll.Insert_At_Tail ( 5 ) ;
//            ll.Display () ;

//            Node Nth = Nth_Node_From_Last ( ll.head , 3 ) ;

//            System.out.println ( " Nth Data - " + Nth.data ) ;
//            ll.head = Remove_Nth_Node_From_Last ( ll.head , 9 ) ;
//            ll.Display () ;

//            Find The Intersection Of Two Lists - ll & lli

//            LinkedList lli = new LinkedList () ;
//            lli.Insert_At_Tail ( 23 ) ;
//            lli.Insert_At_Tail ( 72 ) ;
//            lli.Insert_At_Tail ( 5 ) ;
//            lli.Insert_At_Tail ( 89 ) ;
//            lli.Insert_At_Tail ( 10 ) ;
//            lli.Insert_At_Tail ( 44 ) ;
//            lli.Insert_At_Tail ( 64 ) ;
//            lli.head.next.next.next.next = ll.head.next.next.next.next.next.next.next ;
//            lli.Display () ;
//            Node inter = Intersection ( ll.head , lli.head ) ;
//            System.out.println ( " Intersection : " + inter.data ) ;

//            Find The Middle Node - Slow And Fast Pointer Aapproanch
//            Node middle = Middle_Node ( ll.head ) ;
//            System.out.println ( " Middle Node : " + middle.data ) ;
//            System.out.println ( " After Deleting Middle Node : " ) ;
//            Delete_Middle_Node ( ll.head ) ;
//            ll.Display () ;

//            Find The start Of A Cycle Linked List
//            ll.tail.next = ll.head.next.next.next ;
//            System.out.println ( " Cycle List : " + Cycle_List ( ll.head ) ) ;
//            Node cycle = Cycle_List_Node ( ll.head ) ;
//            System.out.println ( " Cycle List Node : " + cycle.data ) ;

//            Merge Two Sorted Lists -
//            System.out.println ( " First List : " ) ;
//            LinkedList list_1 = new LinkedList () ;
//            list_1.Insert_At_Tail ( 1 ) ;
//            list_1.Insert_At_Tail ( 3 ) ;
//            list_1.Insert_At_Tail ( 5 ) ;
//            list_1.Insert_At_Tail ( 7 ) ;
//            list_1.Insert_At_Tail ( 9 ) ;
//            list_1.Display () ;
//            System.out.println ( " Second List : " ) ;
//            LinkedList list_2 = new LinkedList () ;
//            list_2.Insert_At_Tail ( 2 ) ;
//            list_2.Insert_At_Tail ( 4 ) ;
//            list_2.Insert_At_Tail ( 6 ) ;
//            list_2.Insert_At_Tail ( 8 ) ;
//            list_2.Insert_At_Tail ( 10 ) ;
//            list_2.Display () ;
//            LinkedList Merged = new LinkedList () ;
//            Merged.head = Merge_Two_List_1 ( list_1.head , list_2.head ) ; // With Extra Space
//            Merged.Display () ;
//            Merged.head = Merge_Two_List_2 ( list_1.head , list_2.head ) ; // Without Extra Space
//            Merged.Display () ;

//            Odd Ans Even In A List - Put All Odds First And Evens Next In A List.
//            ll.head = Even_Odd_List ( ll.head ) ;
//            ll.Display () ;

//            Remove Duplicates From A List -
//            ll.head = Remove_Duplicate_Nodes ( ll.head ) ;
//            ll.Display () ;

//            Reverse A List Recursively -
            LinkedList rev = new LinkedList () ;
            rev.Insert_At_Tail ( 1 ) ;
            rev.Insert_At_Tail ( 10 ) ;
            rev.Insert_At_Tail ( 13 ) ;
            rev.Insert_At_Tail ( 4 ) ;
            rev.Insert_At_Tail ( 5 ) ;
            rev.Insert_At_Tail ( 6 ) ;
            rev.Insert_At_Tail ( 7 ) ;
            rev.Insert_At_Tail ( 2 ) ;
//            rev.head = Reverse_List_Recursively ( rev.head ) ;
//            rev.head = Reverse_List_Iteratively ( rev.head ) ;
            rev.Display () ;

//            Determine Palindrome List -
//            rev.Display () ;
//            System.out.println ( " Palindrome : " + Palindrome ( rev.head ) ) ;

//            Find The Maximum Twin Sum -
//            System.out.println ( " Maximum Twin Sum " + Maximum_Twin_Sum ( rev.head ) ) ;

//            Arrange The List According To Odd Even Indices -
//            rev.head = Odd_Even_Indices ( rev.head ) ;
//            rev.Display () ;

//            Create A Deep Copy List Of A List Containing Random Pointer To any Node Of The List -
//            public static Deep_Copy ( Node1 head ) {
////                List   -    7    13   11   10   1
////                Random -   null   7    1   11   7
//
////            Creating A Deep Copy -
//            Node1 head2 = new Node1 ( 0 ) ;
//            Node1 temp2 = head2 ;
//            Node1 temp1 = head1 ;
//            while ( temp1 != null ) {
//                Node1 t = new Node1 ( temp1.data ) ;
//                temp2.next = t ;
//                temp2 = temp2.next ;
//                temp1 = temp1.next ;
//            }
//            head2 = head2.next ;
//            temp2 = head2 ;
//            temp1 = head1 ;
//
////            Alternate Connections -
//            Node1 temp = new Node1 ( 0 ) ;
//            while ( temp1 != null ) {
//                temp.next = temp1 ;
//                temp1 = temp1.next ;
//                temp = temp.next ;
//                temp.next = temp2 ;
//                temp2 = temp2.next ;
//                temp = temp.next ;
//            }
//                temp2 = head2 ;
//                temp1 = head1 ;
//
////                Assign Random Pointer -
//            while ( temp1 != null ) {
//                if ( temp1.random == null ) temp2.random = null ;
//                else temp2.random = temp1.random.next ;
//                temp1 = temp2.next ;
//                if ( temp1 != null ) temp2 = temp1.next ;
//            }
//                temp2 = head2 ;
//                temp1 = head1 ;
//
////                Seperating The Lists -
//            while ( temp1 != null ) {
//                temp1.next = temp2.next ;
//                temp1 = temp1.next ;
//                if ( temp1 == null ) break ;
//                temp2.next = temp1.next ;
//                if ( temp2.next == null ) break ;
//                temp2 = temp2.next ;
//            }
//            return head2 ;
//            }
    }
}
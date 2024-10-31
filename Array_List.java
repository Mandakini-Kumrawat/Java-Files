import java.util.ArrayList ;
import java.util.Collection ;
import java.util.Collections;

public class Array_List {
    static void Reverse_ArrayList ( ArrayList < Integer > AL1 ) {
        int i = 0 , j = AL1.size () - 1 ;
        while ( i < j ) {
            Integer temp = Integer.valueOf ( AL1.get ( i ) ) ;
            AL1.set ( i , AL1.get ( j ) ) ;
            AL1.set ( j , temp ) ;
            i ++ ; j -- ;
        }
    }
    public static void main ( String [] args ) {
//        Wrapper Class
//        Integer i = Integer.valueOf (4 ) ;
//        System.out.println ( " i " + i ) ;
//        Float f = Float.valueOf (3.4 ) ;
//        System.out.println ( " f " + f ) ;
        ArrayList < Integer > AL = new ArrayList <> () ;
//        Add New Element
        AL.add ( 1 ) ;
        AL.add ( 2 ) ;
        AL.add ( 3 ) ;
        AL.add ( 4 ) ;
//        Get An Element
        System.out.println ( AL.get ( 0 ) ) ;
//        Print All Elements
        for ( int i = 0 ; i < AL.size () ; i ++ ) {
            System.out.print ( " " + AL.get ( i ) ) ;
        }
        System.out.println () ;
//        Print List Without Loop
        System.out.println ( AL ) ;
//        Add Element At Index
        AL.add ( 1 , 100 ) ;
        System.out.println ( AL ) ;
//        Modifying Element At Index
        AL.set ( 1 , 50 ) ;
        System.out.println ( AL ) ;
//        Remove An Element
        AL.remove ( 1 ) ;
        System.out.println ( AL ) ;
//        Remove Value Of An Element
        System.out.println ( AL.remove ( Integer.valueOf ( 13 ) ) ) ;
        System.out.println ( AL ) ;
//        Check If An Element Exists Or Not ;- Boolean
        Boolean f = AL.contains ( Integer.valueOf ( 2 ) ) ;
        System.out.println ( " Answer : " + f );
//        If You Don't Specify Class , You Can Put Any Anything Inside
        ArrayList L = new ArrayList () ;
        L.add ( " MK " ) ;
        L.add ( 1 ) ;
        L.add ( true ) ;
        System.out.println ( L ) ;
//        Problem :- 1   Reverse Array List
        ArrayList < Integer > AL1 = new ArrayList < Integer > ( ) ;
        AL1.add ( 4 ) ;
        AL1.add ( 3 ) ;
        AL1.add ( 9 ) ;
        AL1.add ( 6 ) ;
        AL1.add ( 0 ) ;
        System.out.println ( " Original Array List :- " + AL1 ) ;
        Collections.reverse ( AL1 ) ;
//        Reverse_ArrayList ( AL1 ) ;
        System.out.println ( " Reverse Array List " + AL1 ) ;
//        Sorting Array List Of Strings In Acending Decending Order
        Collections.sort ( AL1 ) ;
        System.out.println ( " Acending Sorting " + AL1 );
        Collections.sort ( AL1 , Collections.reverseOrder () ) ;
        System.out.println ( " Decending Order " + AL1 ) ;
//        Problem :- 2  Sort Array List Of Strings In Decending Order
        ArrayList < String > SAL = new ArrayList < String > () ;
        SAL.add ( " Apple " ) ;
        SAL.add ( " Pie " ) ;
        SAL.add ( " Grape " ) ;
        SAL.add ( " Watermelon " ) ;
        SAL.add ( " Kiwi " ) ;
        System.out.println ( " Original String " + SAL ) ;
        Collections.sort ( SAL ) ;
        System.out.println ( " Acsending String " + SAL ) ;
        Collections.sort ( SAL , Collections.reverseOrder () ) ;
        System.out.println ( " Decending String " + SAL ) ; 
    }
}
import java.util.* ;
public class Strings_One_Shot {
    static boolean palindrome ( String s ) {
        int i = 0 , j = s.length () - 1 ;
        while ( i < j ) {
            if ( s.charAt ( i ) != s.charAt ( j ) ) return false ;
            i ++ ; j -- ;
        }
        return true ;
    }
    public static void main ( String [] args ) {
        Scanner scan = new Scanner(System.in);
//        String s1 = " Mandakini Kumrawat " ;
//        System.out.println ( s1 ) ;
//        String s2 = scan.next () ; // .next () - Print The First Word Of The String Not The Whole String.
//        String s3 = scan.nextLine () ; // .nextLine () - Better Approach For Printing Whole String.
//         .length () - The Length Of The String Including Spaces.
//        System.out.println ( " Length : " + s3.length () ) ;
//         .charAt () - Takes Index , Gives The Character At index.
//        System.out.println ( " Char At : " + s3.charAt ( 5 ) ) ;
//         .indexOf () - Takes Character , Gives it's index.
//        System.out.println ( " Index Of : " + s3.indexOf ( 'k' ) ) ;

//        .compareTo () - Compares First String To Second Lexicographically. Gives 0 , If Both Are Equal.
//                        Gives 1 , if First Is Greater And -1 If First Is Smaller.
//        String s4 = "abc" , s5 = "bbd" , s6 = "zbc" , s7 = "abc" ;
//        System.out.println ( " 1 : " + s5.compareTo ( s4 ) ) ;
//        System.out.println ( " -1 : " + s6.compareTo ( s4 ) ) ;
//        System.out.println ( " 0 : " + s4.compareTo ( s7 ) ) ;

//        .contains () - Takes a Substring , Gives True Or False If Original String Contains it.
//        System.out.println ( " Contains Substring : " + s3.contains ( "kin" ) ) ;
//        .toLowerCase () - Make The String In Lower Case
//        System.out.println ( " Lower Case : " + s3.toLowerCase () ) ;
//        .toUpperCase () - Make The String In Upper Case
//        System.out.println ( " Upper Case : " + s3.toUpperCase () ) ;

//        .concat () - Concat Two Strings
//        String str_1 = "Mandakini" ;
//        String str_2 = "Kumrawat" ;
//        System.out.println ( " Concat : " + str_1.concat ( str_2 ) ) ;

//        .substring () - Prints SubString
//        String str_3 = "abcde" ;
//        System.out.println ( " SubString : " + str_3.substring ( 1 , 4 ) ) ; // Begin And End Index
//        System.out.println ( " SubString : " + str_3.substring ( 1 ) ) ; // Begin Index

//        1. Print All SubString
//        String str = "abcd" ;
//        for ( int i = 0 ; i < str.length () ; i ++ ) {
//            for ( int j = i + 1 ; j <= str.length () ; j ++ ) {
//                System.out.print ( " " + str.substring ( i , j ) + " " ) ;
//            }
//        }

//        .equals () - Compares To See If Both Strings Are Equal And Gives True Or False Accordingly.
//        String str_1 = "Hello" , str_2 = "Hello" ;
//        String str_3 = new String ( "Hello" ) ;
//        System.out.println ( " Equal String : " + ( str_1 == str_2 ) ) ;
//        System.out.println ( " Equal String : " + ( str_1 == str_3 ) ) ;
//        System.out.println ( " Equal String : " + str_1.equals ( str_3 ) ) ;

//        String Builder ----------->
//        StringBuilder str = new StringBuilder( " Hello " );
////        .append () - Appends The String From The End
//        System.out.println(" Append : " + str.append( " Mello " ) ) ;
////        .setCharAt () - Set A Character At An Index
//        str.setCharAt(6, 'W');
//        System.out.println(" Set Char At : " + str);
////        .insert () - Inserts A Character In String
//        System.out.println(" Insert : " + str.insert(4, 'o'));
////        .deleteCharAt () - Delete Character At Index
//        System.out.println(" Delete Char At : " + str.deleteCharAt(7));
////        .reverse () - Reverse The String
//        StringBuilder Rev_String = new StringBuilder ( " physics " ) ;
//        Rev_String.reverse () ;
//        System.out.println ( " Reverse Bruhh : " + Rev_String ) ;
//        Rev_String.reverse () ;
////        .delete ( i , j ) - Deletes Charater From I To J
//        System.out.println ( " Delete i To j " + Rev_String.delete ( 2 , 4 ) ) ;
////        .substring () - Prints Substring similar To String's Fuction
//        System.out.println ( " SubString : " + Rev_String.substring ( 2 ) ) ;

//        2. Toggle - Change Upper Case To Lower , Ans Lower Case To Upper. Using StringBuilder ------>
//        System.out.println ( " Enter String : " ) ;
//        StringBuilder stri = new StringBuilder ( scan.nextLine () ) ;
//        System.out.println ( " Your String : " + stri ) ;
////        input : HbfkFgujFld   output : hBFKfGUJfLD
//        for ( int i = 0; i < stri.length () ; i ++ ) {
//            boolean flag = true ;
//            char ch = stri.charAt ( i ) ;
//            if ( ch == ' ' ) continue ;
//            int val = ( int ) ch ;
//            if ( val >= 97 ) flag = false ;
//            if ( flag == true ) {
//                val += 32 ;
//                char c = ( char ) val ;
//                stri.setCharAt ( i , c ) ;
//            } else {
//                val -= 32 ;
//                char c = ( char ) val ;
//                stri.setCharAt ( i , c ) ;
//            }
//        }
//        System.out.println ( " Toggle String : " + stri ) ;

//        3. Check if Substrings Of A String Are Plaindrome
//        String str = "abcba" ;
//        for ( int i = 0 ; i < str.length () ; i ++ ) {
//            for ( int j = i + 1 ; j <= str.length () ; j ++ ) {
//                System.out.printf ( " %s - %b " , str.substring ( i , j ) ,
//                        palindrome ( str.substring ( i , j ) ) ) ;
//                System.out.println () ;
//            }
//        }

//        4. reverse The Whole Sentence Of Words.
//        String str = "I Am An Online Learner " ;
//        String ans = " " ;
//        StringBuilder stri = new StringBuilder ( " " ) ;
//        for ( int i = 0 ; i < str.length () ; i ++ ) {
//            if ( str.charAt ( i ) != ' ' ) {
//                stri.append ( str.charAt ( i ) ) ;
//            } else {
//                stri.reverse () ;
//                ans += stri ;
//                ans += " " ;
//                stri.delete ( 0 , stri.length () ) ;
//            }
//        }
//        System.out.println ( " Reverse Sentence : " + ans ) ;

//        5. Compress A String - Input : aaabbbbccddde   output : a3b4c2d3e1
        String str = "aaabbbbcddde" ;
        String ans = " " + str.charAt ( 0 ) ;
        int count = 1 ;
        for ( int i = 1 ; i < str.length () ; i ++ ) {
            char currchar = str.charAt ( i ) ;
            char prevchar = str.charAt ( i - 1 ) ;
            if ( currchar == prevchar ) {
                count ++ ;
            } else {
                if ( count > 1 ) ans += count ;
                count = 1 ;
                ans += currchar ;
            }
            if ( i == str.length () - 1 && count > 1 ) ans += count ;
        }
        System.out.println ( " Original String : " + str ) ;
        System.out.println ( " Answer String : " + ans ) ;
    }
}
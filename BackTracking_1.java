import java.util.ArrayList;
import java.util.List;

public class BackTracking_1 {
    public static int Maze_Path ( int sr, int sc , int er , int ec ) {
        if ( sr > er || sc > ec ) return 0 ;
        if ( sr == er && sc == ec ) return 1 ;
        int DownWays = Maze_Path ( sr + 1 , sc , er , ec ) ;
        int RightWays = Maze_Path ( sr , sc + 1 , er , ec ) ;
        int TotalWays = RightWays + DownWays ;
        return TotalWays ;
    }
    public static void Print_Maze_Path ( int sr, int sc , int er , int ec , String path ) {
        if ( sr > er || sc > ec ) return ;
        if ( sr == er && sc == ec ) { System.out.print ( " " + path + " " ) ; return ; }
        Print_Maze_Path ( sr , sc + 1 , er , ec , path + "R" ) ;
        Print_Maze_Path ( sr + 1 , sc , er , ec , path + "D" ) ;
    }
    public static void Maze_Path_4 ( int sr, int sc , int er , int ec , String path , boolean [] [] check ) {
        if ( sr < 0 || sc < 0 ) return ;
        if ( sr > er || sc > ec ) return ;
        if ( check [ sr ] [ sc ] == true ) return ;
        if ( sr == er && sc == ec ) { System.out.print ( " " + path + " " ) ; return ; }
        check [ sr ] [ sc ] = true ;
        Maze_Path_4 ( sr , sc + 1 , er , ec , path + "R" , check ) ;
        Maze_Path_4 ( sr + 1 , sc , er , ec , path + "D" , check ) ;
        Maze_Path_4 ( sr , sc - 1 , er , ec , path + "L" , check ) ;
        Maze_Path_4 ( sr - 1 , sc , er , ec , path + "U" , check ) ;
        check [ sr ] [ sc ] = false ;
    }
    /*public static void Print_Dead_Maze_Path ( int sr , int sc , int er , int ec , String path ,
                                             int [] [] maze ) {
        if ( sr < 0 || sc < 0 ) return ;
        if ( sr > er || sc > ec ) return ;
        if ( sr == er && sc == ec ) { System.out.print ( " " + path + " " ) ; return ; }
        if ( maze [ sr ] [ sc ] == 0 ) return ;
        if ( maze [ sr ] [ sc ] == -1 ) return ;
        maze [ sr ] [ sc ] = -1 ;
        Print_Dead_Maze_Path ( sr , sc + 1 , er , ec , path + "R" , maze ) ;
        Print_Dead_Maze_Path ( sr + 1 , sc , er , ec , path + "D" , maze ) ;
        Print_Dead_Maze_Path ( sr , sc - 1 , er , ec , path + "L" , maze ) ;
        Print_Dead_Maze_Path ( sr - 1 , sc , er , ec , path + "U" , maze ) ;
        maze [ sr ] [ sc ] = 1 ;
    }*/
    public static void Print_String ( String str , String s , List < String > al ) {
        if ( str.equals ( "" ) ) {
            al.add ( s ) ; return ;
        }
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            char ch = str.charAt ( i ) ;
            String left = str.substring ( 0 , i ) ;
            String right = str.substring ( i + 1 ) ;
            String rem = left + right ; // ac
            Print_String ( rem , s + ch , al ) ;
        }
        return ;
    }
    public static void helper ( int [] nums , int idx , List < List < Integer > > ans ) {
        if ( idx == nums.length ) {
            List < Integer > new_list = new ArrayList <> () ;
            for ( int i = 0 ; i < nums.length ; i ++ ) {
                new_list.add ( nums [ i ] ) ;
            }
            ans.add ( new_list ) ;
            return ;
        }
        for ( int i = idx ; i < nums.length ; i ++ ) {
            int temp = nums [ i ] ;
            nums [ i ] = nums [ idx ] ;
            nums [ idx ] = temp ;
            helper ( nums , idx + 1 , ans ) ;
            temp = nums [ i ] ;
            nums [ i ] = nums [ idx ] ;
            nums [ idx ] = temp ;
        }
    }
    public static List < List < Integer > > Print_Permutation ( int [] nums ) {
        List < List < Integer > > ans = new ArrayList <> () ;
        helper ( nums , 0 , ans ) ;
        return ans ;
    }
    private static void N_Queen ( char [] [] board , int row ) {
        int n = board.length ;
        if ( row == n ) {
            for ( int i = 0 ; i < n ; i ++ ) {
                for ( int j = 0 ; j < n ; j ++ ) {
                    System.out.print ( " " + board [ i ] [ j ] + " " ) ;
                }
                System.out.println () ;
            }
            System.out.println () ; return ;
        }
        for ( int j = 0 ; j < n ; j ++ ) {
            if ( Yes ( board , row , j ) ) {
                board [ row ] [ j ] = 'Q' ;
                N_Queen ( board , row + 1 ) ;
                board [ row ] [ j ] = 'X' ;
            }
        }
    }
    private static boolean Yes ( char [] [] board , int row , int col ) {
        int n = board.length ;
        // Checking Row -
        for ( int j = 0 ; j < n ; j ++ ) {
            if ( board [ row ] [ j ] == 'Q' ) return false ;
        }
        // Checking Column -
        for ( int i = 0 ; i < n ; i ++ ) {
            if ( board [ i ] [ col ] == 'Q' ) return false ;
        }
        // Checking North East Diagonal -
        int i = row ;
        int j = col ;
        while ( i >= 0 && j < n ) {
            if ( board [ i ] [ j ] == 'Q' ) return false ;
            i -- ; j ++ ;
        }
        // Checking South East Diagonal -
        i = row ; j = col ;
        while ( i < n && j < n ) {
            if ( board [ i ] [ j ] == 'Q' ) return false ;
            i ++ ; j ++ ;
        }
        // Checking South west Diagonal -
        i = row ; j = col ;
        while ( i < n && j >= 0 ) {
            if ( board [ i ] [ j ] == 'Q' ) return false ;
            i ++ ; j -- ;
        }
        // Checking North West Diagonal -
        i = row ; j = col ;
        while ( i >= 0 && j >= 0 ) {
            if ( board [ i ] [ j ] == 'Q' ) return false ;
            i -- ; j -- ;
        }
        return true ;
    }
    public static void main ( String [] args ) {
//        int rows = 2 ;
//        int cols = 3 ;
//        int count = Maze_Path ( 1 , 1 , rows , cols ) ;
//        System.out.println ( " Count : " + count ) ;

        // Printing The Whole Maze Path.
//        int rows = 3 ;
//        int cols = 3 ;
//        Print_Maze_Path ( 1 , 1 , rows , cols , "" ) ;

        // 4 Direction Maze Path.
//        int rows = 3 ;
//        int cols = 3 ;
//        boolean [] [] check = new boolean [ rows ] [ cols ] ;
//        Maze_Path_4 ( 0 , 0 , rows - 1 , cols - 1 , "" , check ) ;

        // 5. Rat In A Dead Maze.
//        int rows = 4 ;
//        int cols = 6 ;
//        int [] [] maze = { { 1 , 0 , 1 , 1 , 1 , 1 } , { 1 , 1 , 1 , 1 , 0 , 1 } ,
//                           { 0 , 1 , 1 , 1 , 1 , 1 } , { 0 , 0 , 1 , 0 , 1 , 1 } } ;
//        Print_Dead_Maze_Path ( 0 , 0 , rows - 1 , cols - 1 , "" , maze ) ;

        // 6. Given An Array Nums Of Distinct Integers , Return All The Possible Permutation. You Can return
        //    The Answer In Any Order.
        // Input - [ 1 , 2 , 3 ]
        // Output - [ [ 1 , 2 , 3 ] , [ 1 , 3 , 2 ] , [ 2 , 1 , 3 ] , [ 2 , 3 , 1 ] , [ 3 , 1 , 2 ] ,
        //          [ 3 , 2 , 1 ] ].
//        String str = "abc" ;
//        List< String > al = new ArrayList<>() ;
//        Print_String ( str , "" , al ) ;
//        for ( int i = 0 ; i < al.size () ; i ++ ) {
//            System.out.print ( " " + al.get ( i ) + " " )  ;
//        }
//        System.out.println ( al ) ;
//        int [] nums = { 1 , 2 , 3 } ;
//        List < List < Integer > > ans =  Print_Permutation ( nums ) ;
//        for ( int i = 0 ; i < ans.size () ; i ++ ) {
//            System.out.print ( " " + ans.get ( i ) ) ;
//        }
//        System.out.println () ;

        // 7. N Queens - Consider An N * N ChessBoard. N Queen Problem Is To Accommodate N Queens On The
        //               N * N ChessBoard Such That No 2 Queens Can Attack Each Other.
        // Input - 4 .
        // Output - {  0  ,  1  ,  0  ,  0  }
        //          {  0  ,  0  ,  0  ,  1  }
        //          {  1  ,  0  ,  0  ,  0  }
        //          {  0  ,  0  ,  1  ,  0  }
        int n = 4 ;
        char [] [] board = new char [ n ] [ n ] ;
        for ( int i = 0 ; i < n ; i ++ ) {
            for ( int j = 0 ; j < n ; j ++ ) {
                board [ i ] [ j ] = 'X' ;
            }
        }
        N_Queen ( board , 0 ) ;
    }
}

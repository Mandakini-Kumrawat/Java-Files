public class BackTracking_2 {
    static int Max_Knights = -1 ;
    static int sudo = 0 ;
    public static boolean helper ( int [] [] chess , int row , int col , int num ) {
        int n = chess.length ;
        if ( num == n * n - 1 ) return true ;
        int i , j ;
        // (1) ----- 2 Up , 1 Right -
        i = row - 2 ;
        j = col + 1 ;
        if ( i >= 0 && j < n && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        // (2) ----- 2 Up , 1 Left -
        i = row - 2 ;
        j = col - 1 ;
        if ( i >= 0 && j >= 0 && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        // (3) ----- 2 Down , 1 Right -
        i = row + 2 ;
        j = col + 1 ;
        if ( i < n && j < n && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        // (4) ----- 2 Down , 1 Left -
        i = row + 2 ;
        j = col - 1 ;
        if ( i < n && j >= 0 && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        // (5) ----- 2 Right , 1 Up -
        i = row - 1 ;
        j = col + 2 ;
        if ( i >= 0 && j < n && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        // (6) ----- 2 Right , 1 Down -
        i = row + 1 ;
        j = col + 2 ;
        if ( i < n && j < n && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        // (7) ----- 2 Left , 1 Up -
        i = row - 1 ;
        j = col - 2 ;
        if ( i >= 0 && j >= 0 && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        // (8) ----- 2 Left , 1 Down -
        i = row + 1 ;
        j = col - 2 ;
        if ( i < n && j >= 0 && chess [ i ] [ j ] == num + 1 ) return helper ( chess , i , j , num + 1 ) ;
        return false ;
    }
    public static boolean Check_Knight_Tour ( int [] [] chess ) {
        if ( chess [ 0 ] [ 0 ] != 0 ) return false ;
        return helper ( chess , 0 , 0 , 0 ) ;
    }
    public static boolean Check ( char [] [] chess , int row , int col ) {
        int n = chess.length ;
        int i , j ;
        // (1) ----- 2 Up , 1 Right -
        i = row - 2 ;
        j = col + 1 ;
        if ( i >= 0 && j < n && chess [ i ] [ j ] == 'K' ) return false ;
        // (2) ----- 2 Up , 1 Left -
        i = row - 2 ;
        j = col - 1 ;
        if ( i >= 0 && j >= 0 && chess [ i ] [ j ] == 'K' ) return false ;
        // (3) ----- 2 Down , 1 Right -
        i = row + 2 ;
        j = col + 1 ;
        if ( i < n && j < n && chess [ i ] [ j ] == 'K' ) return false ;
        // (4) ----- 2 Down , 1 Left -
        i = row + 2 ;
        j = col - 1 ;
        if ( i < n && j >= 0 && chess [ i ] [ j ] == 'K' ) return false ;
        // (5) ----- 2 Right , 1 Up -
        i = row - 1 ;
        j = col + 2 ;
        if ( i >= 0 && j < n && chess [ i ] [ j ] == 'K' ) return false ;
        // (6) ----- 2 Right , 1 Down -
        i = row + 1 ;
        j = col + 2 ;
        if ( i < n && j < n && chess [ i ] [ j ] == 'K' ) return false ;
        // (7) ----- 2 Left , 1 Up -
        i = row - 1 ;
        j = col - 2 ;
        if ( i >= 0 && j >= 0 && chess [ i ] [ j ] == 'K' ) return false ;
        // (8) ----- 2 Left , 1 Down -
        i = row + 1 ;
        j = col - 2 ;
        if ( i < n && j >= 0 && chess [ i ] [ j ] == 'K' ) return false ;
        return true ;
    }
    public static void K_Knights ( char [] [] chess , int row , int col , int num ) {
        int n = chess.length ;
        if ( row == n ) {
            for ( int i = 0 ; i < n ; i ++ ) {
                for ( int j = 0 ; j < n ; j ++ ) {
                    System.out.print ( " " + chess [ i ] [ j ] + " " ) ;
                }
                System.out.println () ;
            }
            System.out.println () ; return ;
        }
        else if ( Check ( chess , row , col ) ) {
            chess [ row ] [ col ] = 'K' ;
            if ( col < n - 1 ) K_Knights ( chess , row , col + 1 , num + 1 ) ;
            else K_Knights ( chess , row + 1 , 0 , num + 1 ) ;
            chess [ row ] [ col ] = 'X' ;
        }
        if ( col < n - 1 ) K_Knights ( chess , row , col + 1 , num ) ;
        else K_Knights ( chess , row + 1 , 0 , num ) ;
    }
    public static boolean Check_Sudoku ( char [] [] Sudoku , int row , int col , char num ) {
        // Check Row -
        for ( int j = 0 ; j < 9 ; j ++ ) {
            if ( j != col && Sudoku [ row ] [ j ] == num ) return false ;
        }
        // Check Column -
        for ( int i = 0 ; i < 9 ; i ++ ) {
            if ( i != row && Sudoku [ i ] [ col ] == num ) return false ;
        }
        // Check 3x3 Grid -
        int Srow = row / 3 * 3 ;
        int Scol = col / 3 * 3 ;
        for ( int i = Srow ; i < Srow + 3 ; i ++ ) {
            for ( int j = Scol ; j < Scol ; j ++ ) {
                if ( i != row && j != col && Sudoku [ i ] [ j ] == num ) return false ;
            }
        }
        return true ;
    }
    public static boolean Valid_Sudoku ( char [] [] Sudoku ) {
        for ( int i = 0 ; i < 9 ; i ++ ) {
            for ( int j = 0 ; j < 9 ; j ++ ) {
                if ( Sudoku [ i ] [ j ] == '.' ) continue ;
                char num = Sudoku [ i ] [ j ] ;
                Sudoku [ i ] [ j ] = '.' ;
                if ( Check_Sudoku ( Sudoku , i , j , num ) == false ) return false ;
                Sudoku [ i ] [ j ] = num ;
            }
        }
        return true ;
    }
    public static void Sudoku_Helper ( char [] [] Sudoku , int row , int col ) {
        if ( row == 9 ) {
            sudo = 1 ;
            return ;
        }
        if ( Sudoku [ row ] [ col ] != '.' ) {
            if ( col < 8 ) Sudoku_Helper ( Sudoku , row , col + 1 ) ;
            else Sudoku_Helper ( Sudoku , row + 1 , 0 ) ;
        } else {
            for ( char ch = '1' ; ch <= '9' ; ch ++ ) {
                if ( Check_Sudoku ( Sudoku , row , col , ch ) ) {
                    Sudoku [ row ] [ col ] = ch ;
                    if ( col < 8 ) Sudoku_Helper ( Sudoku , row , col + 1 ) ;
                    else Sudoku_Helper ( Sudoku , row + 1 , 0 ) ;
                    if ( sudo == 1 ) return ;
                    Sudoku [ row ] [ col ] = '.' ;
                }
            }
        }
    }
    public static void Sudoku_Solver ( char [] [] Sudoku ) {
        Sudoku_Helper ( Sudoku , 0 , 0 ) ;
        sudo = 0 ;
        for ( int i = 0 ; i < 9 ; i ++ ) {
            for ( int j = 0 ; j < 9 ; j ++ ) {
                System.out.print ( " " + Sudoku [ i ] [ j ] + " " ) ;
            }
            System.out.println () ;
        } return ;
    }
    public static void main ( String [] args ) {
        // 1. Check Knight Tour Configuration.
        // Input -  {  0  ,  11  ,  16  ,  5  ,  20  }   Output - True
        //          {  17 ,  4   ,  19  ,  10 ,  15  }
        //          {  12 ,  1   ,  8   ,  21 ,  6   }
        //          {  3  ,  18  ,  23  ,  14 ,  9   }
        //          {  24 ,  13  ,  2   ,  7  ,  22  }
//        int n = 5 ;
//        int [] [] chess = { {  0  ,  11  ,  16  ,  5  ,  20  } , {  17 ,  4   ,  19  ,  10 ,  15  } ,
//                {  12 ,  1   ,  8   ,  21 ,  6   } , {  3  ,  18  ,  23  ,  14 ,  9   } ,
//                {  24 ,  13  ,  2   ,  7  ,  22  } } ;
//        if ( Check_Knight_Tour ( chess ) ) System.out.println ( " True " ) ;
//        else System.out.println ( " False " ) ;

        // 2. K-Night - Place K-Nights Such That They Do Not Attack Each Other.
//        int n = 3 ;
//        char [] [] chess = new char [ n ] [ n ] ;
//        for ( int i = 0 ; i < n ; i ++ ) {
//            for ( int j = 0 ; j < n ; j ++ ) {
//                chess [ i ] [ j ] = 'X' ;
//            }
//        }
//        K_Knights ( chess , 0 , 0 , 0 ) ;

        // 3. Valid Sudoku - Check If The Sudoku Is Valid Or Not. -
        //         |_______________________________________________|
        // Input - |   5   3   _   |   _   7   _   |   _   _   _   |
        //         |   6   _   _   |   1   9   5   |   _   _   _   |
        //         |   _   9   8   |   _   _   _   |   _   6   _   |
        //         |---------------|---------------|---------------|
        //         |   8   _   _   |   _   6   _   |   _   _   3   |
        //         |   4   _   _   |   8   _   3   |   _   _   1   |
        //         |   7   _   _   |   _   2   _   |   _   _   6   |
        //         |---------------|---------------|---------------|
        //         |   _   6   _   |   _   _   _   |   2   8   _   |
        //         |   _   _   _   |   4   1   9   |   _   _   5   |
        //         |   _   _   _   |   _   8   _   |   _   7   9   |
        //         |-----------------------------------------------|

        char [] [] Sudoku = { { '5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.' } , { '6' , '.' , '.' , '1' ,
                '9' , '5' , '.' , '.' , '.' } , { '.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.' } , { '8' ,
                '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3' } , { '4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' ,
                '1' } , { '7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6' } , { '.' , '6' , '.' , '.' , '.' ,
                '.' , '2' , '8' , '.' } , { '.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5' } , { '.' , '.' ,
                '.' , '.' , '8' , '.' , '.' , '7' , '9' } } ;
//                if ( Valid_Sudoku ( Sudoku ) ) System.out.println ( " True ! " ) ;
//                else System.out.println ( " False ! " ) ;

        // 4. Sudoku Solver - Solve The Sudoku -
        Sudoku_Solver ( Sudoku ) ;
        System.out.println () ;
    }
}

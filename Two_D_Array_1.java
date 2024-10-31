import java.awt.*;
import java.util.Scanner ;
public class Two_D_Array_1 {
    static void Print_Array ( int [] [] arr ) {
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            for ( int j = 0 ; j < arr [ i ].length ; j ++ ) {
                System.out.print ( " " + arr [ i ] [ j ] + " " ) ;
            }
            System.out.println () ;
        }
        System.out.println () ;
    }
    static void Add_2_Matrix ( int [] [] a , int r1 , int c1 , int [] [] b , int r2 , int c2 ) {
        if ( r1 != r2 || c1 != c2 ) {
            System.out.println ( " Wrong Input -> Addition Not Possible " ) ; return ;
        }
        int [] [] sum = new int [ r1 ] [ c2 ] ;
        for ( int i = 0 ; i < r1 ; i ++ ) {
            for ( int j = 0 ; j < c1 ; j ++ ) {
                sum [ i ] [ j ] = a [ i ] [ j ] + b [ i ] [ j ] ;
            }
        }
        Print_Array ( sum ) ;
    }
    static void Multi_2_Matrix ( int [] [] a , int r1 , int c1 , int [] [] b , int r2 , int c2 ) {
        if ( c1 != r2 ) {
            System.out.println ( " Wrong Input : Multiplication Not Possible " ) ;
            return ;
        }
        int [] [] Sum = new int [ r1 ] [ c2 ] ;
        for ( int i = 0 ; i < r1 ; i ++ ) {
            for ( int j = 0 ; j < c2 ; j ++ ) {
                for ( int k = 0 ; k < r1 ; k ++ ) {
                    Sum [ i ] [ j ] += a [ i ] [ k ] * b [ k ] [ j ] ;
                }
            }
        }
        Print_Array ( Sum ) ;
    }
    static int [] [] Transpose ( int [] [] arr , int r , int c ) {
        int [] [] ans = new int [ c ] [ r ] ;
        for ( int i = 0 ; i < c ; i ++ ) { // i = 0 , 1 , 2       (3)
            for ( int j = 0 ; j < r ; j ++ ) { // j = 0 , 1      (2)
                ans [ i ] [ j ] = arr [ j ] [ i ] ;
            }
        }
        return ans ;
    }
    static void Transpose_In_Place ( int [] [] arr , int r , int c ) {
        for ( int i = 0 ; i < c ; i ++ ) { // i = 0 1 2
            for ( int j = i ; j < r ; j ++ ) { // j = 0 1 2
                int temp = arr [ i ] [ j ] ; // temp = 8
                arr [ i ] [ j ] = arr [ j ] [ i ] ; // [i][j] = 6
                arr [ j ] [ i ] = temp ; // [j][i] = 8
            }
        }
    }
    static void Rotate_90_Degrees ( int [] [] arr , int r , int c ) {
        for ( int i = 0 ; i < r ; i ++ ) {
            for ( int j = i ; j < c ; j ++ ) {
                int temp = arr [ i ] [ j ] ;
                arr [ i ] [ j ] = arr [ j ] [ i ] ;
                arr [ j ] [ i ] = temp ;
            }
        }
        for ( int i = 0 ; i < r ; i ++ ) {
            int st = 0 ;
            int lt = arr [ i ].length - 1 ;
            while ( st < lt ) {
                int temp = arr [ i ] [ st ] ;
                arr [ i ] [ st ] = arr [ i ] [ lt ] ;
                arr [ i ] [ lt ] = temp ;
                st ++ ; lt -- ;
            }
        }
    }
    static int [] [] Pascals_Triangle ( int n ) {
        int [] [] pascal = new int [ n ] [] ;
        for ( int i = 0 ; i < n ; i ++ ) {
            pascal [ i ] = new int [ i + 1 ] ;
            for ( int j = 0 ; j <= i ; j ++ ) {
                if ( j == 0 || j == i ) {
                    pascal [ i ] [ j ] = 1 ;
                } else {
                    pascal [ i ] [ j ] = Factorial ( i ) / ( Factorial ( j ) * Factorial ( i - j ) ) ;
                }
            }
        }
        return pascal ;
    }
    static int Factorial ( int n ) {
        int ans = 1 ;
        for ( int i = 1 ; i <= n ; i ++ ) {
            ans *= i ;
        }
        return ans ;
    }
    static void Spiral_Matrix ( int [] [] arr , int r , int c ) { // r = 3 , c = 3
        int count = 0 ; // count = 0 ;
        int TopRow = 0 ; // tr = 0
        int RightColumn = c - 1 ; // rc = 2
        int BottomRow = r - 1 ; // br = 2
        int LeftColumn = 0 ; // lc = 0 ;
        while ( count <= r * c ) { // count != 9 count = 8
            if ( count == r * c ) break ;
            for ( int j = LeftColumn ; j <= RightColumn ; j ++ ) { // j = 0 1 2 3 (2) // j = 1 (1)
                System.out.print ( " " + arr [ TopRow ] [ j ] + " " ) ; // 1 2 3 // 5
                count ++ ; // count = 1 2 3 ; // 9
            }
            TopRow ++ ; // TopRow = 1 , 2
            if ( count == r * c ) break ;
            for ( int i = TopRow ; i <= BottomRow ; i ++ ) { // i = 1 2 3 (2)
                System.out.print ( " " + arr [ i ] [ RightColumn ] ) ; // 6 9
                count ++ ; // count = 4 5
            }
            RightColumn -- ; // RightColumn = 1
            if ( count == r * c ) break ;
            for ( int j = RightColumn ; j >= LeftColumn ; j -- ) { // j = 1 0 (0)
                System.out.print ( " " + arr [ BottomRow ] [ j ] + " " ) ; // // 8 7
                count ++ ; // count = 6 7
            }
            BottomRow -- ; // BottomRow = 1
            if ( count == r * c ) break ;
            for ( int i = BottomRow ; i >= TopRow ; i -- ) { // i = 1 (1)
                System.out.print ( " " + arr [ i ] [ LeftColumn ] ) ; // 4
                count ++ ; // count = 8
            }
            LeftColumn ++ ; // LeftColumn = 1
            if ( count == r * c ) break ;
        }
    }
    static int [] [] Spiral ( int n ) {
        int [] [] ans = new int [ n ] [ n ] ;
        int count = 0 ; // count = 0 ;
        int TopRow = 0 ; // tr = 0
        int RightColumn = n - 1 ; // rc = 2
        int BottomRow = n - 1 ; // br = 2
        int LeftColumn = 0 ; // lc = 0 ;
        int curr = 1 ;
        while ( count <= n * n ) { // count != 9 count = 8
            for ( int j = LeftColumn ; j <= RightColumn && curr <= n * n ; j ++ ) { // j = 0 1 2 3 (2) // j = 1 (1)
                ans [ TopRow ] [ j ] = curr ++ ;
            }
            TopRow ++ ; // TopRow = 1 , 2
            for ( int i = TopRow ; i <= BottomRow && curr <= n * n ; i ++ ) { // i = 1 2 3 (2)
                ans [ i ] [ RightColumn ] = curr ++ ;
            }
            RightColumn -- ; // RightColumn = 1
            for ( int j = RightColumn ; j >= LeftColumn && curr <= n * n ; j -- ) { // j = 1 0 (0)
                ans [ BottomRow ] [ j ] = curr ++ ;
            }
            BottomRow -- ; // BottomRow = 1
            for ( int i = BottomRow ; i >= TopRow && curr <= n * n ; i -- ) { // i = 1 (1)
                ans [ i ] [ LeftColumn ] = curr ++ ;
            }
            LeftColumn ++ ; // LeftColumn = 1
        }
        return ans ;
    }
    static int Rectangle_Sum_Brut_Force ( int [] [] arr , int l1 , int r1 , int l2 , int r2 ) {
        int sum = 0 ;
        for ( int i = l1 ; i <= l2 ; i ++ ) {
            for ( int j = r1 ; j <= r2 ; j ++ ) {
                sum += arr [ i ] [ j ] ;
            }
        }
        return sum ;
    }
    static void Prefix_Sum_Rows ( int [] [] arr ) {
        int r = arr.length ;
        int c = arr [ 0 ].length ;
        for ( int i = 0 ; i < r ; i ++ ) {
            for ( int j = 1 ; j < c ; j ++ ) {
                arr [ i ] [ j ] += arr [ i ] [ j - 1 ] ;
            }
        }
    }
    static int Rectangle_Sum_1 ( int [] [] arr , int l1 , int r1 , int l2 , int r2 ) {
        int sum = 0 ;
        Prefix_Sum_Rows ( arr ) ;
        for ( int i = l1 ; i <= l2 ; i ++ ) {
            if ( r1 >= 1 ) sum += ( arr [ i ] [ r2 ] - arr [ i ] [ r1 - 1 ] ) ;
            else sum += arr [ i ] [ r2 ] ;
        }
        return sum ;
    }
    static void Prefix_Sum_Column ( int [] [] arr ) {
        int r = arr.length ;
        int c = arr [ 0 ].length ;
        for ( int j = 0 ; j < c ; j ++ ) {
            for ( int i = 1 ; i < r ; i ++ ) {
                arr [ i ] [ j ] += arr [ i - 1 ] [ j ] ;
            }
        }
    }
    static int Rectangle_Sum_2 ( int [] [] arr , int l1 , int r1 , int l2 , int r2 ) {
        int ans = 0 , sum = 0 , up = 0 , left = 0 , leftup = 0 ;
        Prefix_Sum_Rows ( arr ) ;
        Print_Array ( arr ) ;
        Prefix_Sum_Column ( arr ) ;
        Print_Array ( arr ) ;
        sum = arr [ l2 ] [ r2 ] ;
        if ( l1 >= 1 ) up = arr [ l1 - 1 ] [ r2 ] ;
        if ( r1 >= 1 ) left = arr [ l2 ] [ r1 - 1 ] ;
        if ( l1 >= 1 && r1 >= 1 ) leftup = arr [ l1 - 1 ] [ r1 - 1 ] ;
        ans = ( sum - up - left ) + leftup ;
        return ans ;
    }
    public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System.in ) ;
//        System.out.println ( " 1st Row " ) ;
//        int r1 = scan.nextInt () ;
//        System.out.println ( " 1st Column : " ) ;
////        int c1 = scan.nextInt () ;
//        int [] [] A = new int [ r1 ] [ c1 ] ;
//        System.out.println ( " Enter 1st Matrice " ) ;
//        for ( int i = 0 ; i < r1 ; i ++ ) {
//            for ( int j = 0 ; j < c1 ; j ++ ) {
//                A [ i ] [ j ] = scan.nextInt () ;
//            }
//        }
//        System.out.println ( " 2nd Row : " ) ;
//        int r2 = scan.nextInt () ;
//        System.out.println ( " 2nd Column : " ) ;
//        int c2 = scan.nextInt () ;
//        int [] [] B = new int [ r2 ] [ c2 ] ;
//        System.out.println ( " Enter 2nd Matrice : " ) ;
//        for ( int i = 0 ; i < r2 ; i ++ ) {
//            for ( int j = 0 ; j < c2 ; j ++ ) {
//                B [ i ] [ j ] = scan.nextInt () ;
//            }
//        }
//        Add_2_Matrix ( A , r1 , c1 , B , r2 , c2 ) ;
//        Multi_2_Matrix ( A , r1 , c1 , B , r2 , c2 ) ;
//        System.out.println ( " Row : " ) ;
//        int r = scan.nextInt () ;
//        System.out.println ( " Column : " ) ;
//        int c = scan.nextInt () ;
//        int [] [] arr = new int [ r ] [ c ] ;
//        System.out.println ( " Enter Matrix : " ) ;
//        for ( int i = 0 ; i < r ; i ++ ) {
//            for ( int j = 0 ; j < c ; j ++ ) {
//                arr [ i ] [ j ] = scan.nextInt () ;
//            }
//        }
////        int [] [] ans = Transpose ( arr , r , c ) ;
////        Transpose_In_Place ( arr , r , c ) ;
//        Rotate_90_Degrees ( arr , r , c ) ;
//        System.out.println ( " Enter Number : " ) ;
//        int n = scan.nextInt () ;
//        int [] [] ans = Pascals_Triangle ( n ) ;
//        Print_Array ( ans ) ;
//        int ans = Factorial ( n ) ;
//        System.out.println ( " Answer " + ans ) ;
        System.out.println ( " Row : " ) ;
        int r = scan.nextInt () ;
        System.out.println ( " Column : " ) ;
        int c = scan.nextInt () ;
        int [] [] arr = new int [ r ] [ c ] ;
        System.out.println ( " Array : " ) ;
        for ( int i = 0 ; i < r ; i ++ ) {
            for ( int j = 0 ; j < c ; j ++ ) {
                arr [ i ] [ j ] = scan.nextInt () ;
            }
        }
//        Print_Array ( arr ) ;
//        Spiral_Matrix ( arr , r , c ) ;
//        int [] [] ans = Spiral ( n ) ;
//        Print_Array ( ans ) ;
        System.out.println ( " Co-Ordinate L1 = " ) ;
        int l1 = scan.nextInt () ;
        System.out.println ( " Co-Ordinate R1 = " ) ;
        int r1 = scan.nextInt () ;
        System.out.println ( " Co-Ordinate L2 = " ) ;
        int l2 = scan.nextInt () ;
        System.out.println ( " Co-Ordinate R2 = " ) ;
        int r2 = scan.nextInt () ;
        Rectangle_Sum_Brut_Force ( arr , l1 , r1 , l2 , r2 ) ;
        System.out.println ( " Answer Sum 1 : " + Rectangle_Sum_Brut_Force ( arr , l1 , r1 , l2 , r2 ) ) ;
//        System.out.println ( " Answer Sum 2 : " + Rectangle_Sum_1 ( arr , l1 , r1 , l2 , r2 ) ) ;
        System.out.println ( " Answer Sum 2 : " + Rectangle_Sum_2 ( arr , l1 , r1 , l2 , r2 ) ) ;
    }
}
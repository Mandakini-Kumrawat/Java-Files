import java.util.Scanner ;
public class Binary_Search {
    static void Print_Array ( int [] a ) {
        for ( int i = 0 ; i < a.length ; i ++ ) {
            System.out.print ( " " + a [ i ] + " " ) ;
        }
        System.out.println () ;
    }
    static void Print_Matrix ( int [] [] arr ) {
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            for ( int j = 0 ; j < arr [ i ].length ; j ++ ) {
                System.out.print ( " " + arr [ i ] [ j ] + " " ) ;
            }
            System.out.println ( ) ;
        }
        System.out.println ( ) ;
    }
    static int Binary ( int [] a , int target ) {
        if ( a.length == 1 ) return a [ 0 ] ;
        int l = 0 , r = a.length - 1 , mid = -1 ;
        while ( l <= r ) {
            mid = ( l + r ) / 2 ;
            if ( a [ mid ] == target ) return mid ;
            else if ( a [ mid ] < target ) l = mid + 1 ;
            else r = mid - 1 ;
        }
        return mid ;
    }
    static int Recursion_Binary ( int [] a , int l , int r , int target ) {
        if ( l >= r ) return 0 ;
        int mid = ( l + r ) / 2 ;
        if ( a [ mid ] == target ) return mid ;
        else if ( a [ mid ] < target ) return Recursion_Binary ( a , mid + 1 , r , target ) ;
        else return Recursion_Binary ( a , l , mid - 1 , target ) ;
    }
    static int Binary_Ocurrance ( int [] a , int target ) {
        int l = 0 , r = a.length - 1 , ans = -1 ;
        while ( l <= r ) {
            int mid = l + ( r - l ) / 2 ;
            if ( a [ mid ] == target ) {
                ans = mid ;
                r = mid - 1 ;
            } else if ( a [ mid ] < target ) {
                l = mid + 1 ;
            } else {
                r = mid - 1 ;
            }
        }
        return ans ;
    }
    static int Binary_Square_Root ( int target ) {
        int l = 1 , r = target , ans = - 1 ;
        while ( l <= r ) {
            int mid = l + ( r - l ) / 2 ;
            if ( mid * mid == target ) { return mid ; }
            else if ( mid * mid < target ) { l = mid + 1 ; ans = mid ; }
            else { r = mid - 1 ; }
        }
        return ans ;
    }
    static int Rotated_Array_Minimum ( int [] a ) { // 14 20 29 35 45 50 12
        int l = 0 , r = a.length - 1 , ans = -1 ; //                     lr
        while ( l <= r ) {
            int mid = l + ( ( r - l ) / 2 ) ;
                if ( a [ r ] >= a [ mid ] ) {
                    ans = mid ; r = mid - 1 ;
                } else {
                    l = mid + 1 ;
                }
        }
        return ans ;
    }
    static int Rotated_Array_Target ( int [] a , int target ) {
        int l = 0 , r = a.length - 1 ;
        while ( l <= r ) {
            int mid = l + ( r - l ) / 2 ;
            if ( a [ mid ] == target ) {
                return mid ;
            } else if ( a [ mid ] < a [ r ] ) {
                if ( target > a [ mid ] && target <= a [ r ] ) l = mid + 1 ;
                else r = mid - 1 ;
            } else {
                if ( target < a [ mid ] && target >= a [ l ] ) r = mid - 1 ;
                else l = mid + 1 ;
            }
        }
        return - 1 ;
    }
    static int Rotated_Duplicate_Target ( int [] a , int target ) {
        int l = 0 , r = a.length - 1 ;
        while ( l <= r ) {
            int mid = l + ( r - l ) / 2 ;
            if ( a [ mid ] == target ) {
                return mid ;
            } else if ( a [ l ] == a [ mid ] && a [ mid ] == a [ r ] ) {
                l ++ ; r -- ;
            } else if ( a [ mid ] <= a [ r ] ) {
                if ( target > a [ mid ] && target <= a [ r ] ) l = mid + 1 ;
                else r = mid - 1 ;
            } else {
                if ( target < a [ mid ] && target <= a [ l ] ) r = mid - 1 ;
                else l = mid + 1 ;
            }
        }
        return - 1 ;
    }
    static boolean Matrix_Search_Target_1 ( int [] [] arr , int target ) {
        int m = arr.length , n = arr [ 0 ].length ;
        int l = 0 , r = m * n - 1 ;
        while ( l <= r ) {
            int mid = l + ( r - l ) / 2 ;
            if ( arr [ mid / n ] [ mid % n ] == target ) return true ;
            else if ( arr [ mid / n ] [ mid % n ] < target ) l = mid + 1 ;
            else r = mid - 1 ;
        }
        return false ;
    }
    static boolean Matrix_Search_Target_2 ( int [] [] arr , int target ) {
        int m = arr.length , n = arr [ 0 ].length ;
        int i = 0 , j = n - 1 ;
        while ( i < m && j >= 0 ) {
            if ( arr [ i ] [ j ] == target ) return true ;
            else if ( arr [ i ] [ j ] < target ) i ++ ;
            else j -- ;
        }
        return false ;
    }
    static int Mountain_Peak_Search_1 ( int [] a ) { // 3 4 8 12 15 10 2
        int l = 0 , r = a.length - 1 , ans = - 1 ; //          lr
        while ( l <= r ) { // ans = 15
            int mid = l + ( r - l ) / 2 ;
            if ( a [ mid ] < a [ mid + 1 ] ) {
                ans = a [ mid + 1 ] ;
                l = mid + 1 ;
            } else {
                r = mid - 1 ;
            }
        }
        return ans ;
    }
    static int Mountain_Peak_Search_2 ( int [] a ) {
        int l = 0 , r = a.length - 1 , ans = - 1 ;
        while ( l <= r ) {
            int mid = l + ( r - l ) / 2 ;
            if ( ( mid == 0 || a [ mid ] > a [ mid - 1 ] ) && ( mid == a.length - 1 || a [ mid ] > a [ mid + 1 ] ) )
            { return ans = a [ mid ] ; }
            else if ( a [ mid ] < a [ mid + 1 ] ) {
                ans = mid + 1 ;
                l = mid + 1 ;
            } else {
                ans = mid - 1 ;
                r = mid - 1 ;
            }
        }
        return ans ;
    }
    static boolean Divide_Chocolates ( int [] a , int s , int mid ) {
        int student = 1 , choc = 0 ;
        for ( int i = 0 ; i < a.length ; i ++ ) {
            if ( a [ i ] > mid ) return false ;
            if ( ( choc + a [ i ] <= mid ) ) {
                choc += a [ i ] ;
            } else {
                student ++ ;
                choc = a [ i ] ;
            }
        }
        return student <= s ;
    }
    static int Distribute_Chocolates ( int [] a , int s ) {
        int st = 0 , end = ( int ) 1e9 , ans = 0 ;
        while ( st <= end ) {
            int mid = st + ( end - st ) / 2 ;
            if ( Divide_Chocolates ( a , s , mid ) ) {
                ans = mid ;
                end = mid - 1 ;
            } else {
                st = mid + 1 ;
            }
        }
        return ans ;
    }
    static boolean Kids_Distance ( int [] a , int k , int mid ) {
        int kid = 1 , lastkid = a [ 0 ] ;
        for ( int i = 1 ; i < a.length ; i ++ ) {
            if ( ( a [ i ] - lastkid ) >= mid ) {
                kid ++ ;
                lastkid = a [ i ] ;
            }
        }
        return kid >= k ;
    }
    static int Race_Track ( int [] a , int k ) {
        if ( k > a.length ) return - 1 ;
        int st = 0 , end = ( int ) 1e9 , ans = 0 ;
        while ( st <= end ) {
            int mid = st + ( end - st ) / 2 ;
            if ( Kids_Distance ( a , k , mid ) ) {
                ans = mid ;
                st = mid + 1 ;
            } else {
                end = mid - 1 ;
            }
        }
        return ans ;
    }
    public static void main ( String [] args ) {
        Scanner scan = new Scanner(System.in);
        int [] a = { 1 , 2 , 4 , 8 , 9 } ;
//        int [] [] arr = { { 1 , 3 , 5 , 7 } , { 10 , 11 , 16 , 20 } , { 23 , 30 , 34 , 60 } } ;
//        int[][] arr = {{2, 4, 6, 8}, {5, 6, 7, 20}, {7, 11, 13, 25},
//                {12, 14, 17, 20}};
//        Print_Matrix(arr);
        Print_Array ( a ) ;
        int k = 3 ;
//        System.out.println ( " Answer Index : " + Binary ( a , target ) ) ;
//        System.out.println ( " Answer Index : " + Recursion_Binary ( a , 0 , a.length - 1 , target) );
//        System.out.println ( " Answer Index : " + Binary_Ocurrance ( a , target ) ) ;
//        System.out.println ( " Square Root : " + Binary_Square_Root ( target ) ) ;
//        System.out.println ( " Minimum Element Index : " + Rotated_Array_Minimum ( a ) ) ;
//        System.out.println ( " Target Element Index : " + Rotated_Array_Target ( a , target ) ) ;
//        System.out.println ( " Target Duplicate Element Index : " + Rotated_Duplicate_Target ( a , target ) ) ;
//        System.out.printf ( " %d : %b " , target , Matrix_Search_Target_1 ( arr , target ) ) ;
//        System.out.printf ( " %d : %b " , target , Matrix_Search_Target_2 ( arr , target ) ) ;
//        System.out.println ( " Peak Index : " + Mountain_Peak_Search_1 ( a ) ) ;
//        System.out.println ( " Peak Index : " + Mountain_Peak_Search_2 ( a ) ) ;
//        System.out.printf ( " Minimal Possible Distribution for %d : %d " , s , Distribute_Chocolates ( a , s ) ) ;
        System.out.printf ( " Maximum Possible Distance for %d : %d " , k , Race_Track ( a , k ) ) ;
    }
}

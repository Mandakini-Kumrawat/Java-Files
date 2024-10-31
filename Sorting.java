import java.util.ArrayList ;
import java.util.Collections ;
public class Sorting {
    static void Print_Array ( int [] a ) {
        for ( int i = 0 ; i < a.length ; i ++ ) {
            System.out.print ( " " + a [ i ] + " " ) ;
        }
        System.out.println () ;
    }
    static void Bubble_Sort ( int [] a ) {
        int n = a.length ;
        for ( int i = 0 ; i < n - 1 ; i ++ ) {
            boolean flag = false ;
            for ( int j = 0 ; j < n - i - 1 ; j ++ ) {
                if ( a [ j ] > a [ j + 1 ] ) {
                    int temp = a [ j ] ;
                    a [ j ] = a [ j + 1 ] ;
                    a [ j + 1 ] = temp ;
                    flag = true ;
                }
            }
            if ( ! flag ) return ;
        }
    }
    static void Selection_Sort ( int [] a ) { // 1 2 3 4 5
        int n = a.length ; // n = 5
        for ( int i = 0 ; i < n - 1 ; i ++ ) { // i = 0 1 2
            for ( int j = i + 1 ; j < n ; j ++ ) { // j = 3 4
                if ( a [ j ] < a [ i ] ) { //
                    int temp = a [ j ] ;
                    a [ j ] = a [ i ] ;
                    a [ i ] = temp ;
                }
            }
        }
    }
    static void Insertion_Sort ( int [] a ) { //
        int n = a.length ;
        for ( int i = 1 ; i < n ; i ++ ) {
            int j = i ;
            while ( j > 0 && a [ j ] < a [ j - 1 ] ) {
                int temp = a [ j ] ;
                a [ j ] = a [ j - 1 ] ;
                a [ j - 1 ] = temp ;
                j -- ;
            }
        }
    }
    static void Sort_0s ( int [] a ) {
        for ( int i = 0 ; i < a.length - 1 ; i ++ ) {
            for ( int j = 0 ; j < a.length - i - 1 ; j ++ ) {
                if ( a [ j ] == 0 && a [ j + 1 ] != 0 ) {
                    int temp = a [ j + 1 ] ;
                    a [ j + 1 ] = a [ j ] ;
                    a [ j ] = temp ;
                }
            }
        }
    }
    static void Lexicographical_String_Sort ( String [] s ) {
        for ( int i = 0 ; i < s.length - 1 ; i ++ ) {
            for ( int j = i + 1 ; j < s.length ; j ++ ) {
                if ( s [ i ].compareTo ( s [ j ] ) > 0 ) {
                    String temp = s [ i ] ;
                    s [ i ] = s [ j ] ;
                    s [ j ] = temp ;
                }
            }
        }
    }
    static void Merge_Function ( int [] a , int l , int mid , int r ) {
        int n1 = mid - l + 1 ;
        int n2 = r - mid ;
        int [] left = new int [ n1 ] ;
        int [] right = new int [ n2 ] ;
        for ( int i = 0 ; i < n1 ; i ++ ) left [ i ] = a [ l + i ] ;
        for ( int j = 0 ; j < n2 ; j ++ ) right [ j ] = a [ mid + 1 + j ] ;
        int i = 0 , j = 0 , k = l ;
        while ( i < n1 && j < n2 ) { // i = 1 , j = 2 , k = 3 , ans = 3 , 3 , 6
            if ( left [ i ] < right [ j ] ) {
                a [ k ++ ] = left [ i ++ ] ;
            } else if ( left [ i ] == right [ j ] ) {
                a [ k ++ ] = left [ i ++ ] ;
                a [ k ++ ] = right [ j ++ ] ;
            } else {
                a [ k ++ ] = right [ j ++ ] ;
            }
        }
        while ( i < n1 && n1 > 0 ) { // k = 1
            a [ k ++ ] = left [ i ++ ] ;
        }
        while ( j < n2 && n2 > 0 ) { // k = 1
            a [ k ++ ] = right [ j ++ ] ;
        }
    }
    static void Merge_Sort ( int [] a , int l , int r ) {
        if ( l >= r ) return ;
        int mid = ( l + r ) / 2 ;
        Merge_Sort ( a , l , mid ) ;
        Merge_Sort ( a , mid + 1 , r ) ;
        Merge_Function ( a , l , mid , r ) ;
    }
    static int Partition ( int [] a , int st , int ed ) {
        int pivot = a [ st ] ;
        int count = 0 ;
        for ( int i = st + 1 ; i <= ed ; i ++ ) {
            if ( a [ i ] <= pivot ) count ++ ;
        }
        int pivotIdx = st + count ;
        int temp = a [ st ] ;
        a [ st ] = a [ pivotIdx ] ;
        a [ pivotIdx ] = temp ;
        int i = st , j = ed ;
        while ( i < pivotIdx && j > pivotIdx ) {
            while ( a [ i ] < pivot ) i ++ ;
            while ( a [ j ] > pivot ) j -- ;
            if ( ( i < pivotIdx ) && ( j > pivotIdx ) ) {
                temp = a [ i ] ;
                a [ i ] = a [ j ] ;
                a [ j ] = temp ;
                i ++ ; j -- ;
            }
        }
        return pivotIdx ;
    }
    static void Quick_Sort ( int [] a , int st , int ed ) {
        if ( st >= ed ) return ;
        int pivot = Partition ( a , st , ed ) ;
        Quick_Sort ( a , st , pivot - 1 ) ;
        Quick_Sort ( a , pivot + 1 , ed ) ;
    }
    static void Count_Sort ( int [] a ) {
        int max = Integer.MIN_VALUE ;
        for ( int i = 0 ; i < a.length ; i ++ ) {
            if ( a [ i ] > max ) max = a [ i ] ;
        }
        int [] Freq = new int [ max + 1 ] ;
        for ( int i = 0 ; i < a.length ; i ++ ) {
            Freq [ a [ i ] ] ++ ;
        }
        for ( int i = 1 ; i < Freq.length ; i ++ ) {
            Freq [ i ] += Freq [ i - 1 ] ;
        }
        int [] output = new int [ a.length ] ;
        for ( int i = a.length - 1 ; i >= 0 ; i -- ) {
            int idx = Freq [ a [ i ] ] - 1 ;
            output [ idx ] = a [ i ] ;
            Freq [ a [ i ] ] -- ;
        }
        for ( int i = 0 ; i < a.length ; i ++ ) {
            a [ i ] = output [ i ] ;
        }
    }
    static void Radix_Count_Sort ( int [] a , int p ) {
        int [] Freq = new int [ 10 ] ;
        for ( int i = a.length - 1 ; i >= 0 ; i -- ) {
            Freq [ ( a [ i ] / p ) % 10 ] ++ ;
        }
        for ( int i = 1 ; i < 10 ; i ++ ) {
            Freq [ i ] += Freq [ i - 1 ] ;
        }
        int [] output = new int [ a.length ] ;
        for ( int i = a.length - 1 ; i >= 0 ; i -- ) {
            int idx = Freq [ ( a [ i ] / p ) % 10 ] - 1 ;
            output [ idx ] = a [ i ] ;
            Freq [ ( a [ i ] / p ) % 10 ] -- ;
        }
        for ( int i = 0 ; i < a.length ; i ++ ) {
            a [ i ] = output [ i ] ;
        }
    }
    static void Radix_Sort ( int [] a ) {
        int max = Integer.MIN_VALUE ;
        for ( int i = 0 ; i < a.length ; i ++ ) {
            if ( a [ i ] > max ) max = a [ i ] ;
        }
        for ( int p = 1 ; max / p > 0 ; p *= 10 ) {
            Radix_Count_Sort ( a , p ) ;
        }
    }
    static void Bucket_Sort ( int [] arr ) {
        int n = arr.length ;
        ArrayList < Float > [] buckets = new ArrayList [ n ] ;
        for ( int i = 0 ; i < n ; i ++ ) {
            buckets [ i ] = new ArrayList < Float > () ;
        }
        for ( int i = 0 ; i < n ; i ++ ) {
            int bucketindex = arr [ i ] * n ;
            buckets [ bucketindex ].add ((float) arr [ i ]) ;
        }
        for ( int i = 0 ; i < buckets.length ; i ++ ) {
            Collections.sort ( buckets [ i ] ) ;
        }
        int index = 0 ;
        for ( int i = 0 ; i < buckets.length ; i ++ ) {
            ArrayList < Float > currbucket = buckets [ i ] ;
//            for ( int j = 0 ; j < currbucket.size () ; j ++ ) arr[index++] = currbucket.get(j);
        }
    }
    static void Sort_Array ( int [] a ) {
        if ( a.length == 1 ) return ;
        int x = - 1 , y = - 1 ;
        for ( int i = 1 ; i < a.length ; i ++ ) {
            if ( a [ i - 1 ] > a [ i ] ) {
                if ( x == -1 ) { x = i - 1 ; y = i ; }
                else { y = i ; }
            }
        }
        int temp = a [ x ] ;
        a [ x ] = a [ y ] ;
        a [ y ] = temp ;
    }
    static void Sort_Positive_Negative ( int [] a ) {
        int l = 0 , r = a.length - 1 ;
        while ( l < r ) {
            while ( a [ l ] < 0 ) l ++ ;
            while ( a [ r ] >= 0 ) r -- ;
            if ( l < r ) {
                int temp = a [ l ] ;
                a [ l ] = a [ r ] ;
                a [ r ] = temp ;
                l ++ ; r -- ;
            }
        }
    }
    static void Sort_012 ( int [] a ) {
        int count_0 = 0 , count_1 = 0 , count_2 = 0 ;
        for ( int i : a ) {
            if ( i == 0 ) count_0 ++ ;
            else if ( i == 1 ) count_1 ++ ;
            else count_2 ++ ;
        }
        int k = 0 ;
        while ( count_0 > 0 ) {
            a [ k ++ ] = 0 ;
            count_0 -- ;
        }
        while ( count_1 > 0 ) {
            a [ k ++ ] = 1 ;
            count_1 -- ;
        }
        while ( count_2 > 0 ) {
            a [ k ++ ] = 2 ;
            count_2 -- ;
        }
    }
    static void Sort_012_Again ( int [] a ) {
        int low = 0 , mid = 0 , high = a.length - 1 ;
        while ( mid <= high ) {
            if ( a [ mid ] == 0 ) {
                int temp = a [ mid ] ;
                a [ mid ] = a [ low ] ;
                a [ low ] = temp ;
                low ++ ; mid ++ ;
            } else if ( a [ mid ] == 1 ) {
                mid ++ ;
            } else {
                int temp = a [ high ] ;
                a [ high ] = a [ mid ] ;
                a [ mid ] = temp ;
                high -- ;
            }
        }
    }
    public static void main ( String [] args ) {
        int [] a =  { 0 , 1 , 2 , 1 , 2 , 2 , 0 , 0 , 0 } ;
        float [] arr = { 0.5f , 0.4f , 0.3f , 0.2f , 0.1f } ;
        int n = a.length ;
        String [] s = { "college" , "kiwi" , "rat" , "ball" , "grape" } ;
//        Bubble_Sort ( a ) ;
//        Selection_Sort ( a ) ;
//        Insertion_Sort ( a ) ;
//        Sort_0s ( a ) ;
//        Lexicographical_String_Sort ( s ) ;
        Print_Array ( a ) ;
//        Merge_Sort ( a , 0 , n - 1 ) ;
//        Quick_Sort ( a , 0 , n - 1 ) ;
//        Count_Sort ( a ) ;
//        Radix_Sort ( a ) ;
//        Bucket_Sort ( arr ) ;
//        Sort_Array ( a ) ;
//        Sort_Positive_Negative ( a ) ;
//        Sort_012 ( a ) ;
//        Sort_012_Again ( a ) ;
        Print_Array ( a ) ;
    }
}

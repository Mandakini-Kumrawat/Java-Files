import java.util.HashMap ;
import java.util.Map ;
import java.util.LinkedList ;
import java.util.HashSet ;
public class HashMap_1 {
//    static class MyHashMap < K , V > {
//        public static final int Default_Capacity ;
//        public static final int Default_LoadFactor = 0.75f ;
//        private class Node {
//            K key;
//            V value;
//
//            Node(K key, V value) {
//                this.key = key;
//                this.value = value;
//            }
//
//            private int n;
//            private LinkedList<Node>[] buckets;
//
//            private void initBuckets(int N) {
//                buckets = new LinkedList[N];
//                for (int i = 0; i < buckets.length; i++) {
//                    buckets[i] = new LinkedList<>();
//                }
//            }
//
//            private int Hashfun(K key) {
//                int Hashcode = key.hashCode();
//                return Math.abs(Hashcode) % buckets.length;
//            }
//
//            private int Search_In_Bucket(LinkedList<Node> ll, K key) {
//                for (int i = 0; i < ll.size(); i++) {
//                    if (ll.get(i).key ==) return i;
//                }
//                return -1;
//            }
//
//            public MyHashMap {
//                initBuckets();
//            }
//
//            public int size() {
//                return n;
//            }
//
//            public void put(K key, V value) {
//                int bi = Hashfun(key);
//                LinkedList<Node> currbucket = buckets[bi];
//                int Entry_Index = Search_In_Bucket(currbucket, key);
//                if (Entry_Index == -1) {
//                    Node node = new Node(key, value);
//                    currbucket[bi].add(node);
//                    n++;
//                } else {
//                    Node currNode = currbucket.get(Entry_Index);
//                    currNode.value = value;
//                }
//            }
//
//            public V get(K key) {
//                int bi = Hashfun(key);
//                LinkedList<Node> currbucket = buckets[bi];
//                int Entry_Index = Search_In_Bucket(currbucket, key);
//                if (Entry_Index != -1) {
//                    Node currNode = currbucket.get(Entry_Index);
//                    return currNode.value;
//                }
//                return null;
//            }
//
//            public V remove(K key) {
//                int bi = Hashfun(key);
//                LinkedList<Node> currbucket = buckets[bi];
//                int Entry_Index = Search_In_Bucket(currbucket, key);
//                if (Entry_Index != -1) {
//                    Node currNode = currbucket.get(Entry_Index);
//                    V val = currNode.value;
//                    currbucket.remove(Entry_Index);
//                    n--;
//                    return val;
//                }
//            }
//        }
//    }

    static HashMap < Character , Integer > Frequency_Map ( String str ) {
        HashMap < Character , Integer > mp = new HashMap <> () ;
        for ( int i = 0 ; i < str.length () ; i ++ ) {
            Character ch = str.charAt ( i ) ;
            if ( ! mp.containsKey ( ch ) ) mp.put ( ch , 1 ) ;
            else mp.put ( ch , mp.get ( ch ) + 1 ) ;
        }
        return mp ;
    }
    public static boolean Anagram ( String str_1 , String str_2 ) {
        if ( str_1.length () != str_2.length () ) return false ;
        HashMap < Character , Integer > mp_1 = Frequency_Map ( str_1 ) ;
//        HashMap < Character , Integer > mp_2 = Frequency_Map ( str_2 ) ;
//        return mp_1.equals ( mp_2 ) ;
        for ( int i = 0 ; i < str_2.length () ; i ++ ) {
            Character ch = str_2.charAt ( i ) ;
            if ( mp_1.containsKey ( ch ) ) mp_1.put ( ch , mp_1.get ( ch ) - 1 ) ;
            else return false ;
        }
        for ( Integer e : mp_1.values () ) {
            if ( e != 0 ) return false ;
        }
        return true ;
    }
    public static boolean Isomorphic ( String str_1 , String str_2 ) {
        if ( str_1.length () != str_2.length () ) return false ;
        HashMap < Character , Character > mp = new HashMap <> () ;
        for ( int i = 0 ; i < str_1.length () ; i ++ ) {
            Character ch = str_1.charAt ( i ) ;
            if ( mp.get ( ch ) != str_2.charAt ( i ) ) return false ;
            else if ( mp.containsKey ( str_2.charAt ( i ) ) ) return false ;
            else mp.put ( ch , str_2.charAt ( i ) ) ;
        }
        return true ;
    }
    public static int [] Two_Sum ( int [] arr , int target ) {
        int n = arr.length ;
        HashMap < Integer , Integer > mp = new HashMap <> () ;
        int [] ans = { -1 } ;
        for ( int i = 0 ; i < n ; i ++ ) {
            int partner = target - arr [ i ] ;
            if ( mp.containsKey ( target - arr [ i ] ) ) {
                ans = new int [] { i , mp.get ( partner ) } ;
                return ans ;
            } else {
                mp.put ( arr [ i ] , i ) ;
            }
        }
        return ans ;
    }
    public static int Largest_Subarray ( int [] arr ) {
        if ( arr.length == 1 ) return 1 ;
        HashMap < Integer , Integer > mp = new HashMap <> () ;
        int Prefix_Sum = 0 , max = 0 ;
        mp.put ( 0 , -1 ) ;
        for ( int i = 0 ; i < arr.length ; i ++ ) {
            Prefix_Sum += arr [ i ] ;
            if ( mp.containsKey ( Prefix_Sum ) ) max = Math.max ( max , i - mp.get ( Prefix_Sum ) ) ;
            else mp.put ( Prefix_Sum , i ) ;
        }
        return max ;
    }
    public static int Longest_Consecutive_Array ( int [] arr ) {
        HashSet < Integer > hs = new HashSet <> () ;
        for ( int num : arr ) hs.add ( num ) ;
        int maxStreak = 0 ;
        for ( int num : hs ) {
            if ( ! hs.contains ( num - 1 ) ) {
                int currNum = num ;
                int currStreak = 1 ;
                while ( hs.contains ( num + 1 ) ) {
                    currStreak ++ ;
                    currNum ++ ;
                }
                maxStreak = Math.max ( maxStreak , currStreak ) ;
            }
        }
        return maxStreak ;
    }
    public static int Maximum_Numbers_Table ( int [] bag ) {
        HashSet < Integer > table = new HashSet <> () ;
        int max = 0 ;
        for ( int i = 0 ; i < bag.length ; i ++ ) {
            int num = bag [ i ] ;
            if ( table.contains ( num ) ) {
                table.remove ( num ) ;
            } else {
                table.add ( num ) ;
                max = Math.max ( max , table.size () ) ;
            }
        }
        return max ;
    }
    public static void main ( String [] args ) {
//        Map < Integer , String > mp = new HashMap <> () ;
//        mp.put ( 21 , "Akash" ) ;
//        mp.put ( 16 , "Yash" ) ;
//        mp.put ( 17 , "Lav" ) ;
//        mp.put ( 19 , "Rishika" ) ;
//        mp.put ( 18 , "Harry" ) ;
//
//        // Get A Value Of A Key -
//        System.out.println ( " Value Of 17 " + mp.get ( 17 ) ) ; // Lav   , If Key Exists.
//        System.out.println ( " Value Of 10 " + mp.get ( 17 ) ) ; // null  , If Key Doesn't Exist.
//
//        // Change A Key -
//        mp.put ( 21 , "Ash" ) ;
//        System.out.println ( " Changing Key : " + mp.get ( 21 ) ) ; // null
//        System.out.println ( " Changing Key : " + mp.get ( 20 ) ) ; // Ash -> 21  , Changed Key
//
//        // Removing A Pair Of From The HashMap -
//        System.out.println ( " Removing Rishika : " + mp.remove ( 19 ) ) ; // Remove 19 , if Exists.
//        System.out.println ( " Removing null : " + mp.remove ( 29 ) ) ; // null , if Doesn't Exists.
//
//        // Check If A Key Exits In HashMap Or Not -
//        System.out.println ( " Checking : " + mp.containsKey ( 20 ) ) ; // True , If Exists.
//        System.out.println ( " Checking : " + mp.containsKey ( 19 ) ) ; // False , If Doesn't Exits.
//
//        // Adding A New Entry , Only If New Key Doesn't Exits Already. -
//        mp.putIfAbsent ( 19 , "Rishika" ) ;
//        mp.putIfAbsent ( 18 , "Orry" ) ;
//        System.out.println ( " Rishika : " + mp.get ( 19 ) ) ;
//        System.out.println ( " Orry : " + mp.get ( 18 ) ) ;
//
//        // Get All The Keys In The HashMap. -
//        System.out.println ( " All Keys : " + mp.keySet () ) ;
//
//        // Get All The Values In The HashMap. -
//        System.out.println ( " All Values : " + mp.values () ) ;
//
//        // Get All The Entries In HashMap. -
//        System.out.println ( " All Enrties : " + mp.entrySet () ) ;
//
//        // Traversing All Entries Of HashMap -
//        for ( Integer key : mp.keySet () ) {
//            System.out.printf ( " %d - %s " , key , mp.get ( key ) ) ;
//        }
//        System.out.println () ;
//        for ( Map.Entry < Integer , String > e : mp.entrySet () ) {
//            System.out.printf ( " %s - %d " , e.getValue ( ) , e.getKey () ) ;
//        }
//        System.out.println () ;
//
//        // 1. Given An Array , Find The Most Frequent Element In It. If There Are Multiple Elements That
//        //    Appear A Maximum Number Of Times , Print Any One Of Them.
//        int [] arr = { 1 , 3 , 2 , 1 , 4 , 1 } ;
//        int n = arr.length ;
//        Map < Integer , Integer > mp = new HashMap <> () ;
//        for ( int el : arr ) {
//            if ( ! mp.containsKey ( el ) ) mp.put ( el , 1 ) ;
//            else mp.put ( el , mp.get ( el ) + 1 ) ;
//        }
//        System.out.println ( " Frequency Map : " ) ;
//        System.out.print ( mp.entrySet () ) ;
//        System.out.println () ;
//        int max_count = 0 , ans_key = -1 ;
//        for ( var e : mp.entrySet () ) {
//            if ( e.getValue () > max_count ) {
//                max_count = e.getValue () ;
//                ans_key = e.getKey () ;
//            }
//        }
//        System.out.println ( " Key : " + ans_key + " Count : " + max_count ) ;
//        System.out.println () ;

        // 1. Find Two Strings Are Anagram Or Not.
//        String str_1 = "keen" ;
//        String str_2 = "knee" ;
//        if ( Anagram ( str_1 , str_2 ) ) System.out.println ( " Yes ! " ) ;
//        else System.out.println ( " No ! " ) ;

        // 2. Find Two Strings Are Isomorphic Or Not.
//        String str_1 = "aab" ;
//        String str_2 = "xxy" ;
//        if ( Isomorphic ( str_1 , str_2 ) ) System.out.println ( " Yes ! " ) ;
//        else System.out.println ( " No ! " ) ;

        // 3. Given An Array Of Length n And A Target , Return A Pair ( Indices ) Whose Sum Is Equal To The
        //    Target. If There Is No Pair Present , Return - 1.
//        int [] arr = { 3 , 4 , 5 , 7 } ;
//        int target = 6 ;
//        int [] ans = Two_Sum ( arr , target ) ;
//        for ( int i = 0 ; i < ans.length ; i ++ ) {
//            System.out.print ( " " + ans [ i ] + " " ) ;
//        }
//        System.out.println () ;

        // 4. Given An Array arr [] Of Length N , Find The Length Of The Largest SubArray With Sum Equal
        //    0.
//        int [] arr = { 15 , -2 , 2 , -8 , 1 , 7 , 10 , 23 } ;
//        System.out.println ( " SubArray : " + Largest_Subarray ( arr ) ) ;

        // HashSet -
//        HashSet < String > hs = new HashSet <> () ;
//        hs.add ( " Vivek " ) ;
//        hs.add ( " Ashwin " ) ;
//        hs.add ( " Kartik " ) ;
//        hs.add ( " Swati " ) ;
//        hs.add ( " Scott " ) ;
//        System.out.println ( hs ) ;
//        System.out.println ( hs.contains ( " James " ) ) ; // False
//        System.out.println ( " Size : " + hs.size () ) ;
//        System.out.println ( hs.contains ( " Scott " ) ) ; // True
//        System.out.println ( " Size : " + hs.size () ) ;

        // 1. Given An Array , Find Longest Consecutive Numbers In Array.
//        int [] arr = { 99 , 100 , 1 , 4 , 3 , 200 , 2 } ;
//        System.out.println ( " Longest Consecutive Array : " + Longest_Consecutive_Array ( arr ) ) ;

        // 2. You Are Given N Distinct Pairs. Each Pair Is Numbered From 1 To N. All These Pairs ArE
        //    Initially Put In A Bag. You Need To Pair Up Each Number. You Take Numbers One By One From
        //    The Bag And For Each You Look Whether The Pair This Number Has Already Been Taken Out Of
        //    The Bag , Or Not. If Not ( That Means The Pair Of This Number Is Still In The Bag ) , You
        //    Put The Current Number On The Table In Front Of Him. Otherwise , You Put Both Numbers From
        //    The Pair Aside. Print The Maximum Number Of Numbers That Were on The Table At The Same Time.
        int [] bag = { 2 , 1 , 1 , 3 , 2 , 3 } ; // Output - 2
        System.out.println ( " Maximum Numbers On The Table : " + Maximum_Numbers_Table ( bag ) ) ;
    }
}

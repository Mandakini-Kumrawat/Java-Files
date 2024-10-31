import Package_1.SubPackage.App;

public class Outside_Package_1 {
    public static void main ( String [] args ) {
        App obj = new App() ;
        System.out.println ( " Outside Package : Non - Child Class" + obj.str1 ) ;
        App3 obj1 = new App3 () ;
        obj1.Print_From_Child_Class() ;
    }
}
class App3 extends App {
    void Print_From_Child_Class () {
        App3 obj = new App3 () ;
        System.out.println ( " Outside Package : Child Class : " + obj.str1 ) ;
    }
}

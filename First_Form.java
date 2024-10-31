import javax.swing.JFrame ;
import javax.swing.JLabel ;
import java.awt.*;

public class First_Form {
    public static void main ( String [] args ) {
        Abc obj = new Abc () ;
    }
}
class Abc extends JFrame {
    public Abc () {
        setLayout ( new FlowLayout () ) ;
        JLabel l = new JLabel ( " Hello World " ) ;
        JLabel l1 = new JLabel ( " Welcome MK " ) ;
        add ( l ) ;
        add ( l1 ) ;
        setVisible ( true ) ;
        setSize ( 400 , 400 ) ;
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
    }
}
import javax.swing.* ;
import java.awt.FlowLayout ;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent ;

public class Calc {
    public static void main ( String [] args ) {
        AddSub obj = new AddSub () ;
    }
}
class AddSub extends JFrame implements ActionListener {
    JTextField tf1 , tf2 ;
    JButton b1 , b2 ;
    JLabel l ;
    public AddSub () {
        tf1 = new JTextField ( 15 ) ;
        tf2 = new JTextField ( 15 ) ;
        b1 = new JButton ( " Addition " ) ;
        b2 = new JButton ( " Subtraction " ) ;
        l = new JLabel ( " Result : " ) ;
        add ( tf1 ) ; add ( tf2 ) ; add ( b1 ) ; add ( b2 ) ; add ( l ) ;
        setLayout ( new FlowLayout () ) ;
        setSize ( 400 , 400 ) ;
        setVisible ( true ) ;
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
        b1.addActionListener ( this ) ;
        b2.addActionListener ( this ) ;
    }
    public void actionPerformed ( ActionEvent ae ) {
        int num1 = Integer.parseInt ( tf1.getText () ) ;
        int num2 = Integer.parseInt ( tf2.getText () ) ;
        int value = 0 ;
        if ( ae.getSource() == b1 ) value = num1 + num2 ;
        else value = num1 - num2 ;
        l.setText ( value + "" ) ;
    }
}

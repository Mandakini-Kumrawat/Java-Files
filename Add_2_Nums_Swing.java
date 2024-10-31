import java.awt.FlowLayout ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Add_2_Nums_Swing {
    public static void main ( String [] args ) {
        Addition obj = new Addition () ;
    }
}
class Addition extends JFrame implements ActionListener {
    JTextField tf1 ; JTextField tf2 ; JButton b ; JLabel l ;
     public Addition () {
        tf1 = new JTextField (10 ) ;
        tf2 = new JTextField (10 ) ;
        b = new JButton ( " OK " ) ;
        l = new JLabel ( " Result : " ) ;
        add ( tf1 ) ; add ( tf2 ) ; add ( b ) ; add ( l ) ;
        b.addActionListener ( this ) ;
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed ( ActionEvent ae ) {
         int num1 = Integer.parseInt ( tf1.getText () ) ;
         int num2 = Integer.parseInt ( tf2.getText () ) ;
         int value = num1 + num2 ;
         l.setText ( value + "" ) ;
    }
}

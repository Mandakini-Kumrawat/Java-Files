/*import javax.swing.* ;
import java.awt.FlowLayout ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton {
    public static void main ( String [] args ) {
        Radio obj = new Radio () ;
    }
}
class Radio extends JFrame {
    JTextField tf ;
    JButton b ;
    JRadioButton rb1 , rb2 ;
    JLabel l ;
    public Radio () {
        tf = new JTextField ( 15 ) ;
        b = new JButton ( " OK " ) ;
        rb1 = new JRadioButton ( " Male " ) ;
        rb2 = new JRadioButton ( " Female " ) ;
        l = new JLabel ( " Greetings " ) ;
        ButtonGroup bg = new ButtonGroup () ;
        bg.add ( rb1 ) ;
        bg.add ( rb2 ) ;
        add ( tf ) ; add ( b ) ; add ( rb1 ) ; add ( rb2 ) ; add ( l ) ;
        b.addActionListener( new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                String name = tf.getText () ;
                if ( rb1.isSelected () ) {
                    name = " Mr. " + name ;
                } else {
                    name = " Ms. " + name ;
                }
            }
        });
        setVisible ( true ) ;
        setSize ( 400 , 400 ) ;
        setLayout ( new FlowLayout () ) ;
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
    }
}*/

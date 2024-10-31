import javax.swing.* ;
import java.awt.FlowLayout ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calling_Frame {
    public static void main ( String [] args ) {
        First obj = new First () ;
    }
}
class First extends JFrame {
    JButton b ;
    First () {
        b = new JButton ( " Addition Form " ) ;
        JProgressBar p = new JProgressBar ( 0 , 20 ) ;
        Timer t = new Timer ( 1000 , new ActionListener () {
            public void ActionPerformed ( ActionEvent e ) {

            }
        }) ;
        add ( b ) ; add ( p ) ;
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Addition () ;
                dispose () ;
            }
        });
        setVisible ( true ) ;
        setSize ( 400 , 400 ) ;
        setLayout ( new FlowLayout () ) ;
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
    }
}

import javax.swing.* ;
import java.awt.event.* ;
public class SFrameExample {
    SFrameExample () {
        JFrame f = new JFrame ( "Swing" ) ;
        JButton b = new JButton ( "Click" ) ;
        f.setSize ( 400 , 400 ) ;
        f.setVisible ( true ) ;
        f.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
        f.add ( b ) ;
        f.setLayout ( null ) ;
        b.setBounds ( 150 , 150 , 100 , 30 ) ;
        b.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        b.setText ( "Hi ! Clicked " ) ;
                    }
                }
        );
    }
    public static void main ( String [] args ) {
        new SFrameExample () ;
    }
}

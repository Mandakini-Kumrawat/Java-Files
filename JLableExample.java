import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.border.Border ;
public class JLableExample {
    JLableExample () {
        JFrame f = new JFrame ( " MK " ) ;
        f.setLayout ( new FlowLayout () ) ;
        JLabel l = new JLabel ( " Welcom " ) ; f.add ( l ) ;
        Border border = BorderFactory.createLineBorder ( Color.BLACK ) ;
//        ImageIcon img = new ImageIcon ( " " ) ;

        // l.setFont ()  -  l.getFont ()  -> Set and Get Label's Font Family , Style , Size ;
        l.setFont ( new Font ( "Verdana" , Font.BOLD , 20 ) ) ;
        System.out.println ( " FONT - " + l.getFont () ) ;

        // l.setForeground ()  -  l.getForeground ()  -> Set and Get Label's Color ;
//        l.setForeground ( Color.RED ) ;
//        System.out.println ( " Foreground - " + l.getForeground () ) ;

        // l.setBackground ()  -  l.getBackground ()  -> Set and Get The Background Color Of Component ;
        l.setBackground ( Color.PINK ) ;
        System.out.println ( " Backgrond Color - " + l.getBackground () ) ;

        // l.setOpaque ()  -  l.isOpaque () -> Set The Component Transparent and is The true ; In Order To See The Background Color.
        l.setOpaque ( true ) ;
        System.out.println ( " Transparent - " + l.isOpaque () ) ;

        // l.setHorizontalAlignment ()  -  l.getHorizontalAlignment () -> Align The Label's Content Horizontally Along The X Axis.
//        l.setHorizontalAlignment ( JLabel.RIGHT ) ;
//        System.out.println ( " Horizontal Alignment - " + l.getHorizontalAlignment () ) ;

        // l.setVerticalAlignment ()  -  l.getverticalAlignment () -> Align The Label's Content Vertically Along The Y Axis.
//        l.setVerticalAlignment ( JLabel.BOTTOM ) ;
//        System.out.println ( " Vertical Alignment - " + l.getVerticalAlignment () ) ;

        // l.setDisplayedMnemonic ()  -  l.getDisplayedMnemonic () -> Set A Mnemonic Key / Keycode / Specific Character and Highlight it And Returns That Mnemonic Key.
        l.setDisplayedMnemonic ( 'c' ) ;
        System.out.println ( "Mnemonic Key - " + l.getDisplayedMnemonic () ) ;

        // l.setToolTipText () - l.getToolTipText () -> Registers The Text to Display Under The Label in a Tool Tip And Returns The Tool Tip String That's Been Set in Console.
        l.setToolTipText ( " Welcome Text " ) ;
        System.out.println ( " Tool Tip Text - " + l.getToolTipText () ) ;

        // l.setBorder ()  -  l.getBorder ()  -> Set The Border Of Component and Returns The Border Of Component Or Null , if No border Is Currently Set.
        l.setBorder ( border ) ;
        System.out.println ( " Border - " + l.getBorder () ) ;

        // l.setIcon ()  -  l.getIcon () -> Set The Icon And Get The Icon ; Image File Should Be in The Same Folder As This File.
//        l.setIcon ( img ) ;
//        f.add ( new JLable ( l.getIcon () ) ) ;

        // l.setEnabled ()  -  l.getEnabled () -> Enable And Disable The Component. Returns True If Enabled ; False Otherwise.
        l.setEnabled ( true ) ;
        System.out.println ( " Enabled Or Disabled - " + l.isEnabled () ) ;

        // l.setDisabledIcon ()  -  l.getDisabledIcon () -> Set The Icon To Be Displayed If The Label Is "Disabled" and Returns The Icon Used By The Label When It's Disabled.
//        l.setDisabledIcon ( img ) ;
//        f.add ( new JLabel ( l.getDisabledIcon () ) ) ;

        // l.setLabelFor ()  -  l.getLabelFor () -> Set The Component For Labelling and Returns The Component Set For Labellling.
        JLabel l1 = new JLabel ( " Username " ) ;
        JTextField tf1 = new JTextField ( 10 ) ;
        l1.setDisplayedMnemonic ( 'U' ) ;
        JLabel l2 = new JLabel ( " Password " ) ;
        JTextField tf2 = new JTextField ( 10 ) ;
        l1.setDisplayedMnemonic ( 'P' ) ;
        l1.setLabelFor ( tf1 ) ; l2.setLabelFor ( tf2 ) ;
        f.add ( l1 ) ; f.add ( tf1 ) ; f.add ( l2 ) ; f.add ( tf2 ) ;
        System.out.println ( " Label For Username - " + l1.getLabelFor () ) ;
        System.out.println ( " Label For Password - " + l2.getLabelFor () ) ;
        f.setSize ( 500 , 500 ) ;
        f.setVisible ( true ) ;
        f.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
    }
    public static void main ( String [] args ) {
        new JLableExample () ;
    }
}
import javax.swing.JFrame;

public class KolorTest {

        public static void main(String[] args) {
            Kolor panel = new Kolor();

            JFrame application = new JFrame();

            application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//            application.add( panel );
            application.setSize(230, 250);
            application.setVisible( true );
        }

}

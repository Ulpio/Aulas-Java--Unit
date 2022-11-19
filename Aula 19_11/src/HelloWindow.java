import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HelloWindow {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setTitle("Hola Juan carlos chupa pika");
        frame.setVisible(true);

        JLabel label = new JLabel("Opa, me passa o seu Koo",SwingConstants.CENTER);
        frame.add(label);
    }
}

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {
    public MyFrame() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10,20));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }

    //public static void main(String[] args) {
    //    MyFrame frame = new MyFrame();
    //    frame.setTitle("ShowFlowLayout");
    //    frame.setSize(200, 200);
    //    frame.setLocationRelativeTo(null);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    frame.setVisible(true);
    //}
}

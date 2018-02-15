import java.awt.*;
import javax.swing.*;

public class TestImageIcon extends JFrame {
    private ImageIcon usIcon = new ImageIcon("IMG_2269.JPG");

    public TestImageIcon() {
        setLayout(new GridLayout(1,4,5,5));
        add(new JLabel(usIcon));
    }
    //public static void main(String[] args) {
    //    TestImageIcon frame = new TestImageIcon();
    //    frame.setTitle("TestImageIcon");
    //    frame.setSize(200,200);
    //    frame.setLocationRelativeTo(null);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    frame.setVisible(true);
    //}
}

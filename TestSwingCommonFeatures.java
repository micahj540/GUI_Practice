import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class TestSwingCommonFeatures extends JFrame {
    public TestSwingCommonFeatures() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
        JButton jbtLeft = new JButton("Left");
        JButton jbtCenter = new JButton("Center");
        JButton jbtRight = new JButton("Right");
        jbtLeft.setBackground(Color.WHITE);
        jbtCenter.setForeground(Color.GREEN);
        jbtRight.setToolTipText("This is the Right button");
        p1.add(jbtLeft);
        p1.add(jbtCenter);
        p1.add(jbtRight);
        p1.setBorder(new TitledBorder("Three Buttons"));
        p1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        Font largeFont = new Font("TimesRoman",Font.BOLD,20);
        Border lineBorder = new LineBorder(Color.BLACK,2);

        JPanel p2 = new JPanel(new GridLayout(1,2,5,5));
        JLabel jiblRed = new JLabel("Red");
        JLabel jiblOrange = new JLabel("Orange");
        jiblRed.setForeground(Color.RED);
        jiblOrange.setForeground(Color.ORANGE);
        jiblRed.setFont(largeFont);
        jiblOrange.setFont(largeFont);
        jiblRed.setBorder(lineBorder);
        jiblOrange.setBorder(lineBorder);
        p2.add(jiblRed);
        p2.add(jiblOrange);
        p2.setBorder(new TitledBorder("Two Labels"));

        setLayout(new GridLayout(2,1,5,5));
        add(p1);
        add(p2);
    }
    public static void main(String[] args) {
        TestSwingCommonFeatures frame = new TestSwingCommonFeatures();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(300,150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

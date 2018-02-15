

import javax.swing.*;
import java.awt.*;

public class Testing extends JFrame{
    public Testing() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,5));
        p1.add(new JButton("Move"));
        p1.add(new JButton("Health"));
        p1.add(new JButton("Stop"));
        p1.add(new JButton("Look"));
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout());
        p2.add(new JTextField("Here is what you may do"), BorderLayout.NORTH);
        p2.add(p1,BorderLayout.CENTER);
    }
    //public static void main(String[] args) {
    //    JFrame frame = new JFrame();
    //    frame.setTitle("Actions");
    //    frame.setSize(400,400);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    frame.setLocationRelativeTo(null);
    //    frame.setVisible(true);
//
    //}
}

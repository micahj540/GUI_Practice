import javax.swing.*;
import java.awt.*;

public class ShowGridLayout extends JFrame {
    public ShowGridLayout() {
        setLayout(new BorderLayout(5,10));

        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("North"),BorderLayout.NORTH);
    }
    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

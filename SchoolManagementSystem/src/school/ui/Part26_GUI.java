package school.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Part26_GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("School Management Dashboard");
        JLabel label = new JLabel("Welcome to the GUI Application", JLabel.CENTER);

        frame.add(label);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
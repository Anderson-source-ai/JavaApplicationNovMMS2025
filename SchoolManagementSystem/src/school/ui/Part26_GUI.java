package school.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Part26_GUI {
    public void renderWindow() {
        JFrame frame = new JFrame("School Management System");
        frame.add(new JLabel("Welcome to School Dashboard"));
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProfilePanel extends JPanel {
    public ProfilePanel(MainFrame frame) {
        setLayout(new GridLayout(5, 2, 10, 10));

        JTextField user = new JTextField();
        JTextField school = new JTextField();
        JTextField session = new JTextField();

        add(new JLabel("Username"));
        add(user);
        add(new JLabel("School"));
        add(school);
        add(new JLabel("Session"));
        add(session);

        JButton next = new JButton("Continue");
        next.addActionListener(e -> {
            if (user.getText().isEmpty() && school.getText().isEmpty() && session.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all of the fields.");
            } else if (user.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill username field.");
            } else if (school.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill school field.");
            } else if (session.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill session field.");
            } else {
                frame.next("define");
            }
        });

        add(next);
    }
}

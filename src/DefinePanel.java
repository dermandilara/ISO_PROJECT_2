package gui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DefinePanel extends JPanel {
    public DefinePanel(MainFrame frame) {
        JRadioButton product = new JRadioButton("Product");
        JRadioButton process = new JRadioButton("Process");

        ButtonGroup group1 = new ButtonGroup();
        group1.add(product);
        group1.add(process);

        JRadioButton education = new JRadioButton("Education");
        JRadioButton health = new JRadioButton("Health");

        ButtonGroup group2 = new ButtonGroup();
        group2.add(education);
        group2.add(health);

        JComboBox<String> scenario = new JComboBox<>(new String[] {"Scenario C", "Scenario D"});

        JButton next = new JButton("Next");

        add(product);
        add(process);
        add(education);
        add(health);
        add(scenario);
        add(next);

        next.addActionListener(e -> frame.next("plan"));
    }
}

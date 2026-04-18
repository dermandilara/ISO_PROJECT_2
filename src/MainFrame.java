package gui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    private final CardLayout layout = new CardLayout();
    private final JPanel panel = new JPanel(layout);

    public MainFrame() {
        setTitle("ISO 15939 SIMULATOR");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.add(new ProfilePanel(this), "profile");
        panel.add(new DefinePanel(this), "define");
        panel.add(new PlanPanel(this), "plan");
        panel.add(new CollectPanel(this), "collect");
        panel.add(new AnalysePanel(this), "analyse");

        add(panel);
        setVisible(true);
    }

    public void next(String name) {
        layout.show(panel, name);
    }
}

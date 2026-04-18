package gui;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import model.DataStore;
import model.Dimension;
import model.Metric;

public class AnalysePanel extends JPanel{

    public AnalysePanel(MainFrame frame){
        List<Dimension> dims = DataStore.getData();

        double minScore = 10;
        Dimension worst = null;

        for(Dimension d : dims){
            for (Metric m : d.metrics) {
                m.calculateScore();
            }
            double s = d.getScore();

            JProgressBar bar = new JProgressBar(0,5);
            bar.setValue((int)s);
            bar.setString(d.name+" : "+s);
            bar.setStringPainted(true);

            add(bar);

            if(s < minScore){
                minScore = s;
                worst = d;
            }
        }

        if (worst != null) {
            JLabel gap = new JLabel("Worst: " + worst.name + " Gap: " + (5 - minScore));
            add(gap);
        }
    }
}

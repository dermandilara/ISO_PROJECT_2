package gui;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DataStore;
import model.Dimension;
import model.Metric;

public class PlanPanel extends JPanel{

    public PlanPanel(MainFrame frame){

        String[] col = {"Metric", "Coeff", "Range"};

        DefaultTableModel tableModel = new DefaultTableModel(col,0);

        List<Dimension> dimensions = DataStore.getData();
        for(Dimension d : dimensions){
            for(Metric m : d.metrics){
                tableModel.addRow(new Object[]{m.name, m.coeff, m.min+"-"+m.max});
            }
        }

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table));

        JButton next = new JButton("Next");
        next.addActionListener(e -> frame.next("collect"));
        add(next);
    }
}

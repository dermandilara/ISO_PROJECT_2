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

public class CollectPanel extends JPanel {
    public CollectPanel(MainFrame frame){

        String[] col = {"Metric", "Value", "Score"};
        DefaultTableModel tableModel = new DefaultTableModel(col,0);

        List<Dimension> dims = DataStore.getData();

        for(Dimension d : dims){
            for(Metric m : d.metrics){
                m.calculateScore();
                tableModel.addRow(new Object[]{m.name, m.value, m.score});
            }
        }
        JTable table = new JTable(tableModel);
        add(new JScrollPane(table));

        JButton next = new JButton("Next");
        next.addActionListener(e -> frame.next("analyse"));
        add(next);
    }
}

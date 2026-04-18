package model;
import java.util.*;

public class DataStore {

    public static List<model.Dimension> getData(){
        List<model.Dimension> list = new ArrayList<>();

        model.Dimension usability = new model.Dimension("Usability",25);
        usability.metrics.add(new model.Metric("User Satisfaction", 50, 0, 100, 85, true));
        usability.metrics.add(new model.Metric("Login Time", 50, 0, 60, 10, false));

        model.Dimension perf = new model.Dimension("Performance", 20);
        perf.metrics.add(new model.Metric("Video Start", 50, 0, 15, 5, false));
        perf.metrics.add(new model.Metric("Users", 50, 0, 600, 400, true));

        model.Dimension security = new model.Dimension("Security",15);
        security.metrics.add(new model.Metric("Vulnerability Count",50,0,50,10,false));
        security.metrics.add(new model.Metric("Encryption Rate",50,0,100,90,true));

        list.add(security);
        list.add(usability);
        list.add(perf);

        return list;
    }
}

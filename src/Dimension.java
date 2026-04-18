package model;

import java.util.*;

public class Dimension {
    public String name;
    public int coeff;
    public List<model.Metric> metrics = new ArrayList<>();

    public Dimension(String name, int coeff){
        this.name = name;
        this.coeff = coeff;
    }

    public double getScore(){
        double total = 0, sum = 0;
        for(model.Metric metric:metrics){
            total += metric.score * metric.coeff;
            sum += metric.coeff;
        }

        return total/sum;
    }

}

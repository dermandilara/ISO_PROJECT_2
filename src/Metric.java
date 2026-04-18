package model;

public class Metric {
    public String name;
    public double min, max, value, score;
    public int coeff;
    public boolean higherBetter;

    public Metric(String name, int coeff, double min, double max, double value, boolean hb){
        this.name = name;
        this.coeff = coeff;
        this.min = min;
        this.max = max;
        this.value = value;
        this.higherBetter = hb;
    }

    public void calculateScore(){
        if(higherBetter){
            score = 1 + (value-min)/(max-min)*4;
        }
        else {
            score = 5 - (value-min)/(max-min)*4;
        }
        score = Math.round(score*2)/2.0;
    }

}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<Double>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    @Override
    public String toString() {
        return this.changeHistory.toString();
    }


    

    public double maxValue() {
        double currentMaxValue = 0.0;
        for (double currentValue : this.changeHistory) {
            if (currentValue >= currentMaxValue) {
                currentMaxValue = currentValue;
            }
        }
        return currentMaxValue;
    }

    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double finalMinValue = this.changeHistory.get(0);

        for (double value : this.changeHistory) {
            if (value <= finalMinValue) {
                finalMinValue = value;
            }
        }
        return finalMinValue;

    }

    public double average() {
        double averageValue = 0.0;
        int count = this.changeHistory.size();
        for (double currentValue : this.changeHistory) {
            averageValue += currentValue;
        }
        return averageValue / count;
    }

}

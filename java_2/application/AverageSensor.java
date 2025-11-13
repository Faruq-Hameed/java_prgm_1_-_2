package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readingHistory;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readingHistory = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        return allOn();
    } // returns true if the sensor is on

    @Override
    public void setOn() {
        // set all on
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }

    } // sets the sensor on

    @Override
    public void setOff() {
        this.sensors.get(0).setOff();
    } // sets the sensor off

    @Override
    public int read() {
        // return average of all sensors
        if (isOff() || sensors.size() == 0) {
            throw new IllegalStateException("AverageSensor is off or has no sensors");
        }
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int average = sum / sensors.size();
        readingHistory.add(average); // Store the reading

        return average;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    private boolean allOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    private boolean isOff() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> readings() {
        return new ArrayList<>(readingHistory); // Return a copy to preserve encapsulation
    }
}

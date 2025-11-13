package application;

public class StandardSensor implements Sensor {
    private int value;
    private boolean isOn;

    public StandardSensor(int value) {
        this.value = value;
        this.isOn = true;
    }

    @Override
    public boolean isOn() {
        return isOn;
    } // returns true if the sensor is on

    @Override
    public void setOn() {
        // this.isOn = true;
    } // sets the sensor on

    @Override
    public void setOff() {
    } // sets the sensor off

    @Override
    public int read() {
        return this.value;
    }
}

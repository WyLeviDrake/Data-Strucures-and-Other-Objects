package Thermometer;
public class Thermometer {
    
    private double tempC;

    public Thermometer() {
        tempC = 0;
    }

    public void setCelcius(double temp) {
        tempC = temp;
    }
    public void setFahrenheit(double temp) {
        tempC = (temp - 32) * 5 / 9;
    }

    public double getCelcius() {
        return tempC;
    }
    public double getFahrenheit() {
        return (tempC * 9/5) + 32;
    }

    public static void main(String args[]) {
        Thermometer test = new Thermometer();
        test.setFahrenheit(90);
        System.out.println(test.getCelcius());
        System.out.println(test.getFahrenheit());
    }
}

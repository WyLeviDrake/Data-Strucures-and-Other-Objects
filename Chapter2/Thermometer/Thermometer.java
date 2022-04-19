package chapter2.Thermometer;


public class Thermometer {
    
    private double tempC;
    private double maxTempC;
    private double minTempC;
    public static final double ABSOLUTE_ZERO = -273.16;
    public static final double THERMOMETER_MAX = 4000;

    public Thermometer() {
        tempC = 0;
        maxTempC = ABSOLUTE_ZERO;
        minTempC = THERMOMETER_MAX;
    }

    public void setCelsius(double temp) {
        if (temp > THERMOMETER_MAX && temp < ABSOLUTE_ZERO) {
        tempC = temp;
        isAboveMax();
        isBelowMin();
        } else {
            throw new IllegalArgumentException("Please enter a temperature within the Thermometer's limits of -273.16C and 4000C.");
        }
    }
    public void setFahrenheit(double temp) {
        if (convertedToCelsius(temp) > THERMOMETER_MAX && convertedToCelsius(temp) < ABSOLUTE_ZERO) {
        tempC = convertedToCelsius(temp);
        isAboveMax();
        isBelowMin();
        } else {
            throw new IllegalArgumentException("Please enter a temperature within the Thermometer's limits of -394.888F and 7232F.");
        }      
    }
    public void resetMax() {
        maxTempC = ABSOLUTE_ZERO;
    }
    public void resetMin() {
        maxTempC = THERMOMETER_MAX;
    }
    
    public double getCelsius() {
        return tempC;
    }
    public double getFahrenheit() {
        return convertedToFahrenheit(tempC);
    }
    public double getMaxCelsius() {
        return maxTempC;
    }
    public double getMaxFahrenheit() {
        return convertedToFahrenheit(tempC);
    }
    public double getMinCelsius() {
        return minTempC;
    }
    public double getMinFahrenheit() {
        return convertedToFahrenheit(minTempC);
    }
    public boolean isBelowFreezing() {
        if (tempC < 0) {
            return true;
        } else {
            return false;
        }
    }

    private void isAboveMax() {
        if (tempC > maxTempC) {
            maxTempC = tempC;
        }
    }
    private void isBelowMin() {
        if (tempC < minTempC) {
            minTempC = tempC;
        }
    }
    private double convertedToFahrenheit(double temp) {
        return (temp - 32) * 5 / 9;
    }
    private double convertedToCelsius(double temp) {
        return temp * (9.0 / 5.0) + 32;
    }
}

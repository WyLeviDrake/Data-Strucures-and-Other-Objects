public class Statistician {
    
    private double length;
    private double last;
    private double sum;
    private double mean;
    private double smallest;
    private double largest;

    public Statistician() {
        length = 0;
        last = Double.NaN;
        sum = 0;
        mean = Double.NaN;
        smallest = Double.NaN;
        largest = Double.NaN;
    }
    
    public void nextNumber(double input) {
        length = length + 1;
        last = input;
        sum = sum + input;
        mean = sum / length;
        if (input < smallest) {
            smallest = input;
        }
        if (input > largest) {
            largest = input;
        }
    }

    public double getLength() {
        return length;
    }
    public double getLast() {
        return last;
    }
    public double getSum() {
        return sum;
    }
    public double getMean() {
        return mean;
    }
    public double getSmallest() {
        return smallest;
    }
    public double getLargest() {
        return largest;
    }
}

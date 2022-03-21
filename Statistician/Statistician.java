package Statistician;
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
    public static Statistician addStats(Statistician p1, Statistician p2) {
        Statistician answer = new Statistician();
        answer.length = p1.length + p2.length;
        answer.last = p2.last;
        answer.sum = p1.sum + p2.sum;
        answer.mean = (p1.mean / 2) + (p2.mean /2);
        if (p1.smallest < p2.smallest) {
            answer.smallest = p1.smallest;
        } else {
            answer.smallest = p2.smallest;
        }
        if (p1.largest > p2.largest) {
            answer.largest = p1.largest;
        } else {
            answer.largest = p2.largest;
        }
        return answer;
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

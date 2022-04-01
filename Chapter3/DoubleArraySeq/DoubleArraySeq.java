package Chapter3.DoubleArraySeq;

public class DoubleArraySeq {

    private double[] sequence;
    private int current;

    public DoubleArraySeq() {
        sequence = new double[10];
        current = 0;
    }
    public DoubleArraySeq(int size) {
        if (size > 0) {
        sequence = new double[size];
        current = 0;
        } else {
            throw new IllegalArgumentException("Only accepts positive numbers");
        }
    }
    public int size() {
        return sequence.length;
    }
    public double getCurrent() {
        return sequence[current];
    }

    public void advance() {
        current += 1;
    }
    public void start() {
        current = 0;
    }

    public void addBefore(double element) {
        sequence[current - 1] = element;
    }
    public void addAfter(double element) {
        sequence[current + 1] = element;
    }
    public void removeCurrent() {

    }

    public static void main(String[] args) {
        DoubleArraySeq test = new DoubleArraySeq();
        System.out.println(test.getCurrent());
    }
}
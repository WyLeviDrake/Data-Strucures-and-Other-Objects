package Chapter3.DoubleArraySeq;

public class DoubleArraySeq {

    private double[] sequence; // Sequence of doubles.
    private int current; // Current position in the sequence.
    private int usedElements; // Number of elements used.

    public DoubleArraySeq() {
        sequence = new double[10];
        current = 0;
        usedElements = 0;
    }
    public DoubleArraySeq(int size) {
        if (size > 0 && size < Integer.MAX_VALUE) {
        sequence = new double[size];
        current = 0;
        usedElements = 0;
        } else {
            throw new IllegalArgumentException("Only accepts positive numbers less than 2147483647");
        }
    }
    public int size() {
        return usedElements;
    }
    public double getCurrent() {
        if (isCurrent()) {
            return sequence[current];
        } else {
            throw new NullPointerException("This is not a used element.");
        }

    }
    public boolean isCurrent() {
        if (current < (usedElements) && current >= 0) {
            return true;
        } else {
            return false;
        }
    }
    // This code isnt actually required and more of a headache than it is worth. Leaving it here to finish later.
    // public double getSequence(DoubleArraySeq numbers) {
    //     for (numbers.start(); numbers.isCurrent(); numbers.advance()) {
    //         System.out.println(sequence[numbers.current]);
    //     }
    // }

    public void advance() {
        current++;     
    }
    public void start() {
        current = 0;
    }

    public void addBefore(double element) {
        if (usedElements == 0) {
            sequence[0] = element;
        } else {        
            shiftSequenceBefore();
            sequence[current] = element;
        }
        usedElements++;
    } 
    private void shiftSequenceBefore() {
        for (int i = usedElements; i > current; i--) {
            sequence[i] = sequence[i - 1];
        }
    }
    public void addAfter(double element) {   
        if (usedElements == 0){
            sequence[0] = element;
        } else {
            shiftSequenceAfter();  
            sequence[current + 1] = element;
        }
        usedElements++;
    }
    private void shiftSequenceAfter() {
        for (int i = usedElements; i > (current + 1); i--) {
            sequence[i] = sequence[i - 1];
        }   
    }
    public void removeCurrent() {
        if (isCurrent()) {
            for (int i = current; i < usedElements; i++) {
                sequence[i] = sequence[i + 1];
            }
            usedElements--;
        } else {
            throw new NullPointerException("This is not a used element.");
        }
    }
    public void trimToSize() {
        double[] trimmedSequence;
        
        if (sequence.length != usedElements) {
            trimmedSequence = new double[usedElements];
            System.arraycopy(sequence, 0, trimmedSequence, 0, usedElements);
            sequence = trimmedSequence;
        }
    }
}
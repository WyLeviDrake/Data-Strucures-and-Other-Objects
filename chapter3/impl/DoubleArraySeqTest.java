package chapter3.impl;
import org.junit.Test;


public class DoubleArraySeqTest {

    private DoubleArraySeq test = new DoubleArraySeq();
    @Test
    public void DoubleArraySeq_constructsEmptySequence_givenNoInput() {
        
        System.out.println("No input constructor test:");
        if (!test.isCurrent() && test.size() == 0) {
            System.out.println("passed.");
        } else {
            System.out.println("failed.");
        }
    }
    @Test
    public void getCurrent_throwsNullPointerException_givenIsCurrentIsFalse() {
        System.out.println("getCurrent error test:");
        try {
            test.getCurrent();
            System.out.println("failed.");
        } catch (NullPointerException e) {
            System.out.println("passed.");
        } 
    }
    @Test
    public void addBefore_addsElement_givenEmptySequence() {
        test.addBefore(1);
        test.start();
        System.out.println("addBefore to an emptySequence test:");
        try {
            test.getCurrent();
            System.out.println("passed.");
        } catch (Exception e) {
            System.out.println("failed.");
        }
    }
    @Test
    public void removeCurrent_throwsNullPointerException_givenIsCurrentIsFalse() {
        test.advance();
        System.out.println("removeCurrent exception test:");
        try {
            test.removeCurrent();
            System.out.println("failed.");
        } catch (NullPointerException e) {
            System.out.println("passed.");
        }
    }
    @Test
    public void getCurrent_returnsSequenceCurrent_givenIsCurrentIsTrue() {
        test.start();
        System.out.println("getCurrent returns sequence:");
        if (test.getCurrent() == 1) {
            System.out.println("passed.");
        } else {
            System.out.println("failed.");
        }
        
    }
    @Test
    public void DoubleArraySeq_returnsIllegalArgumentException_givenOverflowInput() {
        System.out.println("Constructor error test:");
        try {
            test = new DoubleArraySeq(Integer.MAX_VALUE + 1);
            System.out.println("failed.");
        } catch (IllegalArgumentException e) {
            System.out.println("passed");
        }
    }

    // public static void main(String[] args){
    //     DoubleArraySeq_constructsEmptySequence_givenNoInput();
    //     getCurrent_throwsNullPointerException_givenIsCurrentIsFalse();
    //     addBefore_addsElement_givenEmptySequence();
    //     removeCurrent_throwsNullPointerException_givenIsCurrentIsFalse();
    //     getCurrent_returnsSequenceCurrent_givenIsCurrentIsTrue();
    //     DoubleArraySeq_returnsIllegalArgumentException_givenOverflowInput();
    // }
}

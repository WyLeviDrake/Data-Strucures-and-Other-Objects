package Chapter3.DoubleArraySeq;
import Chapter3.DoubleArraySeq.*;

public class DoubleArraySeqTest {

    private static DoubleArraySeq test = new DoubleArraySeq();

    public static void DoubleArraySeq_constructsEmptySequence_givenNoInput() {
        System.out.println("No input constructor test:");
        if (test.isCurrent() == false && test.size() == 0) {
            System.out.println("passed.");
        } else {
            System.out.println("failed.");
        }
    }
    public static void getCurrent_throwsNullPointerException_givenIsCurrentIsFalse() {
        System.out.println("getCurrent error test:");
        try {
            test.getCurrent();
            System.out.println("failed.");
        } catch (NullPointerException e) {
            System.out.println("passed.");
        } 
    }
    public static void addBefore_addsElement_givenEmptySequence() {
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
    public static void removeCurrent_throwsNullPointerException_givenIsCurrentisFalse() {
        test.advance();
        System.out.println("removeCurrent exception test:");
        try {
            test.removeCurrent();
            System.out.println("failed.");
        } catch (NullPointerException e) {
            System.out.println("passed.");
        }
    }
    public static void getCurrent_returnsSequenceCurrent_givenIsCurrentIsTrue() {
        test.start();
        System.out.println("getCurrent returns sequence:");
        if (test.getCurrent() == 1) {
            System.out.println("passed.");
        } else {
            System.out.println("failed.");
        }
        
    }
    public static void DoubleArraySeq_returnsIllegalArgumentException_givenNegativeInput() {
        System.out.println("Constructor error test:");
        try {
            test = new DoubleArraySeq(-1);
            System.out.println("failed.");
        } catch (IllegalArgumentException e) {
            System.out.println("passed");
        }
    }

    public static void main(String[] args){
        DoubleArraySeq_constructsEmptySequence_givenNoInput();
        getCurrent_throwsNullPointerException_givenIsCurrentIsFalse();
        addBefore_addsElement_givenEmptySequence();
        removeCurrent_throwsNullPointerException_givenIsCurrentisFalse();
        getCurrent_returnsSequenceCurrent_givenIsCurrentIsTrue();
        DoubleArraySeq_returnsIllegalArgumentException_givenNegativeInput();
    }
}

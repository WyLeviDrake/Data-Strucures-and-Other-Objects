package chapter2.Line;
import chapter2.Line.Line;

public class LineTest {

    private static void getFirstPoint_returnsThreeDimensionalPoint() {
        Line underTest = new Line();
        if (underTest.getFirstPoint() == null) {
            System.out.println("getFirstPoint returned null.");
        } else {
            System.out.println("getFirstPoint passed.");
        }
    }
    public static void main(String[] args) {
        getFirstPoint_returnsThreeDimensionalPoint();
    }
    
}

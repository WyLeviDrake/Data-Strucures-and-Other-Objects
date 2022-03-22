package Line;
import ThreeDimensionalPoint.ThreeDimensionalPoint;

public class Line {
    private ThreeDimensionalPoint firstPoint;
    private ThreeDimensionalPoint secondPoint;

    public Line() {
        firstPoint = new ThreeDimensionalPoint();
        secondPoint = new ThreeDimensionalPoint();
    }
    public void setFirstPoint(double x, double y, double z) {
        firstPoint.setPoint(x, y, z);
    }
    public ThreeDimensionalPoint getFirstPoint() {
        return firstPoint;
    }
}


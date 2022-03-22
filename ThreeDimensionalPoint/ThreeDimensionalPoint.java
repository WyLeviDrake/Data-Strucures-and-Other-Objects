package ThreeDimensionalPoint;
import java.lang.Math;

public class ThreeDimensionalPoint {
    private double[] point;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    
    public ThreeDimensionalPoint() {
        point = new double[] {0, 0, 0};
    }
    public ThreeDimensionalPoint(double inputX, double inputY, double inputZ) {
        point = new double[] {inputX, inputY, inputZ};
    }
    
    public void setPoint(double inputX, double inputY, double inputZ) {
        point[X] = inputX;
        point[Y] = inputY;
        point[Z] = inputZ;
    }
    public void changeX(double inputX) {
        point[X] = point[X] + inputX;        
    }
    public void changeY(double inputY) {
        point[Y] = point[Y] + inputY;
    }
    public void changeZ(double inputZ) {
        point[Z] = point[Z] + inputZ;
    }
    public void rotateAroundX(double angle) {
        // y = y cos(θ) - z sin(θ)
        double y = point[Y]*Math.cos(angle) - point[Z]*Math.sin(angle);
        // z = y sin(θ) + z con(θ)
        double z = point[Y]*Math.sin(angle) + point[Z]*Math.cos(angle);
        point[Y] = y;
        point[Z] = z;
    }
    public void rotateAroundY(double angle) {
        // x = x cos(θ) + z sin(θ)
        double x = point[X]*Math.cos(angle) + point[Z]*Math.sin(angle);
        // z = -x sin(θ) + z cos(θ)
        double z = -point[X]*Math.sin(angle) + point[Z]*Math.cos(angle);
        point[X] = x;
        point[Z] = z;
    }
    public void rotateAroundZ(double angle) {
        // x = x cos(θ) - y sin(θ)
        double x = point[X]*Math.cos(angle) - point[Y]*Math.sin(angle);
        // y = x sin(θ) + y cos(θ)
        double y = point[X]*Math.sin(angle) + point[Y]*Math.cos(angle);
        point[X] = x;
        point[Y] = y;
    }

    public double[] getPoint() {
        return point;
    }

    public String toString() {
        return "x" + point[X] + " y" + point[Y] + " z" +point[Z];
    }

    public static void main(String args[]) {
        ThreeDimensionalPoint point1 = new ThreeDimensionalPoint();
        System.out.println(point1);
    }
}

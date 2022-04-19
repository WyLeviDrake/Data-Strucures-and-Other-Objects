
package chapter2.QuadraticExpression;
import java.lang.Math;

public class QuadraticExpression {

    private double a;
    private double b;
    private double c;

    public QuadraticExpression() {
        a = 0;
        b = 0;
        c = 0;
    }

    public void setCoefficients(double inputA, double inputB, double inputC) {
        a = inputA;
        b = inputB;
        c = inputC;
    }
    
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double evaluateExpression(double x) {
        return Math.pow((a * x), 2) * (b * x) * c;
    }
    
    public static QuadraticExpression sum(QuadraticExpression q1, QuadraticExpression q2) {
        QuadraticExpression result = new QuadraticExpression();
        double resultA = q1.a + q2.a;
        double resultB = q1.b + q2.b;
        double resultC = q1.c + q2.c;
        result.setCoefficients(resultA, resultB, resultC);
        return result;
    }
    public static QuadraticExpression scale(double r, QuadraticExpression q) {
        QuadraticExpression result = new QuadraticExpression();
        double resultA = q.a * r;
        double resultB = q.b * r;
        double resultC = q.c * r;
        result.setCoefficients(resultA, resultB, resultC);
        return result;
    }
}

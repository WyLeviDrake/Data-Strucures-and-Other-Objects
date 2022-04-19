package chapter2.QuadraticExpression;
import chapter2.QuadraticExpression.QuadraticExpression;

public class QuadraticExpressionTest {
    
    private static void getCoefficients_returnsDoubleZero_givenNoInputs() {
        QuadraticExpression defaults = new QuadraticExpression();
        System.out.println("Results of getter test:");
        System.out.println(defaults.getA());
        System.out.println(defaults.getB());
        System.out.println(defaults.getC());
    }
    private static void setCoefficients_returnsInputs_givenCoefficientsDoNotEqualDefaults() {
        QuadraticExpression test = new QuadraticExpression();
        test.setCoefficients(-9001, 100.001, 1337);
        System.out.println("Result of setter test:");
        if (test.getA() == 0 || test.getB() == 0 || test.getC() == 0) {
            System.out.println("Coefficients did not change from default values.");
        } else {            
            System.out.println(test.getA());
            System.out.println(test.getB());
            System.out.println(test.getC());
        }
    }
    private static void sum_returnsTheSumOfTwoQuadraticExpressionsCoefficients() {
        QuadraticExpression first = new QuadraticExpression();
        first.setCoefficients(12, 24, 36);
        QuadraticExpression second = new QuadraticExpression();
        second.setCoefficients(36, 24, 12);
        QuadraticExpression result = QuadraticExpression.sum(first, second);
        System.out.println("Result of sum test:");
        System.out.println(result.getA());
        System.out.println(result.getB());
        System.out.println(result.getC());
    }
    private static void scale_returnsCoefficientsMultipliedByADouble() {
        QuadraticExpression test = new QuadraticExpression();
        test.setCoefficients(4500.5, 50.0005, 668.5);
        QuadraticExpression result = QuadraticExpression.scale(2, test);
        System.out.println("Result of scale test:");
        System.out.println(result.getA());
        System.out.println(result.getB());
        System.out.println(result.getC());

    }
    public static void main(String[] args) {
        getCoefficients_returnsDoubleZero_givenNoInputs();
        setCoefficients_returnsInputs_givenCoefficientsDoNotEqualDefaults();
        sum_returnsTheSumOfTwoQuadraticExpressionsCoefficients();
        scale_returnsCoefficientsMultipliedByADouble();
    }
}

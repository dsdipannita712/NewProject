package demo;

@FunctionalInterface
interface Sub
{
    double SumOf(double a, double b);
}
public class LambdaExpressionEx6 {
    public static void main(String[] args) {
        Sub s = (double aa, double bb) ->
        {
            double cc = aa * bb;
            return cc;
        };
        System.out.println(s.SumOf(10.0, 20.0));
    }
}

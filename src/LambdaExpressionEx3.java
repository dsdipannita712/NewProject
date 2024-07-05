@FunctionalInterface
interface Ex1 {
    String print(String n);
}
public class LambdaExpressionEx3 {

    public static void main(String[] args) {

        Ex1 e = (nn) ->
        {
          System.out.println("hello");
            return nn;
        };
        System.out.println(e.print("dipa"));
    }
}

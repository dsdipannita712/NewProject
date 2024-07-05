import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionEx7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("helel","dipa","how","are","you???");
        list.remove("how");
        System.out.println(list);

    }
}

package demo;

interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionEx5 {

    public static void main(String[] args) {

        Addable a = (int aa, int bb) -> {
            return aa + bb;
        };

        System.out.println(a.add(10,20));
    }
}

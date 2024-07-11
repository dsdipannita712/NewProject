package BasicProgramPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println(fact);

        System.out.println(IntStream.rangeClosed(1,5).reduce(1,(a,b)-> a *b));
    }
}

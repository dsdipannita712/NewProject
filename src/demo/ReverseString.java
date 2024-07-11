package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Java Program String reverse in Java 8 using lamdas

public class ReverseString {
    public static void main(String[] args) {
        String s = "dipannita, saha!!!";
        IntStream charStream = s.chars();
        Stream< String > stringStream = charStream.mapToObj(ch -> String.valueOf((char) ch));
        String reversedString = stringStream.reduce((acc, ch) -> ch + acc).orElse("");
        System.out.println("reversedString :" + reversedString);
// In the code example below, we have a sequence of integers as input. To sum them up, we can use the Stream.reduce() method.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}



package BasicProgramPractise;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//6. Sum of Digits of a Number
//Question: Write a function to find the sum of digits of a given number.
public class SumOfDigit {
    public static void main(String[] args) {
        int sum1 = 1234;
        int sum2 = 1234;
        int sumOf = 0;
        int n;
        while (sum1 > 0) {
            n = sum1 % 10;
            sumOf += n;
            sum1 = sum1 / 10;
        }
        System.out.println(sumOf);
        String sumStr = String.valueOf(sum2);
        System.out.println(sumStr);
        System.out.println(sumStr.chars().mapToObj(a->(char)a).mapToInt(Character::getNumericValue).sum());
        System.out.println(Stream.of(String.valueOf(sum2).split("")).mapToInt(Integer::parseInt).sum());

    }
}

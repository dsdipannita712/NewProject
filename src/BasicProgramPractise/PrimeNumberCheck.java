package BasicProgramPractise;

import java.util.stream.IntStream;

public class PrimeNumberCheck {

    public static boolean getPrimeNumber(int n) {
        for (int i = 2; i <= n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 22;
        System.out.println(IntStream.range(2, (num / 2) + 1).noneMatch(i -> num % i == 0));
        boolean b = getPrimeNumber(num);
        if (b) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }

    }
}
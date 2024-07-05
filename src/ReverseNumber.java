import java.util.stream.IntStream;

public class ReverseNumber {
    public static int reverse(int num) {

        int original = num;
        int rev = 0;
        while (num > 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 98543632;
        int b = reverse(num);
            System.out.println("reverse number:" + b);

        IntStream arr = IntStream.of(9,8,7,5,5);
        int[] arr1 = arr.toArray();
        IntStream.rangeClosed(1, arr1.length).boxed().mapToInt(i->arr1[arr1.length-i]).forEach(System.out::println);
    }
}

package BasicProgramPractise;

public class GreatestCommonDivisor {
    // a = 56, b = 98/56;
    // a = b, b = a%b ; repeat these process till b is zero
    public static void main(String[] args) {
        int a = 98, b = 56, temp;
        while (b !=0) {
            temp = b;
            b = a % b;
            a = temp;
        }
            System.out.println(a);
    }
}

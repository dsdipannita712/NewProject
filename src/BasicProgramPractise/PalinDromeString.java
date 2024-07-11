package BasicProgramPractise;

import java.util.stream.IntStream;

public class PalinDromeString {

    public static boolean palin(String palin) {
        for (int i = 0; i < palin.length() / 2; i++) {
            if (palin.charAt(i) != palin.charAt(palin.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palin = "dipannita";
        System.out.println(IntStream.range(0,palin.length()/2).noneMatch(i-> palin.charAt(i)!=palin.charAt(palin.length()-i-1)));
        if (palin(palin)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}

package BasicProgramPractise;
import java.util.Collections;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
public class ReverseString {
    public static void main(String[] args) {
        String s = "aba";
        String reverse = "";
        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println(sb.toString());
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        System.out.println(reverse);
        String rev = s.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(
                Collectors.toList(),
                t ->
                {
                    Collections.reverse(t);
                    return t.stream();
                }
        )).map(String::valueOf).collect(Collectors.joining());
        System.out.println(rev);
    }
}

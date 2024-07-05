import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "DIPA";
        String s2 = "gggdz";
        String s1L = s1.toLowerCase();
        String s2L = s2.toLowerCase();
        if (s1L.length() == s2L.length()) {
            char[] c1 = s1L.toCharArray();
            char[] c2 = s2L.toCharArray();
            Arrays.sort(c1);//adip
            Arrays.sort(c2);//adip

            if (Arrays.equals(c1, c2)) {
                System.out.println("anargram");
            } else {
                System.out.println("not anargram");
            }
        } else {
            System.out.println("not anargram");
        }
    }


}

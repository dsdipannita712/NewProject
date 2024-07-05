import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Demo {

    public static void main(String[] args) {
        String str = "dipa";
        String lowercaseStr = str.toLowerCase(); // dipannita
        boolean b = IntStream.range(0, lowercaseStr.length() / 2).
                noneMatch(i -> lowercaseStr.charAt(i) != lowercaseStr.charAt(lowercaseStr.length()-i-1));
        if (b) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

//        String s = "()[]{}";//true
//        String[] sp = s.split("");
//        List<String> list = Arrays.asList(sp);
//        list.stream().filter()


    }
}

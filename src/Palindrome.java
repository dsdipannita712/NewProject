import java.util.stream.IntStream;

public class Palindrome {

    public static boolean palindrome(int n) {
        int rev = 0;
        int original = n;
        while (n > 0) {
            int an = n % 10;
            rev = rev * 10 + an;
            n = n / 10;
        }
        System.out.println("reverse :" + rev);
        if (rev == original)
            return true;
        return false;
    }

    public static boolean palin(String p) {
        int len = p.length();//5
        for (int i = 0; i < len / 2; i++) {
            if (p.charAt(i) != p.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String palin = "radar";
        StringBuilder sb = new StringBuilder(palin);
        String rev = sb.reverse().toString();
        if (rev.equalsIgnoreCase(palin)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        int num = 12321;
        boolean pa = palindrome(num);
        if (pa)
            System.out.println("palindrome");
        else System.out.println("not a palindrome");

        boolean br = palin(palin);
        if (br)
            System.out.println("palindrome");
        else System.out.println("not a palindrome");

        int len = palin.length();
        boolean bb = IntStream.range(0, len / 2).noneMatch(i -> (palin.charAt(i) != palin.charAt(len - i - 1)));
        if (bb)
            System.out.println("palindrome java 8");
        else System.out.println("not a palindrome java 8");

        String numStr = Integer.toString(num);
        int lenNum = numStr.length();
        boolean bNum = IntStream.range(0, lenNum / 2).noneMatch(i -> (numStr.charAt(i) != numStr.charAt(lenNum - i - 1)));
        if (bNum)
            System.out.println("palindrome integer java 8");
        else System.out.println("not a palindrome integer java 8");

    }
}

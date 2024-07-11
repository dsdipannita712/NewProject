package demo;

import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {

        int nn = 900;
        String name = String.valueOf(nn);
        int no = Integer.valueOf(name);
        System.out.println(no);
        int len = name.toLowerCase().length();
        boolean b = IntStream.range(0,len/2).noneMatch(i-> (name.charAt(i)) != (name.charAt(len - i -1)));
        if(b)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrom");
        }
    }
}

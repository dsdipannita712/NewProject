package demo;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "dipannita";
        char[] c = s.toCharArray();
        Arrays.sort(c);
//        String ss = new String(c);
        String ss = String.valueOf(c);


        System.out.println(ss);
    }
}

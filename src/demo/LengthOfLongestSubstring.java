package demo;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String ss) {
        Set< Character > set = new HashSet<>();
        int maxlength = 0, i = 0, j = 0;
        while (j < ss.length()) {
            if (!set.contains(ss.charAt(j))) {
                set.add(ss.charAt(j++));
                maxlength = Math.max(maxlength, j - i);
            } else {
                set.remove(ss.charAt(i++));
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "abcbc";
        LengthOfLongestSubstring jp = new LengthOfLongestSubstring();
        System.out.println(jp.lengthOfLongestSubstring(s));
    }
}

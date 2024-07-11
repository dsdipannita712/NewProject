package BasicProgramPractise;

import java.util.HashSet;
import java.util.Set;

public class LengthLongestSubstring {
    public static void main(String[] args) {
        String s = "dipannita"; // 5
        int maxLength = 0, i = 0, j = 0;
        Set< Character > set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(maxLength);
    }
}

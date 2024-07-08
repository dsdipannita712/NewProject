import java.util.HashSet;
import java.util.Set;



public class LengthOfLongestSubstring {

    public Integer lengthOfLongestSubstring(String s) {
        Set< Character > set = new HashSet<>();
        int maxlength = 0, i = 0, j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxlength = Math.max(maxlength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "dipannita";
        LengthOfLongestSubstring jp = new LengthOfLongestSubstring();
        System.out.println(jp.lengthOfLongestSubstring(s));
    }
}

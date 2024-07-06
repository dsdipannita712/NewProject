import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetcodeEx1Sum {

    public static int[] getIndexOfSum(int[] ss, int t) {
        if (ss == null || ss.length < 2)
            return new int[]{0, 0};

        Map< Integer, Integer > m = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            if (m.containsKey(ss[i])) {
                return new int[]{m.get(ss[i]), i};
            } else {
                m.put(ss[i], i);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] s = {3, 2,4};
        int target = 6;
        int[] c = getIndexOfSum(s, target);
        List< Integer > in = new ArrayList<>();
        for (int i : c) {
            in.add(i);
        }
        System.out.println(in);

    }
}
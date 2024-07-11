package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class LeetcodeEx1Sum {

    public static int[] getIndexOfSum(int[] ss, int tar) {
        if (ss == null && ss.length < 2) {
            return new int[]{0, 0};
        }
        Map< Integer, Integer > map = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            if (map.containsKey(tar - ss[i])) {
                return new int[]{map.get(tar - ss[i]), i};
            } else {
                map.put(ss[i], i);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] s = {3, 2, 4,9};
        int target = 12;
        int[] c = getIndexOfSum(s, target);
        List< Integer > list = new ArrayList<>();
        for (int ll : c) {
            list.add(ll);
        }
        System.out.println(list);
    }
}
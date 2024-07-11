package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeSum {

    public int[] getIndexOfSum(int[] a, int tar) {
        if (a == null || a.length < 2)
            return new int[]{0, 0};
        Map< Integer, Integer > map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(tar-a[i])) {
                return new int[]{map.get(tar-a[i]), i};
            } else {
                map.put(a[i], i);

            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args)
        {
            int[] a = {3, 2,8,4};
            int target = 6;
            LeetCodeSum lp = new LeetCodeSum();
            int[] lst = lp.getIndexOfSum(a, target);
            List< Integer > lsst = new ArrayList<>();
            for (int l : lst) {
                lsst.add(l);
            }
            System.out.println(lsst);
        }

}

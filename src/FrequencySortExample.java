import java.util.*;

public class FrequencySortExample {

    public List<Integer> getFrequencySort(int[] s) {
        Map< Integer, Integer > map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + 1);
            } else {
                map.put(s[i], 1);
            }
        }
        List< Integer > l = new ArrayList<>();
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                forEach(x ->
                        {
                            for (int i = 1; i <= x.getValue(); i++) {
                                l.add(x.getKey());
                            }
                        }
                );
        return l;
    }

    public static void main(String[] args) {
        int[] str = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        FrequencySortExample f = new FrequencySortExample();
        List< Integer > lst = f.getFrequencySort(str);
        System.out.println(lst);
    }
}

import java.util.*;

public class FrequencySort {
    public static void getFrequencySort(int[] it) {
        Map< Integer, Integer > map = new HashMap<>();
        for (int i = 0; i < it.length; i++) {
            if (map.containsKey(it[i])) {
                map.put(it[i], map.get(it[i]) + 1);
            } else {
                map.put(it[i], 1);
            }
        }

        List< Integer > lst = new ArrayList<>();
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                forEach(x -> {
                            for (int i = 1; i <= x.getValue(); i++) {
                                lst.add(x.getKey());
                            }
                        }

                );

        System.out.println(lst);
    }

    public static void main(String[] args) {
        int[] str = {1, 1, 2, 2, 2, 2, 12, 12, 5, 5, 5, 5, 5};
        getFrequencySort(str);
    }
}

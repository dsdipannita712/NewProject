import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practiseCode {

    public List< Integer > sortFrequency(int[] a) {
        Map< Integer, Integer > map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        List< Integer > l = new ArrayList<>();
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(x ->
                        {
                            for (int k = 1; k <= x.getValue(); k++) {
                                l.add(x.getKey());
                            }
                        }

                );
        return l;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        practiseCode p = new practiseCode();
        List< Integer > list = p.sortFrequency(arr);
        System.out.println(list);
    }
}

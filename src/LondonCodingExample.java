import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

////
//public int[] frequencySort(int[] nums,int i) {
//    i = 0;
//    Arrays.stream(nums).boxed()
//            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//            .entrySet().stream()
//            .sorted((x1, x2) -> x1.getValue() == x2.getValue() ? x2.getKey() - x1.getKey() : (int) (x1.getValue() - x2.getValue()))
////            .forEach(x -> Stream.iterate(0, n -> n + 1).limit(x.getValue()).forEach(n -> nums[i++] = x.getKey()));
//    return nums;
//}
public class LondonCodingExample {
    public static void main(String[] args) {
        //Given an integer array, sort the array according to the frequency of elements in decreasing order,
        // if the frequency of two elements are same then sort them in increasing order
        int arr[] = {2,3,2,4,5,12,2,3,3,3,12};
        List< Integer > list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        String s = String.valueOf(list);
        System.out.println(s);
        Map< Character, Long > m = s.chars().mapToObj(ch -> (char) ch).sorted().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m);



    }
}

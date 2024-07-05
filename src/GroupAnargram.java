import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnargram {

    /*

      public List< List< String > > groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs).sorted()
                .collect(Collectors.groupingBy(this::sortStringChars)).
                values());
    }

    public String sortStringChars(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//                String[] strs = {""};
        String[] strs = {"a"};
        GroupAnargram g = new GroupAnargram();
        List< List< String > > list = g.groupAnagrams(strs);
        System.out.println(list);
    }
     */
    public void groupOfAnargram(String[] strs)
    {
         Arrays.stream(strs).sorted().forEach(System.out::println);
    }

    public void groupOfIntAnargram(int[] aa)
    {
        Arrays.stream(aa).sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tae", "tan", "ant" };
        int[] a = {12,76,10,2,4};
        GroupAnargram g = new GroupAnargram();
         g.groupOfAnargram(strs);
         g.groupOfIntAnargram(a);
    }
}
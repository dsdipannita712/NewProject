import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnargramP1 {
    public List<List<String>> getGroupOfAnargram(String[] s)
    {
        return new ArrayList<>(Arrays.stream(s).sorted().collect(Collectors.groupingBy(this::sortString)).values());
    }

    public String sortString(String ss)
    {
        char[] c = ss.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
    public static void main(String[] args)
    {
        String[] str = {"eat","tea","aet","tan","ant"};
        GroupAnargramP1 a = new GroupAnargramP1();
        List<List<String>> lst = a.getGroupOfAnargram(str);
        System.out.println(lst);
    }

}
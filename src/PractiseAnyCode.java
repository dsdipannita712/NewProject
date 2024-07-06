import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseAnyCode {
    public List<List<String>> getGroupAnargram(String[] s)
    {
        return new ArrayList<>(Arrays.stream(s).sorted().collect(Collectors.groupingBy(this::sortString)).values());
    }

    public String sortString(String sp)
    {
        char[] ch = sp.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String[] str = {"bat","abt","tab","eat","tea","cat"};
        PractiseAnyCode cp = new PractiseAnyCode();
        List<List<String>> list = cp.getGroupAnargram(str);
        System.out.println(list);
    }
}


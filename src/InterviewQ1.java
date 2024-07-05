import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQ1 {
    public static void main(String[] args) {
        String[] str = {"10","20","30",null,"40"};
        List<String> list = Arrays.asList(str);
        list.set(2,null);
        System.out.println(list);

        List<Integer> integerList = List.of(2,5,8,9,7);
        System.out.println(integerList.stream().collect(Collectors.partitioningBy(i->i %2 ==0)));

        integerList.add(34);

        integerList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

    }
}

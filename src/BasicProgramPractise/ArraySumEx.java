package BasicProgramPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArraySumEx {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        System.out.println(sum);
        System.out.println(IntStream.range(0, a.length + 1).sum());

        for(int jj:a)
        {
            list.add(jj);
        }
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

    }
}

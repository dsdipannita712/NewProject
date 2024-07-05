import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c = 0, count = 10;
        System.out.println(a + " " + b);
        for (int i = 2; i <= count; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

        String co = Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]}).
                limit(10).map(x-> x[0])
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        System.out.println(co);

        Integer io = Stream.iterate(new int[]{0,1}, tt -> new int[]{tt[1],tt[0]+tt[1]}).limit(10)
                .map(v->v[0])
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println(io);

    }
}

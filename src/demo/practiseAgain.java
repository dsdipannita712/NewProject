package demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practiseAgain {
    public static void main(String[] args) {
        String d = "dipannita";//d
        char cc = d.chars().mapToObj(dd-> (char)dd).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(o->o.getValue() == 1L).map(Map.Entry::getKey).findFirst().get();
        System.out.println(cc);

        System.out.println(Stream.iterate(new int[]{0,1},t -> new int[]{t[1],t[0]+t[1]}).limit(10)
                .map(x->x[0]).map(String::valueOf).collect(Collectors.joining(",")));

        int sum=Stream.iterate(new int[]{0,1}, t-> new int[]{t[1],t[0]+t[1]}).limit(10).map(x->x[0])
                .mapToInt(Integer::valueOf).sum();
        System.out.println(sum);

        System.out.println(Arrays.asList(1,2,3).stream().filter(p->p>1).count());
        System.out.println(Stream.of(1,2,3).filter(p->p>1).count());

        for(char ch : d.toCharArray())
        {
        if(d.indexOf(ch) == d.lastIndexOf(ch))
        {
            System.out.println(ch);
            break;
        }
        }

    }

}

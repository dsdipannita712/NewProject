import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepitiveCharacter {

    public static void main(String[] args) {
        String input = "dipannita saha"; // d=1,i=2,p=1,a=4,n=2,t=1,s=1,h=1

        Character ch = input.chars().mapToObj(i->Character.toLowerCase((char) i))
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(op->op.getValue() > 1L).
                map(Map.Entry::getKey).findFirst().get();

        System.out.println(ch);


       Character chh = input.chars().mapToObj(i->Character.toUpperCase((char)i))
               .collect(Collectors.groupingBy(Function.identity(),
                       LinkedHashMap::new,Collectors.counting()))
               .entrySet().stream().filter(k->k.getValue() == 1L)
               .map(Map.Entry :: getKey).findFirst().get();

       System.out.println(chh);
    }
}

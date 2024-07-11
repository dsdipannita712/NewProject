package demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String[] args) {

//        String[] ss = s.split("");
//        List< String > list = Arrays.asList(ss); // {'d','i','p','a','n','n','i','t','a'}
//        Set< String > set = new HashSet<>(); //d, i, p, a, n, t
//       // list.stream().filter(a -> !set.add(a)).forEach(System.out::println);//i, a, n
//        Optional< String > io = list.stream().filter(a -> set.add(a)).findFirst();
//        if(io.isPresent())
//        {
//            System.out.println(String.valueOf(io.get()));
//        }
            String sh = "JavaTpoint";
            Character ch = sh.chars()
                    .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                    .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                    .entrySet().stream()
                    .filter( m -> m.getValue() == 1L)
                    .map(n-> n.getKey())
                    .findFirst()
                    .get();
            System.out.println(ch);



//        String s = "()[]{}";//true

//        S
//        tring[] ss = s.split("");
//        List<String> list = Arrays.asList(ss); // {'(',')','[',']'}
//        list.stream().filter(a->a.startsWith("(") && a.endsWith(")")  a.startsWith("{")  && || a.startsWith("["))

        String s = "dipannita";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
        //s.chars().mapToObj(c->(char)c).sorted(Comparator.reverseOrder()).forEach(System.out::println);
       if(s.equalsIgnoreCase(String.valueOf(sb)))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}

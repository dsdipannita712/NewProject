package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionEx4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello dipa all");
        list.add("hello all");
        list.add("good night");
        list.add("bye");

        list.stream().filter(p->p.startsWith("hello")).map(p->p.toUpperCase()).sorted().forEach(System.out::println);
        System.out.println(list.size());
        System.out.println(list.stream().findFirst().stream().skip(1));
    }
}

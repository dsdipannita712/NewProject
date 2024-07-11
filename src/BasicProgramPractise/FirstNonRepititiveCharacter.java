package BasicProgramPractise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepititiveCharacter {
    public static char getFirstNon(String name) {
        Map< Character, Integer > map = new HashMap<>();
        for (char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : name.toCharArray()) {
            if (map.get(ch) == 1L) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {

        String name = "dipannita";
        char result = getFirstNon(name);
        if (result != '\0') {
            System.out.println("first repititive character is:" + result);
        } else {
            System.out.println("first non repititive character is:" + result);
        }

        char ch = name.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1L)
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(ch);
    }
}

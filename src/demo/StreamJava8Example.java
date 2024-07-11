package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamJava8Example {

    public static void main(String[] args) {
        //List<String> concatString = Arrays.asList("Dipannita","saha","Congratulations","on new laptop");
        List<String> concatString = new ArrayList<>();
        concatString.add("dipannita");
        concatString.add("saha");

        String joinString = String.join(" ", concatString);
        System.out.println(joinString);
    }
}

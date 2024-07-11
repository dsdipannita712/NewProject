package BasicProgramPractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReduceExProgram {
    public static void main(String[] args) {

        //1. Summing Numbers
        //Example: Sum of elements in a list

        List< Integer > inte = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(inte.stream().reduce(0, Integer::sum));

        //2. Concatenating Strings
        //Example: Concatenate a list of strings

        List< String > str = Arrays.asList("hi", "i", "am", "dipannita");
        System.out.println(str.stream().reduce("", (a, b) -> a + " " + b));
        //3. Finding the Maximum Value
        //Example: Find the maximum element in a list

        System.out.println(inte.stream().reduce(Integer::max));
        System.out.println(inte.stream().max(Comparator.naturalOrder()));

        //4. Finding the Minimum Value
        //Example: Find the minimum element in a list

        Optional<Integer> opt = inte.stream().reduce(Integer::min);
        //opt.ifPresent(System.out::println);
        if(opt.isPresent())
        {
            System.out.println(opt.get());
        }
        System .out.println(inte.stream().min(Comparator.naturalOrder()));

        //5. Product of Elements
        //Example: Calculate the product of elements in a list

        System.out.println(inte.stream().reduce(1,(a,b)-> a * b));
    }
}

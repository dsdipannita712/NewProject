package BasicProgramPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//10. Find the Largest Element
//Write a function that finds the largest element in an array.
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {34, 21, 44, 57, 100,89,10,8,1};
        int max = 0, min = 0;
        List< Integer > list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).findFirst().get());
        System.out.println(list.stream().sorted().findFirst().get());

        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println(min);
    }
}

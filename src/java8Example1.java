import javax.print.attribute.HashAttributeSet;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class java8Example1 {
    public static void main(String[] args) {
        //a list of integers, separate odd and even numbers?
        List< Integer > list = Arrays.asList(12, 23, 44, 89, 32, 14);
        System.out.println(list.stream().collect(Collectors.partitioningBy(i -> i % 2 != 0)));

        //remove duplicate elements from a list using Java 8 streams?
        List< String > s = Arrays.asList("dipa", "dipa", "how", "are", "you", "!!!!");
        System.out.println(s.stream().distinct().collect(Collectors.toList()));

        //find frequency of each character in a string using Java 8 streams
        String ss = "Dipannita adrija saha from glasgow";
        Map< Character, Long > freq = ss.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freq);
        // frequency of each element in an array or a list?
        List< String > str = Arrays.asList("dipa", "saha", "adrija", "saha", "mou", "gopal", "saha");
        Map< String, Long > freqS = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqS); // {dipa=1,saha=3,adrija=1,mou=1,gopal=1}
        //sort the given list of decimals in reverse order?
        List< Double > d = Arrays.asList(89.12, 23.87, 56.43, 12.78, 90.54, 67.32);
        List< Double > dou = d.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(dou);
        //list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List< String > strJoin = Arrays.asList("dipa", "saha", "adrija", "saha", "mou", "gopal", "saha");
        System.out.println(strJoin.stream().collect(Collectors.joining(",", "[", "]")));
        //given list of integers, print the numbers which are multiples of 5?
        List< Integer > inte = Arrays.asList(10, 3, 15, 19, 20, 78, 100);
        List< Integer > intt = inte.stream().filter(a -> a % 5 == 0).collect(Collectors.toList());
        System.out.println(intt);
        // list of integers, find maximum and minimum of those numbers?
        System.out.println(inte.stream().max(Comparator.naturalOrder()));
        System.out.println(inte.stream().min(Comparator.naturalOrder()));
        //merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[]{2, 7, 1, 9};
        int[] b = new int[]{3, 8, 4, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
        //  get three maximum numbers and three minimum numbers from the given list of integers?
        List< Integer > listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        //check if two strings are anagrams or not?
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s1);
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("anargram!!!");
        } else {
            System.out.println("not anargram!!!");
        }


//sum of all digits of a number in Java 8?
        int i = 12345; // 15
//    Integer sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);

        //second largest number in an integer array?
        List< Integer > secondLargest = Arrays.asList(23, 100, 150, 90, 75, 12);
        System.out.println(secondLargest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        //a list of strings, sort them according to increasing order of their length?
        List< String > listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List< String > sortIncreasingOrder = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortIncreasingOrder);

        //an integer array, find sum and average of all elements?
        int[] aOf = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        int sumOf = Arrays.stream(aOf).sum();
        System.out.println(sumOf);
        double avg = Arrays.stream(aOf).average().getAsDouble();
        System.out.println(avg);
        // find common elements between two arrays?
        List< Integer > arr1 = Arrays.asList(89, 23, 21, 78, 45);
        List< Integer > arr2 = Arrays.asList(78, 34, 23, 36, 21);
        arr1.stream().filter(arr2::contains).sorted().forEach(System.out::println);

        //each word of a string using Java 8 streams?
        String strWord = "Java Concept Of The Day";
        String reverseWord = Stream.of(strWord.split(" ")).map(m -> new StringBuffer(m).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverseWord);
        //you find sum of first 10 natural numbers?
        int sumNatural = IntStream.range(1, 11).sum();
        System.out.println(sumNatural);
        //Reverse an integer array
        int[] array = new int[]{5, 1, 7, 3, 9, 6};
        int len = array.length;
        System.out.println(len);
        int[] revArray = IntStream.rangeClosed(1, array.length).map(m -> array[array.length - m]).toArray();
        System.out.println(Arrays.toString(revArray));
        //Print first 10 even numbers
        IntStream.range(1, 11).map(io -> io * 2).forEach(System.out::println);

        //intermediate and terminal operation
        Arrays.stream(new int[]{12, 24, 55, 67}).map(ip -> {
            System.out.println("intermediate operation:" + ip);
            return ip * 2;
        });

        Arrays.stream(new int[]{3, 5, 6, 8}).map(pp -> {
            System.out.println("terminal operation:" + pp);
            return pp * 2;
        }).sum();

        // map and flatmap
        Map< String, List< String > > map = new HashMap<>();
        map.put("John",Arrays.asList("888-999","788-656"));
        map.put("Array",Arrays.asList("888-989","788-656"));
        map.put("park",Arrays.asList("888-999","9853-656"));

        List<String> maps = map.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(maps);


    }
}
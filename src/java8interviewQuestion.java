import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class java8interviewQuestion {
    public static void main(String[] args) {
        // 1. Separate odd and even numbers in a list of integers.
        //Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
        List< Integer > list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5);
        System.out.println(list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)));

        //2. Remove duplicate elements from a list using Java 8 streams.
        //Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.

        Set< Integer > set = new HashSet<>();
        list.stream().filter(s -> set.add(s)).forEach(System.out::println);

        //3. Find the frequency of each character in a string using Java 8 streams.
        //Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.

        String hello = "hellodipa";
        Map< Character, Long > map = hello.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

        //4. Find the frequency of each element in an array or a list.
        //Write a Java 8 program to find the frequency of each element in an array or a list using streams and collectors.

        //List<String> ml = Arrays.asList("dipa","dipa","mou","saha","saha");
        String[] m = {"dipa", "dipa", "mou", "saha", "saha"};
        List< String > ml = List.of(m);
        int[] pn = {10, 10, 20, 30, 50, 50};
        List< Integer > lm = new ArrayList<>();
        for (int k : pn) {
            lm.add(k);
        }

        Map< Integer, Long > mg = lm.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(mg);

        // 5. Sort a given list of decimals in reverse order.
        //Write a Java 8 program to sort a given list of decimal numbers in reverse order.

        List< Double > dd = Arrays.asList(10.0, 20.0, 9.0, 2.9, 1.1, 100.9, 200.0);
        dd.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // 6. Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter.
        //Given a list of strings, write a Java 8 program to join the strings with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.

        List< String > kl = Arrays.asList("dipa", "dipa", "mou", "saha", "saha");
        System.out.println(kl.stream().collect(Collectors.joining(",", "[", "]")));

        //7. Print the numbers from a given list of integers that are multiples of 5.
        //Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.

        List< Integer > five = Arrays.asList(5, 10, 12, 14, 15, 20, 22, 24, 25, 30);
        System.out.println(five.stream().filter(p -> p % 5 == 0).collect(Collectors.toList()));

        //8. Find the maximum and minimum of a list of integers.
        //Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
        Optional< Integer > opp = five.stream().max(Comparator.naturalOrder());
        if (opp.isPresent()) {
            System.out.println(opp.get());
        }
        Optional< Integer > min = five.stream().min(Comparator.naturalOrder());
        min.ifPresent(System.out::println);

        //9. Merge two unsorted arrays into a single sorted array using Java 8 streams.
        //Write a Java 8 program to merge two unsorted arrays into a single sorted array using the stream API.

        int[] a = {1, 9, 2, 4, 6, 6, 6, 1};
        int[] b = {10, 5, 21, 8, 19, 19, 19};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        //10.Merge two unsorted arrays into a single sorted array without duplicates
        //Write a Java 8 program to merge two unsorted arrays into a single sorted array without duplicates.
        int[] d = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(d));

        //11. Get the three maximum and three minimum numbers from a given list of integers.
        //Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
        List< Integer > it = new ArrayList<>();
        for (int aa : a) {
            it.add(aa);
        }

        System.out.println(it);
        System.out.println(it.stream().sorted().limit(3).collect(Collectors.toList()));
        System.out.println(it.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));

        //12. Check if two strings are anagrams or not using Java 8 streams.
        //Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.

        String name1 = "dipa";
        String name2 = "mou";
        String name3 = Arrays.stream(name1.split("")).map(x -> x.toUpperCase()).sorted().collect(Collectors.joining(""));
        String name4 = Arrays.stream(name2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (name3.equalsIgnoreCase(name4)) {
            System.out.println("anargram");
        } else {
            System.out.println("not anargram");
        }

        //13. Find the sum of all digits of a number in Java 8.
        //Write a Java 8 program to find the sum of all digits of a given number.

        int[] ab = {1, 2, 3, 4, 5};
        List< Integer > lu = new ArrayList<>();
        for (int abn : ab) {
            lu.add(abn);
        }

        System.out.println(lu.stream().collect(Collectors.summingInt(Integer::valueOf)));

        //14. Find the second largest number in an integer array.
        //Write a Java 8 program to find the second largest number in an integer array.

        Optional< Integer > pp = lu.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if (pp.isPresent()) {
            System.out.println(pp.get());
        }
        pp.ifPresent(System.out::println);

        //15. Sort a list of strings according to the increasing order of their length.
        //Write a Java 8 program to sort a given list of strings according to the increasing order of their length.

        String[] ma = {"dipa", "dip", "mo", "sahaa", "sahaan"};
        List< String > mlist = Arrays.asList(ma);
        List< String > lppp = mlist.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(lppp);

        int num = 33;
        boolean isPrime = IntStream.range(2, (num / 2) + 1)
                .noneMatch(i -> num % i == 0);

        boolean is = IntStream.range(2, (num / 2) + 1)
                .noneMatch(i -> num % i == 0);
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        int aab = 2, bba = 3;
        System.out.println(Math.pow(2, 3));

        // 16. Find the sum and average of all elements in an integer array.
        //Write a Java 8 program to find the sum and average of all elements in an integer array.

        int[] sum = {1, 2, 3, 4, 5};
        List< Integer > lst = new ArrayList<>();
        for (int ss : sum) {
            lst.add(ss);
        }
        System.out.println(lst.stream().collect(Collectors.summingInt(Integer::valueOf)));
        System.out.println((Integer) lst.stream().mapToInt(Integer::valueOf).sum());
        System.out.println(lst.stream().collect(Collectors.averagingInt(Integer::valueOf)));

        //17. Find the common elements between two arrays.
        //Write a Java 8 program to find the common elements between two arrays using streams.

        List< Integer > c1 = Arrays.asList(10, 20, 22, 25, 29, 30);
        List< Integer > c2 = Arrays.asList(10, 20, 24, 30);
        c1.stream().filter(c2::contains).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //18. Reverse each word of a string using Java 8 streams.
        //Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions.
        String word = "hello dipannita how are you";
        String recv = Arrays.stream(word.split(" ")).map(ak -> new StringBuilder(ak).reverse()).collect(Collectors.joining(" "));
        System.out.println(recv);

        //19. Find the sum of the first 10 natural numbers.
        //Write a Java 8 program to find the sum of the first 10 natural numbers using streams.
        System.out.println(IntStream.rangeClosed(1, 10).sum());

        //20. Reverse an integer array.
        //Write a Java 8 program to reverse an integer array.
        List< Integer > lp = Arrays.asList(90, 67, 34, 95);
        lp.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //21.Print the first 10 even numbers.
        //Write a Java 8 program to print the first 10 even numbers.
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);

        //22.Find the most repeated element in an array.
        //?????????????????????????????????????

        //duplicate
        List< Integer > list1 = Arrays.asList(12, 56, 56, 23, 12, 89, 89);
        Set< Integer > set1 = new HashSet<>();

        list1.stream().filter(p -> !set1.add(p)).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //23. Check if a string is a palindrome using Java 8 streams.
        //Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.

        String palin = "aba";
        int length = palin.length();
        boolean p = IntStream.range(0, length / 2).noneMatch(i -> palin.charAt(i) != palin.charAt(length - i - 1));
        if (p) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        //24.Find strings in a list that start with a number.
        //Given a list of strings, write a Java 8 program to find the strings that start with a number.
        String[] numb = {"1dipa", "dip", "mo", "2sahaa", "sahaan"};
        List< String > lpp = Arrays.asList(numb);
        lpp.stream().filter(y -> Character.isDigit(y.charAt(0))).forEach(System.out::println);

        //25.Extract duplicate elements from an array.
        //Write a Java 8 program to extract duplicate elements from an array.
        List< Integer > dup = Arrays.asList(12, 89, 11, 45, 23, 23, 89);
        Set< Integer > set3 = new HashSet<>();
        dup.stream().filter(po -> !set3.add(po)).forEach(System.out::print);

        //26. Print duplicate characters in a string.
        //Write a Java 8 program to print the duplicate characters in a string.

        String st = "dignitary";
        Map< Character, Long > mt = st.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting()));
        System.out.println(mt);

        Character cs = st.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(h -> h.getValue() > 1L)
                .map(Map.Entry::getKey).findFirst().get();

        System.out.println(cs);

        // 27. Generate the Fibonacci series.
        //Write a Java 8 program to generate the Fibonacci series.
        String fib = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10).
                map(x -> x[0]).map(String::valueOf).collect(Collectors.joining());
        System.out.println(fib);

        Integer sumOf = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10)
                .map(x -> x[0]).mapToInt(Integer::valueOf).sum();
        System.out.println(sumOf);

        //28.Print the first 10 odd numbers.
        //Write a Java 8 program to print the first 10 odd numbers.

        IntStream.rangeClosed(1, 100).filter(i -> i % 2 != 0).limit(10).forEach(System.out::println);

        //29. Get the last element of an array
        //Write a Java 8 program to get the last element of an array.

        Integer[] arry = {12, 34, 22, 55, 77};
        List< Integer > lstt = Arrays.asList(arry);
        System.out.println(lstt.size());
        System.out.println(lstt.stream().skip(lstt.size() - 1).findFirst().get());
        System.out.println(lstt.stream().findFirst().get());

        //30.Calculate the age of a person in years.
        //Write a Java 8 program to calculate the age of a person in years given their birthday.
        LocalDate birthdate = LocalDate.of(2020, 04, 14);
        LocalDate now = LocalDate.now();
        int age = Period.between(birthdate, now).getYears();
        System.out.println(age);


        Integer[] last = {12, 89, 45, 76, 15};
        List< Integer > lh = Arrays.asList(last);
        System.out.println(lh.stream().skip(lh.size() - 2).findFirst().get());
        System.out.println(lh.stream().min(Comparator.naturalOrder()));
        System.out.println(lh.stream().sorted().skip(1).findFirst().get());
        System.out.println(lh.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
        System.out.println(lh.stream().skip(lh.size() - 1).findFirst().get());

        String fname = "dipannita";
        String lname = "saha";
        List< String > name = Arrays.asList(fname, lname);
        System.out.println(String.join("", name));
        String[] wel = {"welcome", "to", "this", "interview"};
        List< String > lwel = Arrays.asList(wel);
        System.out.println(lwel.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));

        //second highest salary using java 8

        List< EmployeeDetails > eo = new ArrayList<>();
        eo.add(new EmployeeDetails(18, "gopal", "london", 12000));
        eo.add(new EmployeeDetails(10, "Dipa", "glasgow", 13000));
        eo.add(new EmployeeDetails(12, "mou", "cob", 80000));
        eo.stream().filter(o -> o.getSalary() < 20000).map(o -> o.getSalary() + 10000).forEach(System.out::println);

        int dou = eo.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(1).findFirst()
                .map(EmployeeDetails::getSalary).get();
        System.out.println(dou);

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10).map(x -> x[0]).map(String::valueOf).forEach(System.out::println);
        int sfibo = Stream.iterate(new int[]{0, 1}, tt -> new int[]{tt[1], tt[0] + tt[1]}).limit(10).map(x -> x[0]).mapToInt(Integer::valueOf).sum();


        System.out.println(sfibo);

        String pa = "radar";
        int lpo = pa.length();
        boolean bp = IntStream.rangeClosed(0, lpo / 2).noneMatch(pi -> pa.charAt(pi) != pa.charAt(lpo - pi - 1));
        if (bp) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }


        List< Integer > dlist = Arrays.asList(9, 5, 5, 9, 9, 1, 2,8);// 9, 5
        System.out.println(dlist.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(md -> md.getValue() == 1).map(pd -> pd.getKey()).sorted().collect(Collectors.toList()));
               // .filter(md -> md.getValue() == 1).map(pd -> pd.getKey()).findFirst().get());


            System.out.println(dlist.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get());

    }
}
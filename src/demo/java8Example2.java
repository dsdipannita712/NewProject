package demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8Example2 {

    public static boolean duplicate() {
        List< Integer > list1 = Arrays.asList(2, 7, 1, 1);
        Set< Integer > set1 = new HashSet<>(list1);
        if(list1.size()==set1.size())
        {
        return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {

        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(12,14,67,88,90);
        list.stream().filter(i-> i%2==0).forEach(System.out::println);
        List<String> slist = Arrays.asList("12","14","67","88","90");

        // Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        list.stream().map(s-> s+"").filter(i->i.startsWith("1")).forEach(System.out::println);

        System.out.println("--------------------");
        //find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);//98,15
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n->!set.add(n)).forEach(System.out::println);

        System.out.println("--------------------");
        //Given the list of integers, find the first element of the list using Stream functions?
        System.out.println(myList.stream().findFirst().get());
        System.out.println("--------------------");
        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println(myList.stream().count());
        System.out.println("--------------------");
        //Given a list of integers, find the maximum value element present in it using Stream functions?
        myList.stream().max(Integer::compare).ifPresent(System.out::println);
        myList.stream().max(Integer::compare).ifPresent(System.out::println);
        System.out.println(myList.stream().max(Comparator.naturalOrder()));
        System.out.println("--------------------");
        //Given a list of integers, sort all the values present in it using Stream functions?
        myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("--------------------");
        // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        boolean b = java8Example2.duplicate();
        System.out.println(b);

        //System.out.println("--------------------");
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());
        //  Java 8 program to concatenate two Streams?
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> ss = Stream.concat(list1.stream(),list2.stream());
        System.out.println(ss.collect(Collectors.toList()));

        System.out.println("--------------------");
        //program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(ic ->ic*ic*ic).filter(ic->ic>50).forEach(System.out::println);
        System.out.println("--------------------");
        //find duplicate elements from integer list using java 8 stream.
        List<Integer> iList = Arrays.asList(12,45,68,99,99,68);
        Set<Integer> iSet = new HashSet<>();//12,45,68,99
        iList.stream().filter(o-> !iSet.add(o)).forEach(System.out::println);
        System.out.println("--------------------");
        //repititive letter in a given string using java 8 stream
        String s = "dipannita saha";
        String[] lp = s.split("");
        List<String> op = Arrays.asList(lp);
        System.out.println(op);
        Set<String> sd = new HashSet<>();
        Set<String> dg = new HashSet<>();
        op.stream().filter(pp->!sd.add(pp)).forEach(System.out::println);
        OptionalInt sp = s.chars().filter(aa -> !dg.add(String.valueOf(aa))).findFirst();
        if(sp.isPresent())
            System.out.println(sp);

        String input = "Feel the need";
        Set<Integer> seen = new HashSet<>();
        OptionalInt first = input.chars()
                .filter(i -> !seen.add(i))
                .findFirst();

        if (first.isPresent()) {
            System.out.println((char) first.getAsInt());
        }

    }
}

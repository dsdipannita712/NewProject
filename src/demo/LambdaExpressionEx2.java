package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class LambdaExpressionEx2 {
    static List< String > list = new ArrayList<>();

    public static List getPlaces() {
        list.add("Nepal, Kathmandu");
        list.add("Nepal, Pokhara");
        list.add("Coochbehar, West Bengal");
        list.add("Barpeta Road, Assam");
        return list;
    }

    public static void main(String[] args) {
        List<String> myPlaces = getPlaces();
        myPlaces.stream().filter(p -> p.startsWith("Nepal")).map(p -> p.toUpperCase()).sorted().forEach((p)->System.out.println(p));

    }

}

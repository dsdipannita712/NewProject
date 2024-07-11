package demo;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String args[])
    {
        Map<String,String> map = new HashMap<>();
        map.put("dipa","saha");
        map.put("adrija","saha");
        map.put("mou","saha");
        map.put("dipa","roy");

        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey()+" " +m.getValue());
        }
    }
}

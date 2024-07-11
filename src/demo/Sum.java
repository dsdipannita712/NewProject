package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum
{
    public int[] getIndexOfSum(int[] a , int t)
    {
        if(a == null || a.length < 2)
        {
            return new int[]{0,0};
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                return new int[]{map.get(a[i]),i};
            }
            else
            {
                map.put(a[i],i);
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args)
    {
        int[] a= {3,3};
        int target = 6;
        Sum s = new Sum();
        int[] b = s.getIndexOfSum(a,target);
        List<Integer> list = new ArrayList<>();
        for(int bb : b)
        {
            list.add(bb);
        }
        System.out.println(list);
    }
}
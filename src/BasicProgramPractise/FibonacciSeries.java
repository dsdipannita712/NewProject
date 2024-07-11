package BasicProgramPractise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {

    public static void getSeriesOfFibonacci(int aa, int bb)
    {
        System.out.println(aa+" "+bb);
        int cc =0,dd =0;
        for(int i =2;i<=10;i++)
        {
            cc= aa+bb;
            aa=bb;
            bb=cc;
            System.out.println(cc);
            dd+= cc;
        }
        System.out.println(dd);

    }
    public static void main(String[] args) {

        int a=0,b =1;
        getSeriesOfFibonacci(a,b);
       System.out.println(Stream.iterate(new int[]{0,1}, t-> new int[]{t[1],t[0]+t[1]}).limit(10)
                .map(x->x[0]).map(String::valueOf).collect(Collectors.joining(",")));

       System.out.println(Stream.iterate(new int[]{0,1},tt-> new int[]{tt[1],tt[0]+tt[1]}).limit(10).map(x->x[0])
               .mapToInt(Integer::valueOf).sum());
    }
}

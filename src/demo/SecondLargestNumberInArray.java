package demo;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static int secondHighestNumberIn(int a[], int total) {
        int i=0, j=0, k=0;
        for(i=0;i<total;i++)
        {
            for(j=i+1;j<total;j++)
            {
                if(a[i]>a[j])
                {
                    k = a[i];
                    a[i] = a[j];
                    a[j]= k;
                }
            }
        }
        return a[total-1];
    }
    public static void main(String args[]) {
        int a[] = {100,87,67,98,46};
        int total = 5;
        int secondHighestNumber = secondHighestNumberIn(a,total);
        System.out.println(secondHighestNumber);
    }
}

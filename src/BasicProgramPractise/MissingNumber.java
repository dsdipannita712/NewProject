package BasicProgramPractise;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = 6;
        int sum =0;
        int ss =0;
        for(int s: arr)
        {
            sum += s;
        }
        System.out.println(sum);

        while(n>0)
        {
           ss += n;
           n--;
        }
        System.out.println(ss);
        int missingNum = ss - sum;
        System.out.println(missingNum);
    }
}

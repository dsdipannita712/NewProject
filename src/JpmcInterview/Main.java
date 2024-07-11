package JpmcInterview;

public class Main {
    // 100-5 = 95 , 300-10= 290 , 290+95 = 385
    public static void getMaxProfit(int[] p) {
        int max =0, min = 0, profit = 0;
        for (int i = 1; i < p.length; i++) {
            if (p[i] > p[i-1]) {
                min = p[i - 1 ];
                max = p[i];
                profit += max - min;
            }
        }
        System.out.println("profit :"+ profit);
    }
    public static void main(String[] args) {
        int[] prices = {10, 40, 50, 100, 5, 60, 300};//30,10,50,55,240
        //30,40,90,145,385
        getMaxProfit(prices);

    }
}

package demo;

public class SwapTwoNumbersUsingThirdVariable {
    public static void main(String args[]) {
        int temp, a = 45, b = 89;
        temp = a;
        a = b ;
        b = temp;

        System.out.println("a and b :" + a + " " + b);
    }
}

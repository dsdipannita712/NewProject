package demo;

public class RotateAnArrayByKthStep {

    public static void getRotateArray(int[] aa, int am) {
        int len = aa.length;
        am = am % aa.length;

        reverse(aa, 0, len - 1);
        reverse(aa, 0, am - 1);
        reverse(aa, am, len - 1);
    }

    private static void reverse(int[] ap, int start, int end) {
        int temp;
        while (start < end) {
            temp = ap[start];
            ap[start] = ap[end];
            ap[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {2,10,1, 2, 3, 4, 5, 6, 7}; //
        int ak = 3;
        getRotateArray(a, ak);
        for (int nn : a) {
            System.out.print(nn + " ");
        }
    }
}

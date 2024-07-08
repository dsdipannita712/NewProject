public class RotateAnArrayByKthStep {
    public static void getRotateArray(int[] aa, int kk) {
        kk = kk % aa.length;
        reverse(aa, 0, aa.length - 1);
        reverse(aa, 0, kk - 1);
        reverse(aa, kk, aa.length - 1);
    }

    public static void reverse(int[] am, int start, int end) {
        int temp;
        while (start < end) {
            temp = am[start];
            am[start] = am[end];
            am[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int ak = 3;
        getRotateArray(a, ak);
        for (int nn : a) {
            System.out.print(nn + " ");
        }
    }
}

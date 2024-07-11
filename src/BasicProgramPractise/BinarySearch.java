package BasicProgramPractise;

public class BinarySearch {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = a.length - 1;
        int target = 3, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (a[mid] == target) {
                System.out.println(a[mid]);
            }
            if (a[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element present:");
    }
}

import java.util.PriorityQueue;

public class KthSmallestElementMatrix {
    public static int getKthSmallestElement(int[][] mm, int l) {
        PriorityQueue< Integer > pq = new PriorityQueue<>((m1, m2) -> (m2 - m1));
        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                pq.add(mm[i][j]);
                if (pq.size() > l) {
                    pq.poll();
                }
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[][] m = {{1, 4, 5}, {8, 13, 2}, {9, 3, 6}}; // 1,2,3,4,5,6,8,9,13
        int k = 5;
        System.out.println(KthSmallestElementMatrix.getKthSmallestElement(m, k));
    }
}

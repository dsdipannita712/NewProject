package demo;

import java.util.PriorityQueue;

public class KthSmallestElementMatrix {
    public static int getKthSmallestElement(int[][] mm, int k) {
        PriorityQueue< Integer > pq = new PriorityQueue<>((m1, m2) -> m2 - m1);
        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                pq.add(mm[i][j]);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[][] m = {{1, 4, 5}, {83, 13, 34}, {90, 3, 68}}; // 1,3,4,5,13,34,68,83,90
        int k = 5;
        System.out.println(KthSmallestElementMatrix.getKthSmallestElement(m, k));
    }
}

import java.util.PriorityQueue;

public class MatrixProgram {

    public Integer getkthSmallest(int[][] m, int l) {
        PriorityQueue< Integer > pq = new PriorityQueue<>((m1, m2) -> (m2 - m1));
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                pq.add(m[i][j]);
                if (pq.size() > l) {
                    pq.poll();
                }
            }
        }
        return pq.poll();
    }

    public static void main(String args[]) {
        int[][] matrix = {{1, 4, 5}, {8, 13, 2}, {9, 3, 6}}; // 1,2,3,4,5,6,8,9,13
        int k = 4;
        MatrixProgram m = new MatrixProgram();
        System.out.println(m.getkthSmallest(matrix, k));
    }
}

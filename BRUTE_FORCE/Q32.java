import java.util.*;
public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        List<Integer> result = new ArrayList<>();
        int total = m * n;
        int row = 0, col = 0;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int dir = 0;
        for (int i = 0; i < total; i++) {
            result.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + dr[dir];
            int nextCol = col + dc[dir];
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                dir = (dir + 1) % 4;
            }
            row += dr[dir];
            col += dc[dir];
        }
        return result;
    }
}
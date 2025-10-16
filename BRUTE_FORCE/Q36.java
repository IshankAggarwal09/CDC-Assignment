import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] result = maxOnesRow(mat);
        System.out.println(Arrays.toString(result));
    }
    public static int[] maxOnesRow(int[][] mat) {
        int maxCount = -1;
        int rowIndex = -1;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }
        return new int[]{rowIndex, maxCount};
    }
}
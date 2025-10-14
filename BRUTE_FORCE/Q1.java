import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = reverseAfterM(arr, m);
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static int[] reverseAfterM(int[] arr, int m) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i <= m; i++) {
            res[i] = arr[i];
        }
        int idx = m + 1;
        for (int j = n - 1; j > m; j--) {
            res[idx++] = arr[j];
        }
        return res;
    }
}
import java.util.*;
public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && arr[j] > max) {
                    max = arr[j];
                }
            }
            ans[i] = max;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

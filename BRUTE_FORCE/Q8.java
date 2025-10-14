import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findRepeatingElements(arr);
    }
    public static void findRepeatingElements(int[] arr) {
        int n = arr.length;
        Set<Integer> printed = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1 && !printed.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                printed.add(arr[i]);
            }
        }
    }
}
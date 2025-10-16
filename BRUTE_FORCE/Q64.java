import java.util.*;

public class Q64 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) nums1[m + i] = nums2[i];
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m + sc.nextInt()];
        for (int i = 0; i < nums1.length; i++) nums1[i] = sc.nextInt();
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) nums2[i] = sc.nextInt();
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
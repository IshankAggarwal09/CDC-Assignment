import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] temp = new int[n];
        int j = 0;
        temp[j] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != temp[j]) {
                j++;
                temp[j] = nums[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            nums[i] = temp[i];
        }
        return j + 1;
    }
}

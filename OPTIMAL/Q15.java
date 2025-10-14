import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int maxProduct = maxProductSubarray(nums);
        System.out.println(maxProduct);
    }
    public static int maxProductSubarray(int[] nums) {
        int maxProduct = nums[0];
        int minTemp = nums[0];
        int maxTemp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxTemp;
                maxTemp = minTemp;
                minTemp = temp;
            }
            maxTemp = Math.max(nums[i], nums[i] * maxTemp);
            minTemp = Math.min(nums[i], nums[i] * minTemp);
            if (maxTemp > maxProduct) {
                maxProduct = maxTemp;
            }
        }
        return maxProduct;
    }
}
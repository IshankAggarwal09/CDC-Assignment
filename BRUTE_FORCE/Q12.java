import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        insertionSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int insertPos = findInsertPosition(nums, key, 0, i - 1);
            for (int j = i - 1; j >= insertPos; j--) {
                nums[j + 1] = nums[j];
            }
            nums[insertPos] = key;
        }
    }
    public static int findInsertPosition(int[] nums, int key, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == key) {
                return mid + 1;
            } else if (nums[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
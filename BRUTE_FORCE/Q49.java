import java.util.*;

public class Q49 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];

        for (int i = 0; i < n1; i++) {
            int found = -1;
            boolean start = false;
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == nums1[i]) {
                    start = true;
                    continue;
                }
                if (start && nums2[j] > nums1[i]) {
                    found = nums2[j];
                    break;
                }
            }
            ans[i] = found;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] res = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(maxFrequencyElements(nums));
        }
        sc.close();
    }
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        int maxFreq = 0;
        for (int val : freq.values()) {
            if (val > maxFreq) {
                maxFreq = val;
            }
        }
        int total = 0;
        for (int val : freq.values()) {
            if (val == maxFreq) {
                total += val;
            }
        }
        return total;
    }
}
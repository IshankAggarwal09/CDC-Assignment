class Q89 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Q89 sol = new Q89();
        System.out.println(sol.missingNumber(new int[]{3,0,1})); // 2
        System.out.println(sol.missingNumber(new int[]{0,1}));   // 2
        System.out.println(sol.missingNumber(new int[]{9,6,4,2,3,5,7,0,1})); // 8
    }
}
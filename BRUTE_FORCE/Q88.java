class Q88 {
    public static char getMaxOccurringChar(String s) {
        int[] freq = new int[26];
        
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxFreq = 0;
        char result = 'a';
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'a');
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String s1 = "testsample";
        String s2 = "output";

        System.out.println(getMaxOccurringChar(s1)); // e
        System.out.println(getMaxOccurringChar(s2)); // t
    }
}
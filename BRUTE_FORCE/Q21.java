import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char maxChar = maxOccurringChar(str);
        System.out.println(maxChar);
    }
    public static char maxOccurringChar(String str) {
        int n = str.length();
        int maxCount = 0;
        char result = str.charAt(0);
        boolean[] counted = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (counted[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    counted[j] = true;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                result = str.charAt(i);
            }
        }
        return result;
    }
}

import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = countWords(str);
        System.out.println(count);
    }
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        if (words.length == 1 && words[0].equals("")) {
            return 0;
        }
        return words.length;
    }
}
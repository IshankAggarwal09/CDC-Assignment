import java.util.*;
public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        if (s.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
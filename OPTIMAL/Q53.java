import java.util.*;
public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        Stack<Integer> st = new Stack<>();
        for (String s : arr) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")) {
                int b = st.pop();
                int a = st.pop();
                int res = 0;
                if (s.equals("+")) {
                    res = a + b;
                } else if (s.equals("-")) {
                    res = a - b;
                } else if (s.equals("*")) {
                    res = a * b;
                } else if (s.equals("/")) {
                    res = a / b;
                } else if (s.equals("^")) {
                    res = (int)Math.pow(a, b);
                }
                st.push(res);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        System.out.println(st.pop());
    }
}
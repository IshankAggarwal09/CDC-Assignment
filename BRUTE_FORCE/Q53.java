import java.util.*;
public class Q53 {
    public static int evaluate(List<String> arr) {
        if (arr.size() == 1) {
            return Integer.parseInt(arr.get(0));
        }
        int op = -1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            String s = arr.get(i);
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")) {
                op = i;
                break;
            }
        }
        List<String> left = new ArrayList<>(arr.subList(0, op - 2));
        int b = Integer.parseInt(arr.get(op - 1));
        int a = Integer.parseInt(arr.get(op - 2));
        int res = 0;
        String optr = arr.get(op);
        if (optr.equals("+")) {
            res = a + b;
        } else if (optr.equals("-")) {
            res = a - b;
        } else if (optr.equals("*")) {
            res = a * b;
        } else if (optr.equals("/")) {
            res = a / b;
        } else if (optr.equals("^")) {
            res = (int)Math.pow(a, b);
        }
        left.add(String.valueOf(res));
        if (op + 1 < arr.size()) {
            left.addAll(arr.subList(op + 1, arr.size()));
        }
        return evaluate(left);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<String> arr = Arrays.asList(input);
        System.out.println(evaluate(arr));
    }
}
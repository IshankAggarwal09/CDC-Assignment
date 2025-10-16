import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTillN(1, n);
    }
    public static void printTillN(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.print(current + " ");
        printTillN(current + 1, n);
    }
}
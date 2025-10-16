import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int moves = (int)Math.pow(2, n) - 1;
        System.out.println(moves);
    }
}
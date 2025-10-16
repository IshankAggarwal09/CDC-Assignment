import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int moves = hanoi(n, 'A', 'C', 'B');
        System.out.println(moves);
    }
    public static int hanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        count += hanoi(n - 1, from, aux, to);
        count += 1; 
        count += hanoi(n - 1, aux, to, from);
        return count;
    }
}

import java.util.*;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = powerOfReverse(n);
        System.out.println(result);
    }
    public static int powerOfReverse(int n) {
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        int result = 1;
        for (int i = 0; i < reverse; i++) {
            result *= n;
        }
        return result;
    }
}
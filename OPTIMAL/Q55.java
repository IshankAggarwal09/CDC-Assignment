import java.util.*;
public class Q55 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int ast : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && ast < 0 && st.peek() > 0) {
                if (Math.abs(st.peek()) < Math.abs(ast)) {
                    st.pop();
                    continue;
                } else if (Math.abs(st.peek()) == Math.abs(ast)) {
                    st.pop();
                }
                destroyed = true;
                break;
            }
            if (!destroyed) {
                st.push(ast);
            }
        }
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
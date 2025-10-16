import java.util.*;
public class Q55 {
    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        for (int val : asteroids) {
            list.add(val);
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1 && list.get(i) > 0 && list.get(i + 1) < 0) {
                    int a = list.get(i);
                    int b = list.get(i + 1);
                    if (Math.abs(a) > Math.abs(b)) {
                        newList.add(a);
                    } else if (Math.abs(a) < Math.abs(b)) {
                        newList.add(b);
                    }
                    i++;
                    changed = true;
                } else {
                    newList.add(list.get(i));
                }
            }
            list = newList;
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
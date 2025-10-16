import java.util.*;
public class Q54 {
    Stack<Integer> st;
    public Q54() {
        st = new Stack<>();
    }
    public void push(int val) {
        st.push(val);
    }
    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int x : st) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        MinStack_BruteForce minStack = new MinStack_BruteForce();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
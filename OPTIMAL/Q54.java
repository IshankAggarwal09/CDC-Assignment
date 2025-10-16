import java.util.*;
public class Q54 {
    Stack<Integer> st;
    Stack<Integer> minSt;
    public Q54() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        } else {
            minSt.push(minSt.peek());
        }
    }
    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            minSt.pop();
        }
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return minSt.peek();
    }
    public static void main(String[] args) {
        Q54 minStack = new Q54();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
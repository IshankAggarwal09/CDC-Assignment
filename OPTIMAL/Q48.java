import java.util.*;

class MyStack {
    private char[] arr;
    private int top;
    private int capacity;

    MyStack(int size) {
        capacity = size;
        arr = new char[capacity];
        top = -1;
    }

    public void push(char ch) {
        if (top < capacity - 1) {
            arr[++top] = ch;
        }
    }

    public char pop() {
        if (top >= 0) {
            return arr[top--];
        }
        return '\0'; // Empty stack
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        MyStack stack = new MyStack(input.length());

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to reverse string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println(reversed.toString());
    }
}
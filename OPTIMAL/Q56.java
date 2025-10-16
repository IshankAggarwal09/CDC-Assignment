import java.util.Stack;

class Q56 {
    private Stack<int[]> st; 

    public Q56() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }
        st.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        Q56 stockSpanner = new Q56();
        System.out.println(stockSpanner.next(100)); 
        System.out.println(stockSpanner.next(80));  
        System.out.println(stockSpanner.next(60));  
        System.out.println(stockSpanner.next(70));  
        System.out.println(stockSpanner.next(60));  
        System.out.println(stockSpanner.next(75));  
        System.out.println(stockSpanner.next(85));  
    }
}
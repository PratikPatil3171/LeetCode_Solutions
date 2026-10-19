import java.util.Stack;

class MinStack {
    private Stack<Long> st;
    private Long mini;

    public MinStack() {
        st = new Stack<>();
        mini = 0L;
    }
    
    public void push(int val) {
        Long value = (long) val;
        if (st.isEmpty()) {
            mini = value;
            st.push(value);
        } else if (value < mini) {
            // Encode the value to keep track of previous minimum
            st.push(2 * value - mini);
            mini = value;
        } else {
            st.push(value);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        
        long top = st.pop();
        // If top is smaller than mini, it's an encoded value; restore previous mini
        if (top < mini) {
            mini = 2 * mini - top;
        }
    }
    
    public int top() {
        if (st.isEmpty()) return -1;
        
        long top = st.peek();
        if (top < mini) {
            return mini.intValue();
        }
        return (int) top;
    }
    
    public int getMin() {
        return mini.intValue();
    }
}
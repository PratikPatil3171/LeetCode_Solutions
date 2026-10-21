import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    // private Queue<Integer> queue;

    // public MyStack() {
    //     queue = new LinkedList<>();
    // }
    
    // // Push element x onto stack.
    // public void push(int x) {
    //     queue.add(x);
    //     int size = queue.size();
    //     // Rotate the queue to bring the new element to the front
    //     while (size > 1) {
    //         queue.add(queue.remove());
    //         size--;
    //     }
    // }
    
    // // Removes the element on top of the stack and returns that element.
    // public int pop() {
    //     return queue.remove();
    // }
    
    // // Get the top element.
    // public int top() {
    //     return queue.peek();
    // }
    
    // // Returns whether the stack is empty.
    // public boolean empty() {
    //     return queue.isEmpty();
    // }


      Queue<Integer> queue1;
      Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    // Push element x onto stack.
    public void push(int x) {
      queue2.offer(x);
      while(!queue1.isEmpty()){
        queue2.offer(queue1.poll());
      }
      queue1 = queue2;
      queue2 = new LinkedList<>();
    }
    
    // Removes the element on top of the stack and returns that element.
    public int pop() {
        return queue1.remove();
    }
    
    // Get the top element.
    public int top() {
        return queue1.peek();
    }
    
    // Returns whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty();
    }
}
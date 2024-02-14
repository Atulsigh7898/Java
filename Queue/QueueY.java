package Queue;

// // package Queue;
// import java.util.Queue;
// import java.util.Stack;

import java.util.*;

public class QueueY {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();

        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());

            }
            s1.push(data);

            while(!s1.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        // Queue q = new Queue(5);
        // Queue<Integer> q = new LinkedList<>();
        Queue q = Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    private static Queue Queue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Queue'");
    }
}

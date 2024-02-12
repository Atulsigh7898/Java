import java.util.ArrayList;
import java.util.Stack;

public class StackClass {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

            
        
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    //  static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size() == 0;

    //     }
    //     public static void push(int data) {
    //         list.add(data);
    //     }
    //     //pop
    //     public static int pop(){
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     //peek
    //     public static int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //        return list.get(list.size()-1);
    //     }

    // }
    // static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data2) {
    //         //TODO Auto-generated constructor stub
    //     }
    //     Public Node(int data){
    //         this.data = data;
    //         next = null;
    //         return null;
    //     }
    // }
    // static class Stack {
    //     public static Node head;
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }
        
    //     public static void push(int data) {
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     public static int pop() {
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = head.data; 
    //         head = head.next;
    //         return top;
    //     }
    //     public static int peek() {
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    //     public char[] peek;
    // }

    public static void main(String[] args) {
        // Stack s =  new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // s.push(4);
        // pushAtBottom(4, s);
        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
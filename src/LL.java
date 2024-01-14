import org.w3c.dom.*;
import java.util.*;

public class LL {
////    class Node{
////        String data;
////        Node next;
////    }
//    Node head;
//    private int size;
//    LL(){
//        this.size = 0;
//
//    }
//
//    class Node{
//        String data;
//        Node next;
//
//         Node(String data) {
//             this.data = data;
//             this.next= null;
//             size++;
//        }
//
//        void Node(String data){
//            this.data = data;
//            this.next= null;
//        }
//    }
//    //add - first - add first
//
//    public void addFirst(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//
//    }
//    //add last
//    public void addLast(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//
//        Node currNode = head;
//        while (currNode.next != null){
//            currNode = currNode.next;
//        }
//
//        currNode.next = newNode;
//    }
//    //print
//    public void printList(){
//        if (head == null){
//            System.out.print("List is empty");
//            return;
//        }
//        if (head.next == null){
//            head = null;
//            return;
//        }
//
//        Node currNode = head;
//        while (currNode != null){
//            System.out.print(currNode.data+ "->");
//        }
//        System.out.print("Null");
//    }
//    public void deleteFirst(){
//        if(head == null){
//            System.out.println("The list is empty");
//            return;
//        }
//        size--;
//        head = head.next;
//    }
//    public void deletLast(){
//        if(head == null){
//            System.out.println("The list is empty");
//            return;
//        }
//        size--;
//        if(head == null){
//            System.out.println("The list is empty");
//            return;
//        }
//
//        Node SecondLast = head;
//        Node lastNode = head.next;
//        while (lastNode.next != null){
//            lastNode = lastNode.next;
//            SecondLast = SecondLast.next;
//        }
//        SecondLast.next = null;
//    }
//    public int getSize(){
//        return size;
//    }
//    public static void main(String[] args) {
//        LL list = new LL();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printList();
//
//        list.addLast("list");
//        list.printList();
//        list.addFirst("this");
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//
//        list.deletLast();
//        list.printList();
//        System.out.println(list.getSize());
//        list.addFirst("this");
//        System.out.println(list.getSize());
//    }

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("this");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());

        for(int i =0; i< list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
//        list.removeFirst();
//        System.out.println(list);
//
//        list.removeLast();
//        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
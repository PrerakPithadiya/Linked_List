package w3Resource;
import java.util.ArrayList;
import java.util.Arrays;
public class _9_delete_Last{
    public static class LinkedList{
        class Node{
            double data;
            Node next;
            Node(double val){ this.data = val; }
        }
        Node head = null;
        void add(double data){
            Node x = new Node(data);
            if(head == null){
                x.next = head;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            }
        }
        void printList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void pollLast(){
            if(head == null){
                System.out.println("The List is Empty!");
                return;
            } else if(head.next == null){
                head = head.next;
                return;
            }
            Node i = head;
            while(i.next.next != null){ i = i.next; }
            i.next = i.next.next;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        ArrayList<Double> arr = new ArrayList<>(Arrays.asList(12.34, 23.67, 34.59, 18.45, 56.32, 22.65));
        for(double element : arr){
            list.add(element);
        }
        System.out.print("Original LinkedList ==> ");
        list.printList();
        list.pollLast();
        System.out.print("Updated LinkedList ==> ");
        list.printList();
    }
}
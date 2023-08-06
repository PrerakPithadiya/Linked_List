package Collage_Wallah;
import java.util.*;
public class middle_Node{
    public static class Node{
        float data;
        Node next;
        Node(float val){ this.data = val; }
    }
    public static class LinkedList{
        Node head = null;
        void add(float data){
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
        void displayList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            }
//            System.out.println("null");
            System.out.println();
        }
        void insertNodes(int n){
            Random rd = new Random();
            for(int i = 1; i <= n; i++){
                add(rd.nextFloat(1, 100));
            }
        }
        Node middleNode(){
            Node slow = head;
            Node fast = head;
            // left middle
//            while(fast.next != null && fast.next.next != null){
//                slow = slow.next;
//                fast = fast.next.next;
//            }

            // right middle
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter LinkedList Size : ");
        int size = sc.nextInt();
        list.insertNodes(size);
        list.displayList();
        Node middle = list.middleNode();
        System.out.println("Middle Nodes is : " + middle.data);
    }
}
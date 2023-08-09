package Collage_Wallah;
import java.util.*;
public class offer{
    public static class Node{
        int data;
        Node next;
        Node(int data){ this.data = data; }
    }
    public static class LinkedList{
        Node head = null;
        void add(int data){
            Node x = new Node(data);
            if(head == null){
                x.next = null;
                head = x;
            } else{
                Node i = head;
                while(i.next != null){ i = i.next; }
                i.next = x;
            }
        }
        void displayList(){
            Node i = head;
            while(i != null){
                System.out.print(i.data + " -> ");
                i = i.next;
            } System.out.println("null");
        }
        void insertNodes(int size){
            Random rd = new Random();
            for(int i = 1; i <= size; i++){ add(rd.nextInt(1, 100)); }
        }
        void offer(int data){
            Node x = new Node(data);
            if(head == null){
                x.next = null;
                head = x;
                return;
            }
            Node i = head;
            while(i.next != null){ i = i.next; }
            i.next = x;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter LinkedList Size : ");
        int size = sc.nextInt();
        list.insertNodes(size);
        System.out.print("LinkedList is ==>> ");
        list.displayList();
        System.out.print("\nHow Many Nodes Do You need to Insert? : ");
        int n = sc.nextInt();
        while(n != 0){
            System.out.print("Enter Node Data : ");
            int data = sc.nextInt();
            list.offer(data);
            System.out.print("Updated LinkedList is ==>> ");
            list.displayList();
            System.out.println();
            n--;
        }
    }
}
package Collage_Wallah;
import java.util.*;
public class listIterator{
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
                while (i.next != null) { i = i.next; }
                i.next = x;
            }
        }
        void printList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void insertNodes(int n){
            Random rd = new Random();
            for(int i = 1; i <= n; i++){
                add(rd.nextInt(1, 100));
            }
        }
        boolean listIterator(int ind, int size){
            if(ind < 0 || ind > size){ System.out.println("Invalid Index Number..!"); return false; }
            Node i = head;
            for(int m = 1; m <= ind; m++){ i = i.next; }
            head = i;
            return true;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter LinkedList Size : ");
        int n = sc.nextInt();
        list.insertNodes(n);
        System.out.print("LinkedList is ==>> ");
        list.printList();
        System.out.print("Enter Index : ");
        int position = sc.nextInt();
        boolean result = list.listIterator(position, n);
        if(result){
            System.out.print("List from Index " + position + " is ==>> ");
            list.printList();
        }
    }
}
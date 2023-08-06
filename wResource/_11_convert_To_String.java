package w3Resource;
import java.util.*;
public class _11_convert_To_String{
    public static class LinkedList{
        class Node{
            int data;
            Node next;
            Node(int data){ this.data = data; }
        }
        Node head = null;
        void add(int data){
            Node x = new Node(data);
            if(head == null){
                x.next = head;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){}
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
            for(int m = 1; m <= n; m++){
                add(rd.nextInt(1, 100));
            }
        }
        String ToString(){
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for(Node i = head; i != null; i = i.next){
                sb.append(i.data);
                if(i.next != null){ sb.append(", "); }
            } sb.append(']');
            return sb.toString();
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter LinkedList Size : ");
        int n = sc.nextInt();
        list.insertNodes(n);
        System.out.print("LinkedList ==> ");
        list.printList();
        String strList = list.ToString();
        System.out.print("String LinkedList ==> " + strList);
    }
}
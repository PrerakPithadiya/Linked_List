package Collage_Wallah;
import java.util.Scanner;
public class removeFirst{
    public static class LinkedList{
        class Node{
            String data;
            Node next;
            Node(String data){ this.data = data; }
        }
        Node head = null;
        void add(String data){
            Node x = new Node(data);
            if(head == null){
                x.next = null;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            }
        }
        void print(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("NULL");
        }
        void removeFirst(){
            if(head == null){
                System.out.println("The List is Empty..!");
            } else{
                head = head.next;
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        list.add("Prerak");
        list.add("Utsav");
        list.add("Pithadiya");
        list.add("Jani");
        list.add("Om");
        list.print();

        list.removeFirst();
        list.removeFirst();

        list.print();
    }
}
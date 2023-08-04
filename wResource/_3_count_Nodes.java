package w3Resource;
import java.util.ArrayList;
import java.util.Arrays;
public class _3_count_Nodes{
    public static class LinkedList{
        class Node{
            String data;
            Node next;
            Node(String data){ this.data = data; }
        }
        Node head = null;
        int size = 0;
        void add(String data){
            Node x = new Node(data);
            if(head == null){
                x.next = head;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            } size++;
        }
        void displayLinkedList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("My","Name","is","Mohan","Kumar"));
        for(String element : arr){
            list.add(element);
        }
        System.out.print("LinkedList ==> ");
        list.displayLinkedList();
        int linkedListSize = list.size();
        System.out.println("The Size of LinkedList is : " + linkedListSize);
    }
}
package w3Resource;
import java.util.Scanner;
public class _10_Index_Of_Element{
    public static class LinkedList{
        class Node{
            int data;
            Node next;
            Node(int val){ this.data = val; }
        }
        Node head = null;
        void add(int data){
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
            } System.out.println("null");
        }
        int contains(int data){
            int ind = 0;
            for(Node i = head; i != null; i = i.next){
                if(i.data == data){
                    return ind;
                }
                ind++;
            }
            return -1;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(23);
        list.add(44);
        list.add(11);
        list.add(34);
        list.add(78);
        System.out.print("LinkedList ==> ");
        list.displayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element : ");
        int n = sc.nextInt();
        int position = list.contains(n);
        if(position != -1){ System.out.println("The Element is Present at Index : " + position); }
        else{ System.out.println("The Element doesn't Found in LinkedList!"); }
    }
}
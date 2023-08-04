package w3Resource;
import java.util.Scanner;
import java.util.Random;
public class _1_display_LinkedList{
    public static class LinkedList{
        class Node{
            int data;
            Node next;
            Node(int data){ this.data = data; }
        }
        Node head = null;
        void addNode(int data){
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
        void insertNodes(int n, int start, int end){
            Random rd = new Random();
            for(int i = 1; i <= n; i++){
                addNode(rd.nextInt(start, end + 1));
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Node Do You need to Insert? : ");
        int n = sc.nextInt();
        System.out.print("Enter Start Range : ");
        int start = sc.nextInt();
        System.out.print("Enter End Range : ");
        int end = sc.nextInt();
        list.insertNodes(n, start, end);
        System.out.print("Linked List is : ");
        list.displayList();
    }
}
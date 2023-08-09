package Collage_Wallah;
import java.util.*;
public class lastIndexOf{
    public static class Node{
        int data;
        Node next;
        Node(int data){ this.data = data; }
    }
    public static class LinkedList{
        Node head = null;
        int size = 0;
        void add(int data){
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
        void printList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void insertNodes(int n){
            Random rd = new Random();
            for(int i = 1; i <= n; i++){
                add(rd.nextInt(1, 10));
            }
        }
        int lastIndexOf(int element){
            reverseList();
            int ind = size - 1;
            for(Node i = head; i != null; i = i.next){
                if(i.data == element){
                    return ind;
                }
                ind--;
            }
            return -1;
        }
        void reverseList(){
            Node prev = null;
            Node curr = head;
            while(curr != null){
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            head = prev;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter LinkedList Size : ");
        int n = sc.nextInt();
        list.insertNodes(n);
        System.out.print("LinkedList is :-> ");
        list.printList();
        System.out.print("Enter the Element : ");
        int element = sc.nextInt();
        int lastInd = list.lastIndexOf(element);
        System.out.println("The Last Occurrence of Element is at Index : " + lastInd);
    }
}
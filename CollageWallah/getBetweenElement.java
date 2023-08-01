package Collage_Wallah;
import java.util.Scanner;
public class getBetweenElement{
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
        void display(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("NULL");
        }
        int size(){
            int len = 0;
            for(Node i = head; i != null; i = i.next){ len++; }
            return len;
        }
        String getFirst(){
            return head.data;
        }
        String getLast(){
            Node i = head;
            for(; i.next != null; i = i.next){ }
            return i.data;
        }
        String get(int ind){
            if(ind == 0){
                return getFirst();
            } else if(ind == size() - 1){
                return getLast();
            } else if(ind < 0 || ind >= size()){
//                System.out.println("Invalid Index..!");
                return null;
            } else {
                Node i = head;
                for(int m = 1; m <= ind; m++){ i = i.next; }
                return i.data;
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        list.add("Prerak");
        list.add("Utsav");
        list.add("Hardik");
        list.add("Umang");
        list.add("Om");
        list.add("Raj");
        list.display();

        System.out.print("Do You need to Find Data? : ");
        char ch = sc.next().charAt(0);

        while(ch == 'y' || ch == 'Y'){
            System.out.print("Enter Index : ");
            int ind = sc.nextInt();
            System.out.println("Result is : " + list.get(ind));
            System.out.print("Do You need to Find Data? : ");
            ch = sc.next().charAt(0);
        }
    }
}
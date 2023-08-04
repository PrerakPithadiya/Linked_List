package w3Resource;
import java.util.Scanner;
public class _6_insert_At_given_Position{
    public static class LinkedList{
        class Node{
            char data;
            Node next;
            Node(char data){ this.data = data; }
        }
        Node head = null;
        int size = 0;
        void add(char ch){
            Node x = new Node(ch);
            if(head == null){
                x.next = head;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            } size++;
        }
        void print(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void addFirst(char ch){
            Node x = new Node(ch);
            x.next = head;
            head = x;
        }
        void addLast(char ch){
            Node x = new Node(ch);
            Node i = head;
            for(; i.next != null; i = i.next){ i = i.next; }
            i.next = x;
        }
        void add(byte position, char data){
            Node x = new Node(data);
            if(position == 1){
                addFirst(data);
            } else if(position == size + 1){
                addLast(data);
            } else if(position < 1 || position > size + 1){
                System.out.println("Entered Invalid Index Number!");
            } else{
                Node i = head;
                for(int m = 1; m <= position - 2; m++){ i = i.next; }
                Node n1 = i;
                Node n2 = i.next;
                n1.next = x;
                x.next = n2;
            } size++;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        String str = "HelloWorld";
        for(char element : str.toCharArray()){ list.add(element); }
        System.out.print("Original LinkedList ==> ");
        list.print();
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Terms Do You need to Insert in LinkedList? : ");
        byte terms = sc.nextByte();
        System.out.println();
        while(terms != 0) {
            System.out.print("Enter Character Data to Insert in LinkedList : ");
            char data = sc.next().charAt(0);
            System.out.print("Enter Position to Insert the Data : ");
            byte position = sc.nextByte();
            list.add(position, data);
            System.out.print("Updated LinkedList ==> ");
            list.print();
            System.out.println();
            terms--;
        }
    }
}
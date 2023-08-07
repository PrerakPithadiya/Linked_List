package Collage_Wallah;
public class indexOf{
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
            } System.out.println("null");
        }
        int indexOf(int data){
            int ind = 0;
            for(Node i = head; i != null; i = i.next){
                if(i.data == data){
                    return ind;
                } ind++;
            }
            return -1;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(23);
        list.add(45);
        list.add(22);
        list.add(53);
        list.print();
        System.out.println(list.indexOf(21));
    }
}
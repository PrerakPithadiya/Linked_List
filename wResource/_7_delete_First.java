package w3Resource;
public class _7_delete_First{
    public static class LinkedList{
        class Node{
            char data;
            Node next;
            Node(char ch){ this.data = ch; }
        }
        Node head = null;
        void add(char ch){
            Node x = new Node(ch);
            if(head == null){
                x.next = head;
                head = x;
            } else{
                Node i = head;
                for(; i.next != null; i = i.next){ }
                i.next = x;
            }
        }
        void printList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void pollFirst(){
            if(head == null){
                System.out.println("The List is Already 'Empty'!");
            } else{
                head = head.next;
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        String str = "helloworld";
        for(char ch : str.toCharArray()){ list.add(ch); }
        list.printList();
        list.pollFirst();
        list.pollFirst();
        list.printList();
    }
}
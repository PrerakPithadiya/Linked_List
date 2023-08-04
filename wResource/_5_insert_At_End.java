package w3Resource;
public class _5_insert_At_End{
    public static class LinkedList{
        class Node{
            char data;
            Node next;
            Node(char data){ this.data = data; }
        }
        Node head = null;
        void add(char data){
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
        void addLast(char ch){
            Node x = new Node(ch);
            Node i = head;
            for(; i.next != null; i = i.next){ }
            i.next = x;
        }
        void displayList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        String str = "prerak";
        for(char ch : str.toCharArray()){ list.add(ch); }
        list.displayList();
        list.addLast('z');
        list.displayList();
        list.addLast('q');
        list.displayList();
    }
}
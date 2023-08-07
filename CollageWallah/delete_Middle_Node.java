package Collage_Wallah;
public class delete_Middle_Node {
    public static class Node{
        char data;
        Node next;
        Node(char data){ this.data = data; }
    }
    public static class LinkedList{
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
        void displayList(){
            for(Node i = head; i != null; i = i.next){
                System.out.print(i.data + " -> ");
            } System.out.println("null");
        }
        void removeRightMiddle(){
            // remove right middle node from linkedlist
            Node slow = head;
            Node fast = head;
            if(head.next == null){
                head = head.next;
                return;
            }
            while(fast.next.next != null && fast.next.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
        }
        void removeLeftMiddle(){
            // remove left middle node from linkedlist
            Node slow = head;
            Node fast = head;
            if(head.next == null || head.next.next == null){
                head = head.next;
                return;
            }
            while(fast.next.next.next != null && fast.next.next.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        String str = "prerak";
        for(char data : str.toCharArray()){ list.add(data); }
        list.displayList();
        list.removeRightMiddle();
        list.removeLeftMiddle();
        list.displayList();
    }
}
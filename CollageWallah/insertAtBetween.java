package Collage_Wallah;
public class insertAtBetween{
    public static class LinkedList{
        class Node{
            String data;
            Node next;
            Node(String data){
                this.data = data;
            }
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
        void add(int ind, String data){
            Node x = new Node(data);
            if(ind == 0){
                addFirst(data);
            } else if(ind == size()){
                addLast(data);
            } else if(ind < 0 && ind > size()){
                System.out.println("Given Index is Invalid..!");
            } else{
                Node i = head;
                for(int m = 1; m <= ind - 1; m++){ i = i.next; }
                Node n1 = i;
                Node n2 = i.next;
                n1.next = x;
                x.next = n2;
            }
        }
        void addFirst(String data){
            Node x = new Node(data);
            if(head == null){
                x.next = null;
                head = x;
            } else{
                x.next = head;
                head = x;
            }
        }
        void addLast(String data){
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
        int size(){
            int len = 0;
            for(Node i = head; i != null; i = i.next){
                len++;
            }
            return len;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("Prerak");
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("Linkedlist");
        list.display();
        list.add(2, "Pithadiya");
        list.add(3, "Jasminbhai");
        list.add(7, "and");
        list.display();
    }
}
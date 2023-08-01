package Collage_Wallah;
public class removeBetween{
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
                System.out.print(i.data + " --> ");
            } System.out.println("null");
        }
        void removeFirst(){
            try {
                head = head.next;
            } catch(Exception e){
                System.out.println("The List is Empty!");
            }
        }
        void removeLast(){
            try {
                if (head.next == null) {
                    head = null;
                } else {
                    Node i = head;
                    while (i.next.next != null) {
                        i = i.next;
                    }
                    i.next = null;
                }
            } catch(Exception e){
                System.out.println("The List is Empty!");
            }
        }
        int size(){
            int len = 0;
            for(Node i = head; i != null; i = i.next){
                len++;
            }
            return len;
        }
        void remove(int ind){
            if(ind == 0){
                removeFirst();
            } else if(ind == size() - 1){
                removeLast();
            } else if(ind < 0 || ind >= size()){
                System.out.println("Invalid Index..!");
            } else{
                Node i = head;
                for(int m = 1; m <= ind - 1; m++){ i = i.next; }
                Node n1 = i;
                Node n2 = i.next.next;
                n1.next = n2;
            }
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(23);
        list.add(44);
        list.add(89);
        list.print();
        list.remove(2);
        list.print();
        list.remove(0);
        list.print();
    }
}
class LinkedList{
    public static class Node{
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
    void addFirst(String data){
        Node x = new Node(data);
        if(head == null){
            head = x;
        } else{
            x.next = head;
            head = x;
        }
    }
}
class insertAtBeginning{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add("is");
        list.add("a");
        list.add("List");
        list.display();
        list.addFirst("This");
        list.addFirst("Hello");
//        list.addFirst("Prerak");
        list.display();
    }
}
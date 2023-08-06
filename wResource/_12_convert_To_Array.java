package w3Resource;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;
import java.util.Arrays;
public class _12_convert_To_Array{
    public static class LinkedList{
        class Node{
            int data;
            Node next;
            Node(int val){ this.data = val; }
        }
        Node head = null;
        int size = 0;
        void add(int val){
            Node x = new Node(val);
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
                add(rd.nextInt(1, 100));
            }
        }
        int[] ToArray(){
            int arr[] = new int[size], m = 0;
            for(Node i = head; i != null; i = i.next){ arr[m++] = i.data; }
            return arr;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter LinkedList Size : ");
        int n = sc.nextInt();
        list.insertNodes(n);
        System.out.print("LinkedList ==> ");
        list.printList();
        int[] arrList = list.ToArray();
        System.out.println("Array ==> " + Arrays.toString(arrList));
    }
}

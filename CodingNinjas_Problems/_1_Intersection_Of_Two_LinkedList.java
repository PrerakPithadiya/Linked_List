/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Node tempA = firstHead;
        Node tempB = secondHead;

        // find length of both lists
        int m = 0;
        for(; tempA != null; tempA = tempA.next){ m++; }

        int n = 0;
        for(; tempB != null; tempB = tempB.next){ n++; }

        tempA = firstHead;
        tempB = secondHead;

        // checking which in bigger
        if(m > n){
            int steps = m - n;
            for(int i = 1; i <= steps; i++){
                tempA = tempA.next;
            }
        }
        else{
            int steps = n - m;
            for(int i = 1; i <= steps; i++){
                tempB = tempB.next;
            }
        }

        // find the intersecter node
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA.data;
    }
}

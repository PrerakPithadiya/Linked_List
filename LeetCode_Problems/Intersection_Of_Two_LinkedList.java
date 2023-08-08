/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        // get length of list 1
        int m = 0;
        for(; tempA != null; tempA = tempA.next){
            m++;
        }

        // get length of list 2
        int n = 0;
        for(; tempB != null; tempB = tempB.next){
            n++;
        }

        tempA = headA;
        tempB = headB;

        if(m > n){
            int steps = m - n;
            for(int i = 1; i <= steps; i++){
                tempA = tempA.next;
            }
        } else{
            int steps = n - m;
            for(int i = 1; i <= steps; i++){
                tempB = tempB.next;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        for(ListNode i = head; i != null; i = i.next){
            sb.append(i.val);
        }

        int ans = Integer.parseInt(sb.toString(), 2);

        return ans;


    }
}

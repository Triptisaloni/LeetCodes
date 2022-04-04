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
    public ListNode swapNodes(ListNode head, int k) {
//         Swapping data
        if(head==null||head.next==null)
            return head;
        ListNode x=head;
        ListNode y = head;
        ListNode t =head;
        
        
        while(k>1)
        {
            x= x.next;
            t=t.next;
            k--;
        }
        
        while(t.next!=null)
        {
            y=y.next;
            t=t.next;
        }
        
        int temp = x.val;
        x.val = y.val;
        y.val = temp;
        
        return head;
    }
}
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null ||head.next==null)
            return null;
        
        ListNode aage = head, peeche = head;
        
        
        for(int i=1; i<=n; i++)
            aage = aage.next;
        
        if(aage == null)
            return head.next;
        
        
        while(aage!=null && aage.next!=null)
        {
            peeche = peeche.next;
            aage = aage.next;
        }
        // if(peeche==head)
        //     return head.next;
        
        peeche.next = peeche.next.next;
        return head;
    }
}
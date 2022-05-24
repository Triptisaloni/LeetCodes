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
        
        
        if(n==0 || head==null)
            return head;
        
        if(n==1 && head.next==null)
            return null;
        
        ListNode aage = head;
        while(n>0)
        {
            aage = aage.next;
            n--;
        }
        
        if(aage==null)
            return head.next;
        
        
        ListNode piche= head;
        
        while(aage!=null && aage.next!=null)
        {
            aage = aage.next;
            piche = piche.next;
        }
        
        piche.next = piche.next.next;
        
        return head;
    }
}
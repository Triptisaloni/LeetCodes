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
    
    public ListNode rev(ListNode head)
    {
        ListNode prev = null, next =null, curr=head;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        
        return prev;
    }
    
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
            if(head==null || head.next==null || left==right)
            return head;
       
        ListNode revstart = null, revend=null, revs_prev=null, revend_next=null;
            
        int i=1;
        ListNode curr = head;
        
        while(curr!=null && i<=right)
        {
            if(i<left)
                revs_prev= curr;
            if(i==left)
                revstart = curr;
            
            if(i==right)
            {
                revend = curr;
                revend_next=curr.next;
            }
            
            curr = curr.next;
            i++;
        }
        
        
        revend.next=null;
        
        revend = rev(revstart);
        
        // revs_prev.next = revend;
        if(revs_prev!=null)
        revs_prev.next= revend;
        else
            head = revend;
        
        revstart.next = revend_next;
        
        return head;
        

        
    }
}
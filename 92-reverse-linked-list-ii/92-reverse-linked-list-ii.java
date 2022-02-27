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
    
    /*public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode leftStart = new ListNode(-1000, head);
        ListNode leftEnd = leftStart;
        int i = 0;
        while (i < left-1) {
            leftEnd = leftEnd.next;
            i++;
        }
        ListNode prev = null;
        ListNode rEnd = leftEnd.next;
        ListNode rStart = leftEnd.next;
        while (rStart != null && i < right) {
            ListNode temp = rStart;
            rStart = rStart.next;
            temp.next = prev;
            prev = temp;
            i++;
        }
        leftEnd.next = prev;
        rEnd.next = rStart;
        return leftStart.next;
    }*/
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr =head;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;
        }
        
        return prev;
    }
    
//     public ListNode reverse(ListNode  head)
// {
//     ListNode  prev = null;   
//     ListNode  curr = head;
 
//     while (curr!=null) {
//         ListNode next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;
//     }
//     return prev;
// }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null || head.next==null)
            return head;
        if(left==right)
            return head;
         
        ListNode revstart = null, revend=null, revs_prev=null, revend_next=null;
            
        int i=1;
        ListNode curr=head;
       
        while(curr!=null && i<=right)
        {
            if(i<left)
                revs_prev= curr;
            if(i==left)
                revstart=curr;
            if(i==right)
            {
                revend= curr;
            revend_next=curr.next;
            }
            curr=curr.next;
            i++;
        }
        
        revend.next=null;
        
        revend = reverse(revstart);
        
        if(revs_prev!=null)
            revs_prev.next= revend;
        else
            head = revend;
        
        revstart.next=revend_next;
        
        return head;
        
    }
}
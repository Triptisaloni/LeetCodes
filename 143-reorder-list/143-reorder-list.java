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
    
    public static ListNode mid(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode slow=head,fast = head;
        
        while(fast.next!=null  && fast.next.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    
    }       
    
    public static ListNode reverse(ListNode head)
    {
        
        if(head==null || head.next==null)
            return head;
        ListNode prev=null, next = null, curr = head;
        
        while(curr!=null)
        {
            next =  curr.next;
            curr.next= prev;
            prev = curr;
            curr= next;
        }
    return prev;
    }
    
    
    public void reorderList(ListNode head) {
        
        
        if(head==null || head.next==null)
            return ;
        
        
        ListNode mid = mid(head);
        ListNode nayahead = mid.next;
        mid.next = null;
        
        nayahead = reverse(nayahead);
        
        ListNode c1=head, c2= nayahead, f1 = null, f2 = null;
        
        while(c2!=null)
        {
            f1 =c1.next;
            f2=c2.next;
            
            c1.next = c2;
            c2.next = f1;
           
            c1=f1;
            c2=f2;
        } 
        
        // head=c1;
    }
}
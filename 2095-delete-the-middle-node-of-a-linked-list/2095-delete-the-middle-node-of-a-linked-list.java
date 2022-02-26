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
    
    public int length(ListNode head)
    {
        if(head==null)
            return 0;
        int l=0;
        
        while(head!=null)
        {
            head=head.next;
            l++;
        }
          return l;  
    }
    
    
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        
        if(head.next.next==null)
        {
            head.next =null;
            return head;
        }
        
        int midp = 0;
        int l = length(head);
        if(l%2==0)
            midp=l/2;
        else
            midp=(l-1)/2;
        
        ListNode ptr = head;
        
        int count=1;
        while(count<midp)
        {
            ptr = ptr.next;
            count++;
        }
        
        ptr.next= ptr.next.next;
        
        return head;
        
    }
}
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
        int len=0;
        
        if(head==null)
            return 0;
        
        while(head!=null)
        {
            head = head.next;
            len++;
        }
        
        return len;
    }
    
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null )
            return head;
        
        int l = length(head);
        
        if(l == n)
            return  head.next;
        
        int reach = l-n;
        int count =1;
        ListNode ptr = head;
        
        while(count !=reach)
        {
            count++;
            ptr= ptr.next;  
        }
        
        ListNode next = ptr.next.next;
        ptr.next = next;
        
        return head;
    }
}
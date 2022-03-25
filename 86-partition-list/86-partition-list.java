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
    public ListNode partition(ListNode head, int x) {
        
        ListNode ptr1 =new ListNode(-1), ptr2 =new ListNode(-1);
        ListNode curr=head, curr1 =ptr1, curr2 =ptr2;
        
        
        while(curr!=null)
        {
            if(curr.val<x)
            {
                curr1.next = curr;
                curr1=curr;
            }
            else
            {
                curr2.next=curr;
                curr2 = curr;
            }
            
            curr=curr.next;
            
        }
        
        curr2.next=null;
        
        if(ptr1.next==null)
            return ptr2.next;
        
        else
            curr1.next = ptr2.next;
        
        return ptr1.next;
    }
}
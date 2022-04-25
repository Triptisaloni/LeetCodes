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
        ListNode slow = head, fast = head;
        
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow= slow.next;
            fast=fast.next.next;
            
        }
        return slow;
        
    }
    
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode curr = head, prev=null, nex = null;
        
        while(curr!=null)
        {
            nex= curr.next;
            curr.next= prev;
            prev = curr;
            curr = nex;
        }
        
     return prev;
    }
    
    
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
            return true;
        
//         ListNode slow = head, fast =head;
//         while(fast!=null && fast.next!=null)
//         {
//             slow = slow.next;
//             fast = fast.next;
//         }
        
        ListNode mid = mid(head);
        
        ListNode revhead = reverse(mid);
        // return true;
        
        while(head!=null && revhead!=null)
        {
            if(head.val!=revhead.val)
                return false;
            
            head=head.next;
             revhead = revhead.next;

        }
        
        return true;
    }
}
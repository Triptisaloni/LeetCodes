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
    
//     public int length(ListNode head)
//     {
//         if(head.next==null)
//             return 1;
        
//         return 1 + length(head.next);
//     }
    
    public ListNode reverse(ListNode head)
    {
         if(head==null || head.next==null)
            return head;
        
        ListNode prev = null, curr = head, next = null;
        
        while(curr!=null)
        {          
            next = curr.next;
            // last me nhi daal skte kyukii....
            // curr= cuur.next ho aayega or hume uska next nhi ptaaa h ki null h ya nhii
            
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
    
    
    public ListNode mid(ListNode head)
    {
        ListNode slow = head, fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    
    
    public boolean isPalindrome(ListNode head) {
        

        if(head== null || head.next==null)
            return true;
        
        ListNode middle = mid(head);
        ListNode revHead = reverse(middle);
        
        // ListNode start= head;
        
        while(head!=null && revHead!=null)
        {
            if(head.val!=revHead.val)
                return false;
            
            head= head.next;
            revHead = revHead.next;
        }
        
        
        return true;
    }
}
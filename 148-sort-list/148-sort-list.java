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
    
    public ListNode middle(ListNode head)
    {
        ListNode slow=head, fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
    public ListNode merge(ListNode left, ListNode right)
    {
        if(left==null) return right;
        if(right==null) return left;
        
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        
        
        while(left!=null && right!=null)
        {
            if(left.val < right.val)
            {
                temp.next = left;
                temp =left;
                left= left.next;
            }
            else
            {
                temp.next = right;
                temp =right;
                right= right.next;
            }
        }
        
        if(left!=null)
        {
            temp.next =left;
        }
        if(right!=null)
        {
            temp.next = right;
        }
        
        result = result.next;
        return result;
    }
    
    public ListNode mergeSort(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode left = head;
        ListNode mid = middle(head);
        ListNode right = mid.next;
        mid.next=null;
        
       left = mergeSort(head);
        right  = mergeSort(right);
        
        return merge(left, right);
        
        
    }
    
    public ListNode sortList(ListNode head) {
        
        
        return mergeSort(head);
    }
}
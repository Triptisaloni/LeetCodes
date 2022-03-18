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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
            return true;
        
        Stack <Integer> s= new Stack<>();
        
        ListNode curr=head;
        ListNode ptr = head;
        
        
        while(curr!=null)
        {
            s.push(curr.val);
            curr = curr.next;
        }
        
        while(ptr!=null)
        {
            if(s.peek()!=ptr.val)
                return false;
            
            s.pop();
            ptr= ptr.next;
        }
        
        return true;
    }
}
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
    public ListNode mergeKLists(ListNode[] lists) {
     
        if(lists==null || lists.length ==0)
            return null;
        return mergeLists(lists, 0, lists.length-1);
        
    }
    
    private ListNode mergeLists(ListNode[] lists, int start, int end)
    {
            if(start==end)
                return lists[start];
        
        int mid = (start+end)/2;
        
        ListNode left = mergeLists(lists, start, mid);
        ListNode right = mergeLists(lists, mid+1, end);
        
        return merge(left, right);
        
    
    }
    
    private ListNode merge(ListNode left, ListNode right)
    {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        
        
        while(left!=null && right !=null)
        {
            if(left.val<= right.val)
            {
                temp.next = left;
                left = left.next;
            }
            else
            {
                temp.next = right;
                right = right.next;
            }
            
            temp = temp.next;
        }
        
        while(left !=null)
        {
            
                temp.next = left;
                left = left.next;
             temp = temp.next;
        }
        
                while(right !=null)
        {
            
                temp.next = right;
                right = right.next;
             temp = temp.next;
        }
        
        return head.next;
    }
}
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
     
        ListNode less = new ListNode(-1);
         ListNode more = new ListNode(-1);

        ListNode temp =head;
        
        ListNode kam=less, jaada = more;
        
        while(temp!=null)
        {
            if(temp.val<x)
            {
                kam.next = new ListNode(temp.val);
                kam= kam.next;
            }
            else
            {
            jaada.next = new ListNode(temp.val);
                jaada= jaada.next;
            }
            
            temp= temp.next;
        }
        
        less= less.next;
        more = more.next;
        
        if(less==null)
            return more;
        if(more==null)
            return less;
        
        kam.next = more;
        return less;
    }
}
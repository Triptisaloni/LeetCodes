/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode p = head;
        
        
        if(p!=null && p.next==null)
            return null;
        
        HashSet<ListNode> map = new HashSet<>();
        
        
        while(p!=null)
        {
            if(map.contains(p))
                return p;
            
            else
                map.add(p);
            
            p=p.next;
        }
        
        return null;
    }
}
import java.util.*;
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
    public ListNode sortList(ListNode head) {
        
        if(head==null)
            return head;
        
        ListNode ptr = head;
        
        ArrayList<Integer> store = new ArrayList<>();
        
        while(ptr!=null)
        {
            store.add(ptr.val);
            ptr=ptr.next;
        }
        
        Collections.sort(store);
        
        ListNode res = new ListNode(store.get(0));
        // res = 
        ListNode temp = res;
        for(int i=1; i<store.size(); i++)
        {
            temp.next = new ListNode(store.get(i));
            temp = temp.next;
        }
        
        return res;
    }
}
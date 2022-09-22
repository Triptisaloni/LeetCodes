/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode nex = node.next;
        
        //swap data
        int temp = node.val;
        node.val = nex.val;
        nex.val = temp;
        
        node.next = node.next.next;
    }
}
import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        
        //Hashing
        HashSet<ListNode> map = new HashSet<>();
        
        while(headA!=null)
        {
            map.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if (map.contains(headB))
                return headB;
            
            headB=headB.next;
        }
        
        return null;
        
/*        2 pointers
        
        if(headA==null ||headB==null)
            return null;
        
        ListNode ptr1=headA, ptr2 = headB;
        
        while(ptr1!=ptr2)
        {
            ptr1= ptr1.next;
            ptr2 = ptr2.next;
            
            if(ptr1==ptr2)
                return ptr1;
            
            if(ptr1==null)
            ptr1=headB;
            
            if(ptr2==null)
                ptr2= headA;
        }
        
        return ptr1;*/
}}
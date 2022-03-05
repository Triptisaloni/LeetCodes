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
    public ListNode add(ListNode l1, ListNode l2,int carry)
    {
         if(l1==null && l2==null)
         {
                if(carry>0)
                {ListNode temp= new ListNode(carry);
             return temp;}
         }
        
        
        if(l1==null && l2!=null)
        {
            int data = l2.val+carry;
              ListNode temp= new ListNode(data%10);
            carry = data/10;
            temp.next= add(l1, l2.next, carry);
            return temp;
        }    
        if(l2==null && l1!=null)
        {
            int data = l1.val+carry;
              ListNode temp= new ListNode(data%10);
            carry = data/10;
            temp.next= add(l1.next, l2, carry);
            return temp;
        }
        
        if(l1!=null && l2!=null)
        {int s =l1.val+l2.val+carry;
        int data = s%10;
        if(s/10<1)
            carry =0;
        else
            carry = s/10;
        
        ListNode sum = new ListNode(data);
        sum.next= add(l1.next, l2.next, carry);
        
        return sum;}
        
        return null;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if (l1==null)
            return l2;
        if(l2==null)
            return l1;
        
        return add(l1, l2, 0);
    }
}
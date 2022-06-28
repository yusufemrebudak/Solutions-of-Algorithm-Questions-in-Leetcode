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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode  newNode = new ListNode(0);
        ListNode cur = newNode;
        while(l1 != null || l2 != null || carry != 0){  
            sum = 0;
            if(l1 == null) sum += 0;
            else sum += l1.val;
            if(l2 == null) sum += 0;
            else sum += l2.val;
            sum += carry;
            
            newNode.val = sum % 10;
            carry = sum / 10;
            
            if(l1 == null) l1 = l1;
            else l1 = l1.next;
            if (l2 == null ) l2 = l2;
            else l2 = l2.next;
            
            if(l1 != null || l2 != null || carry != 0){
                newNode.next = new ListNode();
                newNode = newNode.next;
            }
            
        }  
        newNode = null;
    return cur;        
    }
}
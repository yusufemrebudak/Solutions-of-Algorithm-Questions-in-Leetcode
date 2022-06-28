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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = Length(headA);  
        int lengthB = Length(headB);
        int i = 0;
        while(lengthA > lengthB){
            headA = headA.next;
            lengthA--;
        }
        while(lengthB > lengthA){
            headB = headB.next;
            lengthB--;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    private int Length(ListNode node){
        int length = 0;
        while(node != null){
            node = node.next;
            length++;
        }
        return length;
    }
           
}
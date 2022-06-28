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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = Length(head);
        ListNode temp1 = head;
        ListNode temp2 = head;
        if(length - n == 0) {
            head = head.next;
            return head;
        }
        else if ( (length - n) == (length - 1) ){
            for(int i = 0 ; i < length - 2 ; i++) temp1 = temp1.next;
            temp1.next = null;
            return head;
        }
        else {
            for(int i = 0 ; i < length-n-1  ; i++) temp1 = temp1.next;
            for(int i = 0 ; i < length-n+1  ; i++) temp2 = temp2.next;
            temp1.next = temp2;
            return head;
        }
        
    }

    private int Length(ListNode head){
        int i = 0 ;
        while(head != null){
            i++;
            head = head.next;
        }    
    return i ;
    }  
}
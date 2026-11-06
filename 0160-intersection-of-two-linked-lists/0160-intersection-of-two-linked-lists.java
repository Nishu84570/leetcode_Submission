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

        ListNode start1 = headA;
        ListNode start2 = headB;

        if(start1 == start2){
            return start1;
        }

        while(start1 != start2){
            start1 = start1.next;
            start2 = start2.next;

            if(start1 == null && start2 != null){
                start1 = headB;
            }

            if(start2 == null && start1 != null){
                start2 = headA;
            }
        }

        return start1;
    }
}
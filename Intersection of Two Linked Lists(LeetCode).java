public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != currB) {
            currA = (currA != null) ? currA.next : headB;
            currB = (currB != null) ? currB.next : headA;
        }
        return currA;
    }
}

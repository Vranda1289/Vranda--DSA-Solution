class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {

        head = reverse(head);

        ListNode curr = head;
        ListNode prev = null;
        int carry = 0;

        while (curr != null) {

            int sum = curr.val * 2 + carry;

            curr.val = sum % 10;
            carry = sum / 10;

            prev = curr;
            curr = curr.next;
        }

        if (carry != 0) {
            prev.next = new ListNode(carry);
        }

        head = reverse(head);

        return head;
    }
}
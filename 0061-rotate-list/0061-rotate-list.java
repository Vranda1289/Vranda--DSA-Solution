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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;

        ArrayList<Integer> list=new ArrayList<>();

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        Collections.rotate(list,k);
        temp=head;
        int n=list.size();
        for(int i=0; i<n; i++){
            temp.val=list.get(i);
            temp=temp.next;
        }
        return head;
    }
}
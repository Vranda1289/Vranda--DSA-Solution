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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                list1.add(temp.val);
            }
            else{
                list2.add(temp.val);
            }
            temp=temp.next;
        }

        ListNode dummy=new ListNode(0);
        ListNode temp1=dummy;
        for(int a:list1){
            temp1.next=new ListNode(a);
            temp1=temp1.next;
        }
        for(int a:list2){
            temp1.next=new ListNode(a);
            temp1=temp1.next;
        }
        return dummy.next;
    }
}
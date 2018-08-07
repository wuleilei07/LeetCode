public class Solution_203 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode removeElements(ListNode head, int val, int depth) {
/**
 while(head!=null && head.val==val){
 head=head.next;
 }
 if(head==null) {
 return null;
 }
 else{
 ListNode prev=head;
 while(prev.next!=null){
 if(prev.next.val==val){
 prev.next=prev.next.next;
 }
 else{
 prev=prev.next;
 }
 }
 }
 return head;
 }
 }
 */
/**
 ListNode dummyHead=new ListNode(0);
 dummyHead.next=head;
 ListNode prev=dummyHead;
 while(prev.next != null){
 if(prev.next.val==val){
 prev.next=prev.next.next;
 }
 else {
 prev=prev.next;
 }
 }
 return dummyHead.next;
 */
        if (head == null) return null;
        head.next = removeElements(head.next, val, depth + 1);
        return head.val == val ? head.next : head;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        Solution_203 solution203 = new Solution_203();
        solution203.removeElements(head, 6, 0);
        System.out.println(head);
    }
}

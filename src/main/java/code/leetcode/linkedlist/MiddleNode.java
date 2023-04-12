package code.leetcode.linkedlist;

public class MiddleNode {
    public static void main(String[] args) {
        ListNode head1;

        head1 =new ListNode(1,new ListNode(2));
        ListNode.printList(head1);
        System.out.println("middleNode:"+middleNode(head1).toString());

        head1 =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        ListNode.printList(head1);
        System.out.println("middleNode:"+middleNode(head1).toString());

        head1 =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode.printList(head1);
        System.out.println("middleNode:"+middleNode(head1).toString());
    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

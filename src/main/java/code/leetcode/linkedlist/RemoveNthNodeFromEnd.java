package code.leetcode.linkedlist;

import java.util.Stack;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head1;

        head1 =new ListNode(1,new ListNode(2));
        ListNode.printList(head1);
        System.out.println("------after deleting node from List-----");
        ListNode.printList(removeNthFromEnd(head1,2));


       /* head1 =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode.printList(head1);
        System.out.println("------after deleting node from List-----");
        ListNode.printList(removeNthFromEnd(head1,2));*/
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||(head.next==null)){
            return null;
        }
        ListNode left=head,right = head;
        for(int index=1;index<=n+1;index++){
            if(right==null){
                return head=head.next;
            }
            right=right.next;
        }
        while(right!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;
        return head;
    }
    public static ListNode removeNthFromEndInEfficient(ListNode head, int n) {
        if(head==null){
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode traverse = head;
        while(traverse!=null) {
            stack.push(traverse);
            traverse = traverse.next;
        }
        ListNode nodeToBeDeleted = null;

        for (int index=1;index<=n;index++){
            if(!stack.isEmpty()){
                nodeToBeDeleted = stack.pop();
            }else {
                return head;
            }
        }
        if(head==nodeToBeDeleted){
            head = head.next;
            return head;
        }
        /*if (head.next == nodeToBeDeleted && head.next == null) {
            head.next = null;
            return head;
        }*/
        ListNode prev = head, curr = head.next, next = curr.next;
        while (curr!=nodeToBeDeleted){
            prev=prev.next;
            curr=curr.next;
            next=next.next;
        }

        prev.next=next;

        return head;

    }
}

package code.leetcode.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head1;

        head1 =new ListNode(1,new ListNode(2));
        ListNode.printList(head1);
        System.out.println("------reversed List-----");
        ListNode.printList(reverseList(head1));

        head1 =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        ListNode.printList(head1);
        System.out.println("------reversed List-----");
        ListNode.printList(reverseList(head1));


    }
    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null) {//only one element reverse would be the same
            return head;
        }
        if(head.next.next==null){//only 2 elements in the list
            head.next.next=head;
            head=head.next;
            head.next.next=null;
            return head;
        }
        //if more than 2 elements are there in the list

        ListNode previous=head;
        ListNode curr = head.next;
        ListNode next = head.next.next;
        while(next!=null){
            curr.next=previous;
            previous=curr;
            curr=next;
            next=next.next;
        }
        curr.next=previous;
        head.next=null;
        head=curr;
        return head;
    }
}

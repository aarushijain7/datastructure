package code.leetcode.linkedlist;

public class ReorderList {
    public static void main(String[] args) {
        ListNode head1;

        head1 =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode.printList(head1);
        System.out.println("------reversed List-----");
        reorderList(head1);
        ListNode.printList(head1);


        head1 =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        ListNode.printList(head1);
        System.out.println("------reversed List-----");
        reorderList(head1);
        ListNode.printList(head1);
    }
    public static void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode l2 = reverseList(mid);
        ListNode temp = head.next;
        ListNode prevMid = head;
        while (temp!=mid){
            temp=temp.next;
            prevMid = prevMid.next;
        }
        prevMid.next=null;


        ListNode l1 = head,l1Next = l1.next;
        ListNode l2Next = l2.next;
        while(l1Next!=null && l2Next!=null){
            l1.next = l2;
            l2.next = l1Next;

            l1=l1Next;l1Next=l1Next.next;
            l2=l2Next;l2Next=l2Next.next;
        }
        l1.next=l2;
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

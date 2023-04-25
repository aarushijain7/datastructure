package code.leetcode.linkedlist;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head1,node2,node4;
        head1 =new ListNode(1,new ListNode(2));
        ListNode.printList(head1);
        System.out.println("detectcycle:"+hasCycle(head1));

        node2 = new ListNode(2,new ListNode(-1));
        node4 = new ListNode(4,node2);
        head1 =new ListNode(1,node2);
        head1.next.next.next=new ListNode(3,node4);
        System.out.println("detectcycle:"+hasCycle(head1));

        node2 = new ListNode(2);
        node4 = new ListNode(4,node2);
        head1 =new ListNode(1,node2);
        head1.next.next=new ListNode(3,node4);
        //ListNode.printList(head1);
        System.out.println("detectcycle:"+hasCycle(head1));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        boolean doesCycleExist =false;
        while((fast!=null&&fast.next!=null) ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                doesCycleExist = true;
                break;
            }
        }
        return doesCycleExist;
    }
}

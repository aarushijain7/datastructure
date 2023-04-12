package code.leetcode.linkedlist;

public class Merge2SortedLinkedList {
    public static void main(String[] args) {
        ListNode head1, head2;

        head1 =new ListNode(5);
        ListNode.printList(head1);
        head2 =new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode.printList(head2);
        System.out.println("------merged List-----");
        ListNode.printList(mergeTwoLists(head1,head2));

        head1 =new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode.printList(head1);
        head2 =new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode.printList(head2);
        System.out.println("------merged List-----");
        ListNode.printList(mergeTwoLists(head1,head2));
    }
    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode mergedHead =null;
        if(head1.val<= head2.val){
            mergedHead = head1;
            head1=head1.next;
        }else{
            mergedHead = head2;
            head2=head2.next;
        }
        ListNode lastIndex=mergedHead;
        while(head1 !=null && head2 != null){
            if(head1.val <= head2.val){
                lastIndex.next=head1;
                lastIndex=head1;
                head1=head1.next;
            }else{
                lastIndex.next=head2;
                lastIndex=head2;
                head2=head2.next;
            }
        }
        if(head1==null && head2!=null){
            lastIndex.next=head2;
        }
        if(head2==null && head1!=null){
            lastIndex.next=head1;
        }

        return mergedHead;
    }
}

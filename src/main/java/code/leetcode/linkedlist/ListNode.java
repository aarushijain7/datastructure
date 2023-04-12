package code.leetcode.linkedlist;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void printList(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+"--->");
            temp=temp.next;
        }
        System.out.print("Null\n");
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

package linkedlist;

//Given a singly linked list, find the middle of the linked list.
// For example, if the given linked list is 1->2->3->4->5 then the output should be 3.
//If there are even nodes, then there would be two middle nodes,
// we need to print the second middle element. For example, if the given
// linked list is 1->2->3->4->5->6 then the output should be 4.

public class FindMiddleElementMain {
    public static void main(String[] args) {
        LinkedList list1= new LinkedList();
        list1.add(5);
        list1.add(6);
        list1.add(3);
        LinkedList.printList(list1.getHead());
        LinkedListNode middleElement1 = list1.getMiddleElement();
        System.out.println("Middle element "+middleElement1.getValue());

        LinkedList list2= new LinkedList();
        list2.add(5);
        list2.add(6);
        list2.add(3);
        list2.add(4);
        LinkedList.printList(list2.getHead());
        LinkedListNode middleElement2 = list2.getMiddleElement();
        System.out.println("Middle element "+middleElement2.getValue());
    }
}

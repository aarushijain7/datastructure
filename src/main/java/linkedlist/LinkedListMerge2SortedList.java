package linkedlist;

public class LinkedListMerge2SortedList {
    public static void main(String[] args) {

        System.out.println("\n----------merging 2 list ---------");
        LinkedList list1 = new LinkedList();

        list1.add(1);
        list1.add(5);
        list1.add(200);
        list1.add(300);

        LinkedList.printList(list1.getHead());

        LinkedList list2 = new LinkedList();

        list2.add(3);
        list2.add(10);
        list2.add(150);

        LinkedList.printList(list2.getHead());

        LinkedList.printList(LinkedList.mergeTwoSortedList(list1.getHead(),list2.getHead()));
    }
}

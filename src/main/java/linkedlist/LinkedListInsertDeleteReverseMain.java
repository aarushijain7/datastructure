package linkedlist;

public class LinkedListInsertDeleteReverseMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList.printList(list.getHead());
        System.out.println("\n----------Reverse Of the lIst----------");
        list.reverse();
        System.out.println("\n----------delete 3 from the lIst----------");
        list.delete(3);
        LinkedList.printList(list.getHead());


    }
}

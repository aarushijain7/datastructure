package linkedlist;

import sun.awt.image.ImageWatched;

//Given two numbers represented by two lists, write a function that returns the sum list. The sum list is a list representation of the addition of two input numbers.
//
//Example:
//
//Input:
//List1: 5->6->3 // represents number 563
//List2: 8->4->2 // represents number 842
//Output:
//Resultant list: 1->4->0->5 // represents number 1405
public class AddTwoNumLinkedListMain {
    public static void main(String[] args) {

        LinkedList list1= new LinkedList();
        list1.add(5);
        list1.add(6);
        list1.add(3);
        LinkedList.printList(list1.getHead());

        LinkedList list2= new LinkedList();
        list2.add(9);
        list2.add(8);
        list2.add(4);
        list2.add(2);
        LinkedList.printList(list2.getHead());

        LinkedList sum = LinkedList.add(list1,list2);
        LinkedList.printList(sum.getHead());

    }
}

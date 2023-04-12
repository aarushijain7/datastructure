package linkedlist;


public class LinkedList {

    LinkedListNode head;

    public LinkedListNode getHead() {
        return head;
    }




    public void add(int value) {
        LinkedListNode newNode = new LinkedListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        LinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int size(){
        if(head==null){
            return 0;
        }
        LinkedListNode temp = head;
        int sizeCounter=0;
        while(temp!=null){
            sizeCounter++;
            temp=temp.next;
        }
        return sizeCounter;
    }
    public static void printList(LinkedListNode head) {
        if (head == null) {
            System.out.println("No elements in the list");
            return;
        }
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    // reverse a linked list using 3 pointers -> prev,current,next
    public void reverse() {
        if (head == null) {
            System.out.println("No elements in the list");
            return;
        }
        if (head.next == null) {
            System.out.println("Only one element exists in the list\nReversed list will be the same ");
            printList(head);
            return;
        }
        LinkedListNode previousNode = head;
        LinkedListNode currentNode = head.next;
        LinkedListNode nextNode = head.next.next;

        while (currentNode.next != null) {
            currentNode.next = previousNode;

            //changing the pointing
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        head.next = null;
        head = currentNode;
        currentNode.next = previousNode;
    }

    public boolean delete(int valueToBeDeleted) {
        if (head == null) {
            System.out.println("No elements in the list");
            return false;
        }
        //checking for the first node
        if (head.value == valueToBeDeleted) {
            head = head.next;
            return true;
        }

        LinkedListNode temp = head.next;
        LinkedListNode prev = head;
        while (temp != null) {
            if (temp.value == valueToBeDeleted) {
                prev.next = temp.next;
                temp.next = null;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }
        return false;
    }

    //merge 2 sorted linked list
    public static LinkedListNode mergeTwoSortedList(LinkedListNode head1,LinkedListNode head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }

        LinkedListNode mergedHead =null;
        if(head1.value< head2.value){
            mergedHead = head1;
        }else{
            mergedHead = head2;
        }
        while(head1 !=null && head2 != null){
            if(head1.value <= head2.value){
                LinkedListNode temp = head1.next;
                head1.next = head2;
                head1 = temp;
            }else{
                LinkedListNode temp = head2.next;
                head2.next = head1;
                head2 = temp;
            }
        }
        return mergedHead;
    }

    public static LinkedList add(LinkedList list1, LinkedList list2) {
        list1.reverse();
        list2.reverse();
        int size1 = list1.size();
        int size2 = list2.size();
        if(size1<size2){
            int diff = size2-size1;
            for (int i =1;i<=diff;i++){
                list1.add(0);
            }
        }
        if(size2<size1){
            int diff = size1-size2;
            for (int i =1;i<=diff;i++){
                list2.add(0);
            }
        }
        LinkedList sum = new LinkedList();
        LinkedListNode curr1=list1.getHead();
        LinkedListNode curr2 = list2.getHead();
        int carryForward = 0;
        while(curr1!=null && curr2!=null){
            int val = curr1.value+ curr2.value+carryForward;
            if(val<=9){
                carryForward = 0;
            }else{
                val = val %10;
                carryForward = 1;
            }
            sum.add(val);
            curr1= curr1.next;
            curr2 = curr2.next;
        }
        if(carryForward==1){
            sum.add(1);
        }
        sum.reverse();
        return sum;
    }

    public LinkedListNode getMiddleElement() {
        if(head==null){
            return new LinkedListNode(-1);
        }
        LinkedListNode slowPointer=head;
        LinkedListNode fastPointer = head;
        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
            return slowPointer;
    }
}
class LinkedListNode {
    int value;
    LinkedListNode next;

    public int getValue() {
        return value;
    }

    public LinkedListNode(int value) {
        this.value = value;
    }

    public LinkedListNode() {
    }
}
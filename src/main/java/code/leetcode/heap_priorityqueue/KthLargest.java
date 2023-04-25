package code.leetcode.heap_priorityqueue;

import java.util.PriorityQueue;

/*
* Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order,
* not the kth distinct element.

Implement KthLargest class:

KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.
*
* Input
["KthLargest", "add", "add", "add", "add", "add"]
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
Output
[null, 4, 5, 5, 8, 8]

Explanation
KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
kthLargest.add(3);   // return 4
kthLargest.add(5);   // return 5
kthLargest.add(10);  // return 5
kthLargest.add(9);   // return 8
kthLargest.add(4);   // return 8
*
*
* We can implement this using a Min heap of K values -
* The PriorityQueue is based on the priority heap.
*  The elements of the priority queue are ordered according to the natural ordering,
* or by a Comparator provided at queue construction time, depending on which constructor is used.
*It provides O(log(n)) time for add and poll methods
* always maintain a min heap with K elements after adding we can remove the min element and add another.
* */
class KthLargest {

    PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        for (int num:nums){
            this.add(num);
        }
    }

    public int add(int val) {
        if(heap.size()<this.k){
            heap.offer(val);
        }
        else if (val>heap.peek()){
            heap.poll();
            heap.add(val);
        }

        return heap.peek();
    }
}

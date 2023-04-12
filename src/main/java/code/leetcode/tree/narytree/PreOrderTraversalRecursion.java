package code.leetcode.tree.narytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreOrderTraversalRecursion {
    public static void main(String[] args) {

        Node node1=new Node(1,Arrays.asList(new Node(3, Arrays.asList(new Node(5)
                                                                                ,new Node(6))),
                new Node(2),
                new Node(4)));

        List<Integer> output =preorder(node1);
        output.stream().forEach(System.out::println);
    }
    public static List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if(root!=null){
            preorderRecursive(root,output);
        }
        return output;
    }
    public static void preorderRecursive(Node root,List<Integer> output) {
        output.add(root.val);
        if(root.children!=null){
            for (Node childNode:root.children){
                preorderRecursive(childNode,output);
            }
        }
    }
}

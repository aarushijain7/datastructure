package code.leetcode.tree.narytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    public static void main(String[] args) {
        Node node1 = new Node(1, Arrays.asList(new Node(3, Arrays.asList(new Node(5)
                        , new Node(6))),
                new Node(2),
                new Node(4)));

        List<Integer> output = preorder(node1);
        output.stream().forEach(System.out::println);
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node poppedNode = stack.pop();
            output.add(poppedNode.val);
            if (poppedNode.children != null) {
                for(int index = poppedNode.children.size()-1;index>=0;index--){
                    stack.push(poppedNode.children.get(index));
                }
            }
        }
        return output;
    }
}
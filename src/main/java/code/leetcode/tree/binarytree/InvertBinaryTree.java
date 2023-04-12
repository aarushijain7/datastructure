package code.leetcode.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(4,
                new TreeNode(2,new TreeNode(1),new TreeNode(3)),
                new TreeNode(7,new TreeNode(6),new TreeNode(9)));
        invertTree(root);

    }
    public static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode tempNode = node.left;
            node.left=node.right;
            node.right=tempNode;
            if(node.right!=null)
                queue.add(node.right);
            if(node.left!=null)
                queue.add(node.left);
        }
        return root;
    }
}

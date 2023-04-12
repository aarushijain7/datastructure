package code.leetcode.tree.binarytree;

public class MaxHeightBinaryTree {
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(3,new TreeNode(9),
                new TreeNode(20,new TreeNode(15),new TreeNode(7,new TreeNode(10),null)));

        System.out.println(maxDepth(root));


    }
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHeight = maxDepth(root.left)+1;
        int rightHeight = maxDepth(root.right)+1;
        return Math.max(leftHeight,rightHeight);


    }
}

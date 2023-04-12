package code.leetcode.tree.binarytree;

import java.util.*;

public class LevelOrderTraversal {
    public static void main(String[] args) {

        TreeNode root  = new TreeNode(3,new TreeNode(9),
                new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        List<List<Integer>> output = levelOrder(root);
        output.stream().flatMap(list->list.stream()).forEach(System.out::println);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root==null){
            return  output;
        }
        List<TreeNode> parentTreeNodeList = new LinkedList<>();
        parentTreeNodeList.add(root);
        while(!parentTreeNodeList.isEmpty()){
            List<Integer> parentIntList = new ArrayList<>();
            List<TreeNode> children = new LinkedList<>();
            for (TreeNode node:parentTreeNodeList){
                parentIntList.add(node.val);
                if(node.left!=null){
                    children.add(node.left);
                }
                if(node.right!=null){
                    children.add(node.right);
                }
            }
            output.add(parentIntList);
            parentTreeNodeList=children;
        }
        return output;
    }
}

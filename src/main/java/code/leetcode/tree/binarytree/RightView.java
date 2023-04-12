package code.leetcode.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(3,new TreeNode(9),
                new TreeNode(20,new TreeNode(15),new TreeNode(7,new TreeNode(10),null)));
        List<Integer> list= rightSideView(root);
        list.stream().forEach(System.out::println);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int queueLen= queue.size();
            TreeNode rightmostNode = null;
            for (int index = 1; index<=queueLen;index++){
                TreeNode node=queue.remove();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                if(index==queueLen){
                    rightmostNode=node;
                }
            }
            res.add(rightmostNode.val);
        }




        return res;
    }
}

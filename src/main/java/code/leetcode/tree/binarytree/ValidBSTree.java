package code.leetcode.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class ValidBSTree {
    public static void main(String[] args) {

        TreeNode root=null;

        root  =new TreeNode(0,new TreeNode(-2147483647),new TreeNode(2147483647));
        System.out.println("true:"+isValidBST(root));

        root  =new TreeNode(2147483647,new TreeNode(-2147483647),null);
        System.out.println("true:"+isValidBST(root));

        root  =new TreeNode(-2147483647,null,new TreeNode(2147483647));
        System.out.println("true:"+isValidBST(root));

        root  =new TreeNode(3,new TreeNode(1,new TreeNode(0),new TreeNode(2,null,new TreeNode(3))),new TreeNode(5));
        System.out.println("false:"+isValidBST(root));

        root  =new TreeNode(2,new TreeNode(1),new TreeNode(3));
        System.out.println("true:"+isValidBST(root));

        root  =new TreeNode(2147483647);
        System.out.println("true:"+isValidBST(root));

        root  =new TreeNode(5,new TreeNode(4),new TreeNode(6,new TreeNode(3),new TreeNode(7)));
        System.out.println("false:"+isValidBST(root));

        root  =new TreeNode(2,new TreeNode(2),new TreeNode(2));
        System.out.println("false:"+isValidBST(root));

        root  =new TreeNode(2147483647,new TreeNode(2147483647),null);
        System.out.println("false:"+isValidBST(root));

        root  =new TreeNode(0);
        System.out.println("true:"+isValidBST(root));

    }

    public static boolean isValidBST(TreeNode root) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        return  isValidBSTRecursion(root, Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public static boolean isValidBSTRecursion(TreeNode node, long max, long min) {

        if((node.val<=max) && (node.val>=min)){
            boolean isLeftValid = true,isRightValid = true;
            if(node.left!=null){
                if(node.val<=node.left.val){
                    return false;
                }
                isLeftValid = isValidBSTRecursion(node.left,node.val-1,min);
            }
            if(node.right!=null){
                if(node.val>=node.right.val){
                    return false;
                }
                isRightValid = isValidBSTRecursion(node.right,max,node.val+1);
            }

            return isLeftValid&&isRightValid;
        }
        return false;
    }
}


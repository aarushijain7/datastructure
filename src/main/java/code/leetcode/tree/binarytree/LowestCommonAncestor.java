package code.leetcode.tree.binarytree;

public class LowestCommonAncestor {
    public static void main(String[] args) {


    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null){
            return null;
        }
        TreeNode temp=root;
        while(!(temp==p || temp==q)){
            if(temp.val<p.val&& temp.val<q.val){
                temp=temp.right;
            }
            else if(temp.val>p.val && temp.val>q.val){
                temp=temp.left;
            }
            else{
                return temp;
            }
        }
        return temp;
    }
}

import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){this.val=val;}
}
public class Q74{
    public static void preorder(TreeNode root,List<Integer> res){
        if(root==null) return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        System.out.println(preorderTraversal(root));
    }
}
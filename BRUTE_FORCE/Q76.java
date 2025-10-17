import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){this.val=val;}
}
public class Q76{
    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode node=stack1.pop();
            stack2.push(node);
            if(node.left!=null) stack1.push(node.left);
            if(node.right!=null) stack1.push(node.right);
        }
        while(!stack2.isEmpty()) res.add(stack2.pop().val);
        return res;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        System.out.println(postorderTraversal(root));
    }
}

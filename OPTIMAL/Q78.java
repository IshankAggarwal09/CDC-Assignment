import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){this.val=val;}
}
public class Q78{
    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.add(root);
        int depth=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            depth++;
        }
        return depth;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(maxDepth(root));
    }
}
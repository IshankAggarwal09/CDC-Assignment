import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){this.val=val;}
}
public class Q83{
    public static List<Integer> rightSideView(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(i==size-1)res.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(4);
        System.out.println(rightSideView(root)); // [1,3,4]
    }
}
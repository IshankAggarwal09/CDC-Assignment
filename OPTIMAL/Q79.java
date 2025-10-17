import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){this.val=val;}
}
public class Q79{
    public static boolean isSameTree(TreeNode p,TreeNode q){
        LinkedList<TreeNode> q1=new LinkedList<>();
        LinkedList<TreeNode> q2=new LinkedList<>();
        q1.add(p); q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode n1=q1.poll(), n2=q2.poll();
            if(n1==null && n2==null) continue;
            if(n1==null || n2==null || n1.val!=n2.val) return false;
            q1.add(n1.left); q1.add(n1.right);
            q2.add(n2.left); q2.add(n2.right);
        }
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void main(String[] args){
        TreeNode p=new TreeNode(1);
        p.left=new TreeNode(2);
        p.right=new TreeNode(3);
        TreeNode q=new TreeNode(1);
        q.left=new TreeNode(2);
        q.right=new TreeNode(3);
        System.out.println(isSameTree(p,q));
    }
}
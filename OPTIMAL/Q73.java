import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){this.val=val;}
}
public class Q73{
    public static TreeNode createBinaryTree(int[][] desc){
        Map<Integer,TreeNode> map=new HashMap<>();
        Set<Integer> children=new HashSet<>();
        for(int[] d:desc){
            map.putIfAbsent(d[0],new TreeNode(d[0]));
            map.putIfAbsent(d[1],new TreeNode(d[1]));
            if(d[2]==1) map.get(d[0]).left=map.get(d[1]);
            else map.get(d[0]).right=map.get(d[1]);
            children.add(d[1]);
        }
        for(int node:map.keySet()){
            if(!children.contains(node)) return map.get(node);
        }
        return null;
    }
    public static void main(String[] args){
        int[][] desc={{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        TreeNode root=createBinaryTree(desc);
        System.out.println(root.val);
    }
}
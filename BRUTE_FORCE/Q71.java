public class Q71{
    public static boolean search(int[] nums,int target){
        for(int n:nums){
            if(n==target) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
}
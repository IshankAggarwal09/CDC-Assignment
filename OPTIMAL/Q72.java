import java.util.Arrays;
public class Q72{
    public static boolean canPlace(int[] stalls,int k,int dist){
        int count=1,last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                count++;
                last=stalls[i];
            }
            if(count>=k) return true;
        }
        return false;
    }
    public static int maxMinDistance(int[] stalls,int k){
        Arrays.sort(stalls);
        int low=1,high=stalls[stalls.length-1]-stalls[0];
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlace(stalls,k,mid)){
                result=mid;
                low=mid+1;
            } else high=mid-1;
        }
        return result;
    }
    public static void main(String[] args){
        int[] stalls={1,2,4,8,9};
        int k=3;
        System.out.println(maxMinDistance(stalls,k));
    }
}
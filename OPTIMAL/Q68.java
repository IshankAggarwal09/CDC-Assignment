public class Q68{
    public static int minEatingSpeed(int[] piles,int h){
        int low=1,high=0;
        for(int p:piles) high=Math.max(high,p);
        while(low<high){
            int mid=low+(high-low)/2;
            int hours=0;
            for(int p:piles) hours+=(p+mid-1)/mid;
            if(hours>h) low=mid+1;
            else high=mid;
        }
        return low;
    }
    public static void main(String[] args){
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
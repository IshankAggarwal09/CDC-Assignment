public class Q68{
    public static int minEatingSpeed(int[] piles,int h){
        int max=0;
        for(int p:piles) max=Math.max(max,p);
        for(int k=1;k<=max;k++){
            int hours=0;
            for(int p:piles) hours+=(p+k-1)/k;
            if(hours<=h) return k;
        }
        return max;
    }
    public static void main(String[] args){
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
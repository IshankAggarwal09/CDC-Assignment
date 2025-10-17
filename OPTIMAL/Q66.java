public class Q66{
    public static int lowerBound(int[] arr,int target){
        int low=0,high=arr.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target) low=mid+1;
            else high=mid;
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr={2,3,7,10,11,11,25};
        int target=9;
        System.out.println(lowerBound(arr,target));
    }
}
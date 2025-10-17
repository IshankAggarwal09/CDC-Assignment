public class Q67{
    public static int upperBound(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target) return i;
        }
        return arr.length;
    }
    public static void main(String[] args){
        int[] arr={2,3,7,10,11,11,25};
        int target=11;
        System.out.println(upperBound(arr,target));
    }
}
public class Q69{
    static int badVersion;
    public static boolean isBadVersion(int version){
        return version>=badVersion;
    }
    public static int firstBadVersion(int n){
        int low=1,high=n;
        while(low<high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)) high=mid;
            else low=mid+1;
        }
        return low;
    }
    public static void main(String[] args){
        int n=5;
        badVersion=4;
        System.out.println(firstBadVersion(n));
    }
}
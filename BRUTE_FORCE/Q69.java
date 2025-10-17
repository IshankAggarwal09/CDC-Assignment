public class Q69{
    static int badVersion;
    public static boolean isBadVersion(int version){
        return version>=badVersion;
    }
    public static int firstBadVersion(int n){
        for(int i=1;i<=n;i++){
            if(isBadVersion(i)) return i;
        }
        return n;
    }
    public static void main(String[] args){
        int n=5;
        badVersion=4;
        System.out.println(firstBadVersion(n));
    }
}

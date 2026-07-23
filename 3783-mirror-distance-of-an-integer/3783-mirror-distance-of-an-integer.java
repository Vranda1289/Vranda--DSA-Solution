class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int temp=n;
        while(temp>0){
            int dig=temp%10;
            rev=rev*10+dig;
            temp/=10;
        }
        return Math.abs(rev-n);
    }
}
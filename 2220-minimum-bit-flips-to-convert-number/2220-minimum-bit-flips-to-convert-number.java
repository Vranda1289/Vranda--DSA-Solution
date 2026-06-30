class Solution {
    public int minBitFlips(int start, int goal) {
       int x=start^goal;
      int count=0;
        int res=start^goal;
        while(res!=0){
        res=res&(res-1);
        count++;
        }
        return count;
    }
}
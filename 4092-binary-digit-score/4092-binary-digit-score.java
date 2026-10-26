class Solution {
    public int calculateScore(int a, int b) {
    int count1=0;
        int count2=0;
        while(a>0){
            count1+=a&1;
            a=a>>1;
        }
        while(b>0){
            count2+=b&1;
            b=b>>1;
        }
        if(count1>=count2){
            return count1*count2;
        }
        return count2/count1;
    }
}
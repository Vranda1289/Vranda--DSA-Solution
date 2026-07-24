class Solution {
    public int minElement(int[] nums) {
        int x=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<x; i++){
            int digsum=sum(nums[i]);
            min=Math.min(digsum,min);
        }
        return min;
        
    }

    public int sum(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            n/=10;
        }
        return sum;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int wsum=0;
        int maxsum=Integer.MIN_VALUE;
        int n=nums.length;

        for(int right=0; right<n; right++){
            wsum+=nums[right];
            if(right-left+1==k){
                maxsum=Math.max(wsum,maxsum);
           
                wsum-=nums[left];
                left++;
            }
        }
        return (double)maxsum/k;
    }
}
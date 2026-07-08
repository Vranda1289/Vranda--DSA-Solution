class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int wsum=0;
        int totalsum=Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++){
            wsum+=nums[right];
            while(wsum>=target){
                totalsum=Math.min(totalsum,right-left+1);
                wsum-=nums[left];
                left++;
            }
        }
        return totalsum == Integer.MAX_VALUE ? 0 : totalsum;
    }
}
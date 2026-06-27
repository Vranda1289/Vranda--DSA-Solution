class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;

        int currsum=nums[0]; 
        int finalsum=nums[0];

        for(int i=1; i<n; i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            finalsum=Math.max(currsum,finalsum);
        }
        return finalsum;
    }
}
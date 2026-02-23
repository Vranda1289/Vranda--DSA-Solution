class Solution {
    public int maxSubArray(int[] nums) {
     int n=nums.length;

     int finalsum=nums[0], currentsum=nums[0];

     for(int i=1; i<n; i++){
        currentsum=Math.max(nums[i],currentsum+nums[i]);
        finalsum=Math.max(currentsum,finalsum);
     }  
     return finalsum; 
    }
}
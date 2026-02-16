class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int currentproduct=nums[0], minproduct=nums[0],finalproduct=nums[0];
        for(int i=1; i<n; i++){
            int temp=currentproduct;
            currentproduct=Math.max(nums[i],Math.max(minproduct*nums[i],currentproduct*nums[i]));
            minproduct=Math.min(nums[i],Math.min(minproduct*nums[i],temp*nums[i]));
            finalproduct=Math.max(finalproduct,currentproduct);
        }
        return finalproduct;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int orig=0;
        for(int i=0; i<n; i++){
            orig+=nums[i];
        }
        return sum-orig;
    }
}
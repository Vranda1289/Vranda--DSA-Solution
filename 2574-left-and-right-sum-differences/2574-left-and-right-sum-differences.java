class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int total=0;
        for(int i=0; i<n; i++){
            total+=nums[i];
        }

        int left=0;

        for(int i=0; i<n; i++){
            int right=total-left-nums[i];

            ans[i]=Math.abs(right-left);

            left+=nums[i];
        }
        return ans;
    }
}
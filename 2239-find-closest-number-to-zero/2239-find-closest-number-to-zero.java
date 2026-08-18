class Solution {
    public int findClosestNumber(int[] nums) {

        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {

            int dif = Math.abs(nums[i]);
            int ansDif = Math.abs(ans);

            if(dif < ansDif) {
                ans = nums[i];
            }

            else if(dif == ansDif) {
                ans = Math.max(ans, nums[i]);
            }
        }

        return ans;
    }
}
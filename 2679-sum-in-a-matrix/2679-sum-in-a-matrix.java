class Solution {
    public int matrixSum(int[][] nums) {

        int m = nums.length;
        int n = nums[0].length;

        // Sort every row
        for(int i = 0; i < m; i++) {
            Arrays.sort(nums[i]);
        }

        int ans = 0;

        // Go column by column
        for(int j = 0; j < n; j++) {

            int max = 0;

            for(int i = 0; i < m; i++) {
                max = Math.max(max, nums[i][j]);
            }

            ans += max;
        }

        return ans;
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;

        long max = Long.MIN_VALUE;
        long secmax = Long.MIN_VALUE;
        long thmax = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (nums[i] == max || nums[i] == secmax || nums[i] == thmax) {
                continue;
            }

            if (nums[i] > max) {
                thmax = secmax;
                secmax = max;
                max = nums[i];
            }
            else if (nums[i] > secmax) {
                thmax = secmax;
                secmax = nums[i];
            }
            else if (nums[i] > thmax) {
                thmax = nums[i];
            }
        }

        
        if (thmax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) thmax;
    }
}

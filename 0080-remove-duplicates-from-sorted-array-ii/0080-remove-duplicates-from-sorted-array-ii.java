class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int rd = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[rd - 2]) {
                nums[rd] = nums[i];
                rd++;
            }
        }
        return rd;
    }
}

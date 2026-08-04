class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {

            int curr = nums[i];
            int next = nums[i + 1];

            while (curr + 1 < next) {
                ans.add(curr + 1);
                curr++;
            }
        }

        return ans;
    }
}
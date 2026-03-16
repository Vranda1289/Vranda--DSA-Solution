class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(set.contains(nums[i])){
                duplicate = nums[i];
            }
            set.add(nums[i]);
        }

        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
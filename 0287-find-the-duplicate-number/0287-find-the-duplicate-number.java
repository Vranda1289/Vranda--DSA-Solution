class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int element=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
                element=nums[i];
            }
        }
        if(count>1){
            return element;
        }
        return 0;
    }
}
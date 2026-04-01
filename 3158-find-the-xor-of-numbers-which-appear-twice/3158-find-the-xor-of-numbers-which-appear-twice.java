class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int xor=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                xor^=nums[i];
            }
        }
        return xor;
    }
}
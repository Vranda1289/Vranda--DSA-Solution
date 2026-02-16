class Solution {

    public int find(int[] nums,int index) {
        if(index==nums.length){
            return 0;
        }
        return nums[index] ^ find(nums,index+1);
    }

    public int singleNumber(int[] nums) {
        return find(nums,0);
    }
}
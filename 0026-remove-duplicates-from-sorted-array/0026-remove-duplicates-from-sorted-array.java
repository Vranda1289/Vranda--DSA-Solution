class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int ilu=0;
        for(int i=1; i<n; i++){
            if(nums[ilu]!=nums[i]){
                 ilu++;
                nums[ilu]=nums[i];
            }
        }
        return ilu+1;
    }
}
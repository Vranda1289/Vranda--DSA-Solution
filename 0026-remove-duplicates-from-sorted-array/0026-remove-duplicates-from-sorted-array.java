class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet <Integer> set= new LinkedHashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int i=0;
        for(int n:set){
            nums[i++]=n;
        }
        return i;
    }
}
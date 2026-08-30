class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int index1=-1;
        int max=Integer.MIN_VALUE;
        int index2=-1;
        int count1=0;
        int count2=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
                index1=i;
            }
            if(nums[i]>max){
                max=nums[i];
                index2=i;
            }
        }
        int left = Math.min(index1, index2);
        int right = Math.max(index1, index2);

        int bothLeft = right + 1;

        int bothRight = nums.length- left;

        int oneLeftOneRight = (left + 1) + (nums.length - right);

        return Math.min(bothLeft,
               Math.min(bothRight, oneLeftOneRight));
    }
}
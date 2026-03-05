class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int sum=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                count++;
            }
            else{
                if(count==1){
                    sum=sum+nums[i-1];
                }
                count=1;
            }
        }
         if(count==1){
                sum=sum+nums[nums.length-1];
            }
        return sum;
    }
}
class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;

        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(nums[j]-nums[i]==k){
                    count++;
                }
            }
        }
        return count;
    }
}
class Solution {
    public int gcd(int i,int j){
        if(j==0){
            return i;
        }
        return gcd(j,i%j);
    }
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[n-1];

        return gcd(small,large);
    }
}
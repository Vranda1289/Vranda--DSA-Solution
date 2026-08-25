class Solution {
    public int missingMultiple(int[] nums, int k) {
        

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        for(int i=1; ; i++){
            int product=1;
            product*=i*k;
            if(!list.contains(product)){
                return product;
            }
        }
    }
}
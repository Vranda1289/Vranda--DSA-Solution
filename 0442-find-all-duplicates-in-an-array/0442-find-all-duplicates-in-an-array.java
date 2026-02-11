class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        Collections.rotate(list,k);

        for(int i=0; i<nums.length; i++){
            nums[i]=list.get(i);
        }
    }
}
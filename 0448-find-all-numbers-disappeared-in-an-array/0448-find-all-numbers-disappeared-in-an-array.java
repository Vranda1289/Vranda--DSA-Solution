class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet <Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(!(set.contains(i))){
                list.add(i);
            }
        }
        return list;
    }
}
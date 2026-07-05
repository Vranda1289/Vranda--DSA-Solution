class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        if(n%2!=0){
            return false;
        }
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int x: map.keySet()){
            int freq=map.get(x);
            if(freq%2!=0){
                return false;
            }
        }
        return true;
    }
}
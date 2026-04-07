class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int x:nums){
            if(map.get(x)==1 && x % 2==0){
                return x;
            }
        }
        return -1;
    }
}
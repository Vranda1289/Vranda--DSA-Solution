class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int x: map.keySet()){
            if(map.get(x)%k==0){
                count += map.get(x)*x;
            }
        }
        return count;
    }
}
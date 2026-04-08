class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int maxfreq=0;
        int sum=0;
        for(int x: map.keySet()){
            int freq=map.get(x);
            if(maxfreq<freq){
                maxfreq=freq;
            }
        }
        for(int x: map.keySet()){
            int freq=map.get(x);
            if(freq == maxfreq){
                sum += freq;
            }
        }
        return sum;
    }
}
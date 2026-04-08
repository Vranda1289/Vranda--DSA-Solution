class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int maxfreq=0;
        int sum=0;
        for(int freq : map.values()){
    if(freq > maxfreq){
        maxfreq = freq;
        sum = freq;   
    }
    else if(freq == maxfreq){
        sum += freq;
    }
}
        return sum;
    }
}
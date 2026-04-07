class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:map.keySet()){
            int freq=map.get(x);

            if(freq<2) continue;

            boolean isPrime=true;
            for(int i = 2; i * i <= freq; i++){
                if(freq % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                return true;
            }
        }
        return false;
    }
}
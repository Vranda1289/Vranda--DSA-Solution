class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int ans[] = new int[nums.length];

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            if(map.get(a) != map.get(b)){
                return map.get(a) - map.get(b);
            }
            return b - a;
        });

        int index = 0;

        for(int x : list){
            int freq = map.get(x);

            for(int i = 0; i < freq; i++){
                ans[index] = x;
                index++;
            }
        }

        return ans;
    }
}
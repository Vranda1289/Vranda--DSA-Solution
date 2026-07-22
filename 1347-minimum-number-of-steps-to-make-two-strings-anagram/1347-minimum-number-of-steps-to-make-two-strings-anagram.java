class Solution {
    public int minSteps(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<>();

       for(char ch: s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(char ch: t.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)-1);
       }

        int ans = 0;

        for (int value : map.values()) {
            if (value > 0) {
                ans += value;
            }
        }

        return ans;
    }
}
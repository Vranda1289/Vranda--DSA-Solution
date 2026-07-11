class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> map=new HashMap<>();

       for(char x:s.toCharArray()){
        map.put(x, map.getOrDefault(x,0)+1);
       }

       int ans=0;
       boolean isOdd=false;
       for(int count:map.values()){
        if(count%2==0){
            ans+=count;
        }
        else{
            ans+=count-1;
            isOdd=true;
        }
       }
       if(isOdd){
       ans++;
       }
       return ans;
    }
}
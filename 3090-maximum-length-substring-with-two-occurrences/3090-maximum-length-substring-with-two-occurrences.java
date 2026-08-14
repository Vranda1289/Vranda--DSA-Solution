class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int right=0;
        int n=s.length();
        int max=0;
        int freq[]=new int[26];

        while(right<n){
            char ch=s.charAt(right);
            freq[ch-'a']++;

            while(freq[ch-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
           int length=right-left+1;
           max=Math.max(length,max);
           right++;
        }
        return max;
    }
}
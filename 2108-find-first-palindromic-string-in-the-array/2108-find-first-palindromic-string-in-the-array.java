class Solution {
    public boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        return s.equals(rev);

    }
    public String firstPalindrome(String[] words) {
        String str="";
        for(String word:words){
            if(isPalindrome(word)){
                str+=word;
                break;
            }
        }
        return str;
    }
}
class Solution {
    public String reversePrefix(String word, char ch) {

        int index=word.indexOf(ch);
        String str="";
        String str2="";
        for(int i=index; i>=0; i--){
            str+=word.charAt(i);
        }
        for(int i=index+1; i<word.length(); i++){
            str2+=word.charAt(i);
        }
        return str+str2;
    }
}
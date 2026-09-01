class Solution {
    public int passwordStrength(String password) {
        int count=0;

        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<password.length(); i++){
            char ch=password.charAt(i);
            set.add(ch);
        }
        for(char ch:set){
            if(ch>='a' && ch<='z'){
                count+=1;
            }
            if(ch>='A' && ch<='Z'){
                count+=2;
            }
            if(ch>='0' && ch<='9'){
                count+=3;
            }
            else if(ch=='!' || ch=='@' || ch=='#' || ch=='$'){
                count+=5;
            }
        }
        return count;
    }
}
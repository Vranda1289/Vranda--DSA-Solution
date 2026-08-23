class Solution {
    public boolean isPalindromic(String s) {
        String binary="";
        for(int i=0; i<s.length(); i++){
            String temp=Integer.toBinaryString(s.charAt(i));
            while(temp.length()<8){
                temp="0"+temp;
            }
            binary+=temp;
        }
        int left=0;
        int right=binary.length()-1;

        while(left<right){
            if(binary.charAt(left)!=binary.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
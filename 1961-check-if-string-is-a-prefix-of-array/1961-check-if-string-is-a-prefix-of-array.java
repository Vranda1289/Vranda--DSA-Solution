class Solution {
    public boolean isPrefixString(String s, String[] words) {

        StringBuilder sb=new StringBuilder();

        for(String x:words){
            sb.append(x);

            if(sb.toString().equals(s)){
                return true;
            }
            else if(sb.length()>s.length()){
                return false;
            }
        }
        return false;
    }
}
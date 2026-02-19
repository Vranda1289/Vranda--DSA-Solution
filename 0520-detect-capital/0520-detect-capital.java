class Solution {
    public boolean detectCapitalUse(String word) {
        String cap= word.toUpperCase();
        if(cap==word){
            return true;
        }
        String low= word.toLowerCase();
        if(low==word){
            return true;
        }
        String sb= word.substring(1);
        String mix= sb.toLowerCase();

        if(mix.equals(sb) && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;

    }
}
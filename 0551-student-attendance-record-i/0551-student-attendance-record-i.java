class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        for(char ch:s.toCharArray()){
            if(ch!='L') countL=0;
            if(ch=='L') countL++;
            if(ch=='A') countA++;
            if(countA==2 || countL==3) return false;
        }
        return true;
    }
}
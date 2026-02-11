class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int curr=1;
        int max=1;
        char ch[]=new char[n];

        for(int i=0; i<n; i++){
            ch[i]=s.charAt(i);
        }
        
        for(int i=1; i<n; i++){
            if(ch[i]==ch[i-1]){
                curr++;
                if(curr>max){
                    max=curr;
                }
            }
            else {
                curr=1;
            }
        }
        return max;
    }
}
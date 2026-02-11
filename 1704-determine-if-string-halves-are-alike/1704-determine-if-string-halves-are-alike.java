class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count=0;
        int vow=0;
        char ch1[]=new char[n/2];
        char ch2[]=new char[n/2];
        for(int i=0; i<n/2; i++){
            ch1[i]=s.charAt(i);
        }
        for(int i=n/2; i<n; i++){
            ch2[i-n/2]=s.charAt(i);
        }

        for(int i=0; i<ch1.length; i++){
         if(ch1[i]=='a' || ch1[i]=='A' || ch1[i]=='e' || ch1[i]=='E' || ch1[i]=='i' || ch1[i]=='I' || ch1[i]=='o' || ch1[i]=='O' || ch1[i]=='u' ||ch1[i]=='U'){
            count++;
         }
        }

        for(int i=0; i<ch2.length; i++){
         if(ch2[i]=='a' || ch2[i]=='A' || ch2[i]=='e' || ch2[i]=='E' || ch2[i]=='i' || ch2[i]=='I' || ch2[i]=='o' || ch2[i]=='O' || ch2[i]=='u' ||ch2[i]=='U'){
            vow++;
         }
        }

        if(count== vow){
            return true;
        }
        return false;
    }
}
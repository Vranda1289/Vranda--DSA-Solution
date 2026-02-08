class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;

        char arr[]=s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>='a'&& arr[i]<='z'){
            if(arr[i]=='a' || arr[i]=='A' ||arr[i]=='e' || arr[i]=='E'|| arr[i]=='i'|| arr[i]=='I'|| arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u'){
                v++;
            }
            else{
                c++;
            }
            }
        }
        if(c>0){
             return (v/c);   
            }
            return 0;
    }
}
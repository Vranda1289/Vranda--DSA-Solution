class Solution {
    public int vowelcount(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        return count;
    }
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        sb.append(arr[0]);
        int vc=vowelcount(arr[0]);

        for(int i=1; i<arr.length; i++){
            sb.append(" ");
            if(vowelcount(arr[i])==vc){
                sb.append(new StringBuilder(arr[i]).reverse());
            }
            else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
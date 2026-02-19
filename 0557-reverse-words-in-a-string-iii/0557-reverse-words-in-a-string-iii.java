class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String [] arr=s.trim().split("\\s+");
        for(int i=0; i<arr.length; i++){
            sb.append(new StringBuilder(arr[i]).reverse());

            if(i!=arr.length-1){
            sb.append(" ");
        }
        }
        return sb.toString();
    }
    
}
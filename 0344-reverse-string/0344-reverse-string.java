class Solution {
    public void reverseString(char[] arr) {
        int n=arr.length;
        int s=0;
        int e=n-1;

        while(s<e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
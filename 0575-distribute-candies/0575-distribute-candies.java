class Solution {
    public int distributeCandies(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=1;
        for(int i=1; i<n; i++){
            if(count<n/2){
                if(arr[i]!=arr[i-1]){
                count++;
                }
            }
        }
        return count;
    }
}
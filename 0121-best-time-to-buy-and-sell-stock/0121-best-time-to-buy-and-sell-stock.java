class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int min=arr[0];
        int max=0;

        for(int i=1; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            int profit =arr[i]-min;

            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
}
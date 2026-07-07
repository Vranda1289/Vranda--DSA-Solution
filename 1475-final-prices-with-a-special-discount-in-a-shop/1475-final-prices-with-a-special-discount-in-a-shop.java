class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int[n];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(prices[j]<=prices[i]){
                    ans[i]=prices[i]-prices[j];
                    break;
                }
                else{
                    ans[i]=prices[i];
                }
                ans[n-1]=prices[n-1];
            }
        }
        return ans;
    }
}
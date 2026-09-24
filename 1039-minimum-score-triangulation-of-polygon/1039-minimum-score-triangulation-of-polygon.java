class Solution {
    public int minScoreTriangulation(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int dp[][]=new int[n][n];
        
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(arr,n,i,j,dp);
    }
    public static int solve(int arr[],int n,int i,int j, int dp[][]){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i+1; k<j; k++){
            int curr=solve(arr,n,i,k,dp)+ solve(arr,n,k,j,dp)+arr[i]*arr[k]*arr[j];
            ans=Math.min(ans,curr);
        }
        return dp[i][j]=ans;
    }
}

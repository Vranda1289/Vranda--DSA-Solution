class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();

        int dp[][]=new int[n+1][m+1];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return dp[n][m]=solve(s,t,n,m,dp);
    }
    public static int solve(String s, String t, int n , int m, int dp[][]){
        if(m==0){
            return 1;
        }
        
        if(n==0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if(s.charAt(n-1)==t.charAt(m-1)){
            return dp[n][m]=solve(s,t,n-1,m-1,dp)+solve(s,t,n-1,m,dp);
        }
        else{
            return dp[n][m]=solve(s,t,n-1,m,dp);
        }
    }
}
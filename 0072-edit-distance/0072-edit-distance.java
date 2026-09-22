class Solution {
    public int minDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        int dp[][]=new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(s1,s2,n,m,dp);
    }

    public static int solve(String s1, String s2, int n, int m, int dp[][]){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=solve(s1,s2,n-1,m-1,dp);
        }
        else{
            return dp[n][m]=1+Math.min(solve(s1,s2,n-1,m-1,dp),Math.min(solve(s1,s2,n,m-1,dp),solve(s1,s2,n-1,m,dp)));
        }
    }
}
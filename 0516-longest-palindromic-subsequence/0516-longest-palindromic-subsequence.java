class Solution {
    public int longestPalindromeSubseq(String s) {
     StringBuilder sb=new StringBuilder(s);
        String s2=sb.reverse().toString();
        
        int n=s.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j]=-1;
            }
        }
        return solve(s,s2,n,m,dp);   
    }

     public static int solve(String s, String s2, int n, int m, int dp[][]){
        if(n==0||m==0){
            return 0;
        }
        
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        
        if(s.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=1+solve(s,s2,n-1,m-1,dp);
        }
        else{
            return dp[n][m]=Math.max(solve(s,s2,n,m-1,dp),solve(s,s2,n-1,m,dp));
        }
    }
}
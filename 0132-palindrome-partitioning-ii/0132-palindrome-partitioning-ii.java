import java.util.*;

class Solution {

    public static boolean isPalindrome(String s, int i, int j){

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public int minCut(String s) {

        int n = s.length();

        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return solve(s, 0, dp);
    }

    public static int solve(String s, int i, int dp[]) {

        if(i == s.length()){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int ans = Integer.MAX_VALUE;

        for(int j = i; j < s.length(); j++){

            if(isPalindrome(s, i, j)){

                if(j == s.length() - 1){
                    ans = 0;
                }
                else{
                    ans = Math.min(ans, 1 + solve(s, j + 1, dp));
                }
            }
        }

        return dp[i] = ans;
    }
}
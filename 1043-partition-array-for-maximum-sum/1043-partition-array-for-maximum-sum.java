import java.util.Arrays;

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;

        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return solve(0, arr, k, dp);
    }

    public int solve(int i, int arr[], int k, int dp[]) {

        if (i >= arr.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int max = 0;
        int ans = 0;
        int j = i;

        while (j < arr.length && j < i + k) {

            max = Math.max(max, arr[j]);

            int len = j - i + 1;

            int sum = max * len + solve(j + 1, arr, k, dp);

            ans = Math.max(ans, sum);

            j++;
        }

        return dp[i] = ans;
    }
}
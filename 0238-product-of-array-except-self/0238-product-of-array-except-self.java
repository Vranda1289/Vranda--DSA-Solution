class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int pre[]=new int[n];
        int suff[]=new int[n];
        int ans[]=new int[n];

        int total=1;
        for(int i=0; i<n; i++){
            total*=arr[i];
        }
        pre[0]=1;
        for(int i=1; i<n; i++){
            pre[i]=pre[i-1]*arr[i-1];
        }
        suff[n-1]=1;
        for(int i=n-2; i>=0; i--){
            suff[i]=suff[i+1]*arr[i+1];
        }

        for(int i=0; i<n; i++){
            ans[i]=pre[i]*suff[i];
        }
        return ans;
    }
}
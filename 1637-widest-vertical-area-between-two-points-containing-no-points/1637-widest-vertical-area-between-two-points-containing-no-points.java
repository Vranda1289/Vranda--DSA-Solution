class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b)-> a[0]-b[0]);
        int n=points.length;

        int ans=0;
        for(int i=1; i<n; i++){
            int f=points[i][0]-points[i-1][0];
            ans=Math.max(f,ans);
        }
        return ans;
    }
}
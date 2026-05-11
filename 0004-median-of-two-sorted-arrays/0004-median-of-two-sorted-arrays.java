class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int grr[]=new int[n+m];
        for(int i=0; i<n;i++){
            grr[i]=nums1[i];
        }
        for(int i=0; i<m; i++){
            grr[i+n]=nums2[i];
        }
        Arrays.sort(grr);
        int t=grr.length;
        int mid=t/2;
            if(t%2!=0){
                return (float)grr[mid];
            }
        
        return (float)(grr[mid]+grr[mid-1])/2;
    }
}
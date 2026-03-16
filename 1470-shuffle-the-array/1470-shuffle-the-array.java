class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=2*n;
        int arr[]=new int[l];
        int k=0;
        for(int i=0; i<n; i++){
            arr[k++]=nums[i];
            arr[k++]=nums[i+n];
        }
        return arr;
    }
}
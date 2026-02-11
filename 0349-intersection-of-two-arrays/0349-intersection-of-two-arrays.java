class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;

        for(int i=0; i<n; i++){
            set1.add(nums1[i]);
        }
         for(int i=0; i<m; i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            };
        }

        int[] ans = new int[set2.size()];
        int i=0;
        for (int g : set2) {
            ans[i++] = g;
        }
        return ans;
    }
}
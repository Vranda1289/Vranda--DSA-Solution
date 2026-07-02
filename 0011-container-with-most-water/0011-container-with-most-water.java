class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxarea=0;

        while(left<right){
            int width=right-left;
            int minheight=Math.min(height[left],height[right]);
            int area=minheight*width;

            maxarea=Math.max(area,maxarea);

            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}
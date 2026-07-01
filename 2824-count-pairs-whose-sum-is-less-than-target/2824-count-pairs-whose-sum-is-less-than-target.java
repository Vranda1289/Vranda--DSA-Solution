class Solution {
    public int countPairs(List<Integer> arr, int target) {
        int count=0;
       int a=arr.size();
       Collections.sort(arr);
       int x=0;
       int y=a-1;
       while(x<y){
           if(arr.get(x)+arr.get(y)<target){
               count+=(y-x);
               x++;
           }
           else{
               y--;
           }
           
       }
       return count;
    }
}
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;

        for(int n:nums){
           while(n>0){
            int dig=n%10;
            list.add(dig);
            if(dig==digit){
                count++;
            }
            n/=10;
           }
        }
        return count;

    }
    
}
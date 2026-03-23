class Solution {
    public int removeDuplicates(int[] nums) {
        // int n = nums.length;
        // if (n <= 2) return n;

        // int rd = 2;
        // for (int i = 2; i < n; i++) {
        //     if (nums[i] != nums[rd - 2]) {
        //         nums[rd] = nums[i];
        //         rd++;
        //     }
        // }
        // return rd;

        List <Integer> list = new ArrayList<>();
        HashMap <Integer,Integer> map=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int freq=map.getOrDefault(nums[i],0);
            if(freq<2){
                list.add(nums[i]);
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int k=0;
        for(int i=0; i<list.size(); i++){
            nums[i]=list.get(k);
            k++;
        }
        return k;
    }
}

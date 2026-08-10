class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int x:map.keySet()){
            int freq=map.get(x);

            if(freq>=k){
                for(int i=0; i<k; i++){
                    list.add(x);
                }
            }
            else{
                for(int i=0; i<freq; i++){
                    list.add(x);
                }
            }
        }
        Collections.sort(list);
        int arr[]=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
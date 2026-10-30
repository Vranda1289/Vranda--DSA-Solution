class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();

        for(String word:operations){
            if(!word.equals("C") && !word.equals("D") && !word.equals("+")){
                list.add(Integer.parseInt(word));
            }
            else if(word.equals("C")){
                list.remove(list.size()-1);
            }
            else if(word.equals("D")){
                list.add(list.get(list.size()-1)*2);
            }
            else{
                int n=list.size();
                list.add(list.get(n-1)+list.get(n-2));
            }
        }
        int sum=0;
        for(int x:list){
            sum+=x;
        }
        return sum;
    }
}
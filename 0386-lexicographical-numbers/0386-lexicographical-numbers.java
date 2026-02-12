class Solution {
    public void solve(int curr, int n, List<Integer> list){
        if(curr>n)return;
        list.add(curr);
        for(int i=0; i<=9; i++){
            solve(curr*10+i,n,list);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1; i<=9; i++){
            solve(i,n,list);
        }
        return list;
    }
}
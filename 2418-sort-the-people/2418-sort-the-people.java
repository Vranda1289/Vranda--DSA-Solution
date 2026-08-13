class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;

        Integer Index[]=new Integer [n];

        for(int i=0; i<n; i++){
            Index[i]=i;
        }

        Arrays.sort(Index, (a,b)-> heights[b]-heights[a]);

        String ans[]=new String[n];

        for(int i=0; i<n; i++){
            ans[i]=names[Index[i]];
        }

        return ans;
    }
}
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;

        for(int i=left; i<=right; i++){
            char arr[] = words[i].toCharArray();
            if(isVowel(arr[0]) && isVowel(arr[arr.length-1])){
                count++;
            }
        }
        return count;
    }
    public boolean isVowel(char arr){
        return arr=='a' || arr=='e' || arr=='i' || arr=='o' || arr=='u';
    }
}
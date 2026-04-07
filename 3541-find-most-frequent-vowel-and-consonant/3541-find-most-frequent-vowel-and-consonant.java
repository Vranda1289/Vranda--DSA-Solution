class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowel=new HashMap<>();
        HashMap<Character,Integer> consonant=new HashMap<>();
        for(char ch: s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }
            else{
                consonant.put(ch,consonant.getOrDefault(ch,0)+1);
            }
        }

        int max1=0;
        for(char ch: vowel.keySet()){
            if(vowel.get(ch)>max1){
                max1=vowel.get(ch);
            }
        }

        int max2=0;
        for(char ch: consonant.keySet()){
            if(consonant.get(ch)>max2){
                max2=consonant.get(ch);
            }
        }
        return max1+max2;
    }
}
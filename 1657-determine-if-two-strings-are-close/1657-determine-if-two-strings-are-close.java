class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(char ch: word1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
       
        for(char ch: word2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        for(char ch : map1.keySet()) {
            list1.add(map1.get(ch));
        }

        for(char ch : map2.keySet()) {
            list2.add(map2.get(ch));
        }
        Collections.sort(list1);
        Collections.sort(list2);

    
        return list1.equals(list2);

    }
}
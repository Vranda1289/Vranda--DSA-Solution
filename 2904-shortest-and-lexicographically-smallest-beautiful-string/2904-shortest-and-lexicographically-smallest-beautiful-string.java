class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        String ans = "";

        int i = 0;
        int count = 0;

        for(int j = 0; j < s.length(); j++) {

            if(s.charAt(j) == '1') {
                count++;
            }

            while(count == k) {

                String current = s.substring(i, j + 1);

                if(ans.equals("") ||
                   current.length() < ans.length() ||
                   (current.length() == ans.length() && current.compareTo(ans) < 0)) {

                    ans = current;
                }

                if(s.charAt(i) == '1') {
                    count--;
                }

                i++;
            }
        }

        return ans;
    }
}
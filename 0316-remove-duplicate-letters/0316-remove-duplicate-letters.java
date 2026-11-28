class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        boolean[] present = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            last[ch - 'a'] = i;
            present[ch - 'a'] = true;
        }

        String ans = "";
        int start = 0;
        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (present[i]) count++;
        }

        while (count > 0) {
            int limit = s.length();

            // Find the earliest last occurrence
            for (int i = 0; i < 26; i++) {
                if (present[i]) {
                    limit = Math.min(limit, last[i]);
                }
            }

            // Find the smallest character before limit
            char smallest = 'z' + 1;
            int index = -1;

            for (int i = start; i <= limit; i++) {
                char ch = s.charAt(i);

                if (present[ch - 'a'] && ch < smallest) {
                    smallest = ch;
                    index = i;
                }
            }

            ans += smallest;
            present[smallest - 'a'] = false;
            start = index + 1;
            count--;
        }

        return ans;
    }
}
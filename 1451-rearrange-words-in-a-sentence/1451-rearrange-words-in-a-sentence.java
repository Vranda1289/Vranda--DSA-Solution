class Solution {
    public String arrangeWords(String text) {

        String[] words = text.toLowerCase().split(" ");

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                ans.append(" ");
            }

            ans.append(words[i]);
        }

        ans.setCharAt(0, Character.toUpperCase(ans.charAt(0)));

        return ans.toString();
    }
}
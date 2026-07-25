class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int index = 0;

        while (i < chars.length) {

            char curr = chars[i];
            int count = 0;

            // Count same characters
            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }

            // Write character
            chars[index] = curr;
            index++;

            // Write count only if > 1
            if (count > 1) {
                String str = Integer.toString(count);

                for (char ch : str.toCharArray()) {
                    chars[index] = ch;
                    index++;
                }
            }
        }

        return index;
    }
}
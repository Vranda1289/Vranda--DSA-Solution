class Solution {
    public int countCommas(int n) {
        int count = 0;

        int temp = n;

        // digits count karna
        while (temp > 0) {
            int digit = temp % 10;
            count++;
            temp /= 10;
        }

        if (count <= 3) {
            return 0;
        } 
        else if (count <= 6) {
            return n - 999;
        }

        return 0;
    }
}
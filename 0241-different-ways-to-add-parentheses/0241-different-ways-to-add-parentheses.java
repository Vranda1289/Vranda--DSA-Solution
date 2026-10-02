import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String s) {

        List<Integer> ans = new ArrayList<>();

        for(int k = 0; k < s.length(); k++) {

            char op = s.charAt(k);

            if(op == '+' || op == '-' || op == '*') {

                List<Integer> left = diffWaysToCompute(s.substring(0, k));
                List<Integer> right = diffWaysToCompute(s.substring(k + 1));

                for(int a : left) {
                    for(int b : right) {

                        if(op == '+')
                            ans.add(a + b);

                        else if(op == '-')
                            ans.add(a - b);

                        else
                            ans.add(a * b);
                    }
                }
            }
        }
        if(ans.size() == 0) {
            ans.add(Integer.parseInt(s));
        }

        return ans;
    }
}
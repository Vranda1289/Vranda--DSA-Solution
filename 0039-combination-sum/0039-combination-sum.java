
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(0, candidates, target, list, ans);

        return ans;
    }

    public void solve(int start, int[] candidates, int target, List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (candidates[i] > target) {
                continue;
            }

            list.add(candidates[i]);

            solve(i, candidates, target - candidates[i], list, ans);

            list.remove(list.size() - 1);
        }
    }
}

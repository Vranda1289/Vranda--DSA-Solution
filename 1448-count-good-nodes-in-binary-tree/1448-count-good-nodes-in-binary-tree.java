class Solution {
    int count = 0;

    public int goodNodes(TreeNode root) {
        solve(root, root.val);
        return count;
    }

    public void solve(TreeNode root, int maxSoFar) {

        if(root == null) {
            return;
        }

        if(root.val >= maxSoFar) {
            count++;
        }

        maxSoFar = Math.max(maxSoFar, root.val);

        solve(root.left, maxSoFar);
        solve(root.right, maxSoFar);
    }
}
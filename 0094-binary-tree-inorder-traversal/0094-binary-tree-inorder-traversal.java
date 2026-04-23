/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public void helper(TreeNode root, ArrayList<Integer> list){
    //     if(root==null){
    //         return ;
    //     }
    //     helper(root.left,list);
    //     list.add(root.val);
    //     helper(root.right,list);
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        // ArrayList<Integer> list=new ArrayList<>();
        // helper(root,list);
        // return list;
        ArrayList<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;

        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node=st.pop();
                list.add(node.val);
                node=node.right;
            }
        }
        return list;
    }
}
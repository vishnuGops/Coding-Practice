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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        dfs(lca(root, startValue, destValue), startValue, destValue, new StringBuilder());
        return "U".repeat(pathToStart.length()) + pathToDest;
    }
    
    private String pathToStart = "";
    private String pathToDest = "";
    
    private TreeNode lca(TreeNode root, int p , int q){
        if(root == null || root.val == p || root.val == q){
            return root;
        }
        TreeNode l = lca(root.left, p,q);
        TreeNode r = lca(root.right, p,q);
        if(l!= null && r !=  null)
            return root;
        return (l != null)? l : r;
    }
    
    private void dfs(TreeNode root, int p, int q, StringBuilder path){
        if(root == null)
            return;
        if(root.val == p)
            pathToStart = path.toString();
        if(root.val == q)
            pathToDest = path.toString();
        dfs(root.left, p , q, path.append('L'));
        path.deleteCharAt(path.length()-1);
        dfs(root.right, p , q, path.append('R'));
        path.deleteCharAt(path.length()-1);
    }
}
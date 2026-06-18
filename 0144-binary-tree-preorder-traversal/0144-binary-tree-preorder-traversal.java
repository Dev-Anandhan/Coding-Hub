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
    public List<Integer> preorderTraversal(TreeNode root) {
         TreeNode cur = root;
         List<Integer> l = new ArrayList<>();
         while(cur!= null)
         {
            if(cur.left==null){
                l.add(cur.val);
                cur = cur.right;
            }else{
             TreeNode pre=cur.left;
                  while(pre.right!=null && pre.right!=cur){
                    pre = pre.right;
                  }  
                  if(pre.right==null){
                    pre.right = cur;
                    l.add(cur.val);
                    cur=cur.left;

                  } else{
                    pre.right = null;
                    cur = cur.right;
                  } 
            }
         }
         return l;
        
    }
}
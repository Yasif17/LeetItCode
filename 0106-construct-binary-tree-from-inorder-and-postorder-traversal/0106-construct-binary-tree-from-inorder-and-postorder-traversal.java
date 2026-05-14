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

        int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        return postIn(inorder,postorder,0,inorder.length-1);
        
    }

    public TreeNode postIn(int[] inorder, int[] postorder, int start, int end){
        if(start>end) return null;

        int rootVal = postorder[postIndex--];

        TreeNode root = new TreeNode(rootVal);

        int mid = 0;

        for(int i=start;i<=end;i++){
            if(inorder[i]==rootVal){
                mid = i;
                break;
            }
        }

        root.right = postIn(inorder,postorder,mid+1,end);
        root.left = postIn(inorder,postorder,start,mid-1);

        return root; 

    }

}






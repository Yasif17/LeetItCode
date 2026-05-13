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

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return preIn( preorder, inorder,0,inorder.length-1);
    }



         
     TreeNode preIn(int[] preorder,int[] inorder, int start,int end){

        

        if(start>end) return null;

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int mid = 0;

        for(int i=start; i<=end; i++){
            if(inorder[i] == rootVal){
                mid = i;
                break;
            }
        }

        root.left = preIn(preorder,inorder,start,mid-1);
        root.right = preIn(preorder,inorder,mid+1,end);

        return root;


    }

}







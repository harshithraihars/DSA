import javax.swing.tree.TreeNode;

public class BinaryTreeMaximumPathSum {
    int ans;
    public int helper(TreeNode node){
        if(node==null) return 0;

        int left=helper(node.left);
        int right=helper(node.right);

        left=Math.max(left,0);
        right=Math.max(right,0);

        int maxPathSum=left+right+node.val;
        ans=Math.max(ans,maxPathSum);

        return Math.max(left,right)+node.val;
    }
    public int maxPathSum(TreeNode root) {
        ans=Integer.MIN_VALUE;
        helper(root);
        return ans;
    }
}

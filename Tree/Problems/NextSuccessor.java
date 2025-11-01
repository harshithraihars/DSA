package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class NextSuccessor {
    public TreeNode averageOfLevels(TreeNode root,int key) {
        List<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            TreeNode currentNode = que.poll();
            // you are adding first because next node might be emp
            if (currentNode.left != null) {
                que.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                que.offer(currentNode.right);
            }

            if(currentNode.val==key){
                return que.poll();
            }
        }
        return res;
    }
}

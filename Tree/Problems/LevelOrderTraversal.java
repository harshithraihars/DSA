package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LevelOrderTraversal {
   public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int currentsize=que.size();
            List<Integer> currlevel=new ArrayList<>();
            for(int i=0;i<currentsize;i++){
                TreeNode currentNode=que.poll();
                currlevel.add(currentNode.val);
                if(currentNode.left!=null){
                    que.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    que.offer(currentNode.right);
                }
            }
            res.add(currlevel);
        }
        return res;
    } 
}

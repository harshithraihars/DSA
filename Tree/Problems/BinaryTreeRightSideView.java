import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int currentsize=que.size();
            for(int i=0;i<currentsize;i++){
                TreeNode currentNode=que.poll();
                if(i==currentsize-1) res.add(currentNode.val);
                if(currentNode.left!=null){
                    que.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    que.offer(currentNode.right);
                }
            }
        }
        return res;
    }
}

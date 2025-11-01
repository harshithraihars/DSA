import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class CousinsinBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        int count=0;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int currentsize=que.size();
            for(int i=0;i<currentsize;i++){
                TreeNode currentNode=que.poll();
                if(currentNode.val==x || currentNode.val==y) count++;
                if(currentNode.left!=null && currentNode.right!=null){
                    if((currentNode.left.val==x || currentNode.left.val==y) && (currentNode.right.val==x || currentNode.right.val==y)) return false;
                }
                if(currentNode.left!=null){
                    que.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    que.offer(currentNode.right);
                }
            }
            if(count==2) return true;
            if(count==1) return false;
        }
        return false;
    }
}

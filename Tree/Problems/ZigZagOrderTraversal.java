package Problems;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class ZigZagOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> que=new LinkedList<>();
        que.offer(root);
        boolean reversed=false;
        while(!que.isEmpty()){
            int currentsize=que.size();
            List<Integer> currlevel=new ArrayList<>();
            for(int i=0;i<currentsize;i++){
                if(!reversed){
                    TreeNode currentNode=que.removeFirst();
                    currlevel.add(currentNode.val);
                    if(currentNode.left!=null){
                        que.offer(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        que.offer(currentNode.right);
                    }
                }else{
                    TreeNode currentNode=que.removeLast()
                    currlevel.add(currentNode.val);
                    // you are adding rigt firts because in reverse order its reverse
                    if(currentNode.right!=null){
                        que.addFront(currentNode.right);
                    }
                    if(currentNode.left!=null){
                        que.addFront(currentNode.left);
                    }
                }
            }
            reverse=!reverse;
            res.add(currlevel);
        }
        return res;
    }


    
}

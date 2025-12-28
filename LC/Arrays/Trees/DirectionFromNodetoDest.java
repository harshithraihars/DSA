package Trees;
// Intuition
// The goal is to find the exact directions needed to move from a given start node to a destination node in a binary tree. Since the tree does not store parent pointers, moving upward must be handled using recursion. The idea is to first locate the start node and then build the path to the destination using DFS while tracking upward, left, and right movements.

// Approach
// Use DFS with backtracking.
// The helper1() function searches for the start node. Once found, it tries to reach the destination by calling searchDest() on its subtrees.
// While backtracking, if the destination is not yet found, append 'U' to represent upward movement and explore the opposite subtree.
// The searchDest() function performs a downward DFS, appending 'L' or 'R' and removing them if the path fails.
// A global flag is used to stop recursion once the destination is found.

// Complexity
// Time complexity: O(n)
// Space complexity: O(h), where h is the height of the tree due to recursion stack and path storage.
// Code
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
public class DirectionFromNodetoDest {
    public static boolean pathFound;
    public static StringBuilder res;
    public static boolean searchDest(TreeNode node,int destValue,char direction){
        if(node==null) return false;
        res.append(direction);
        if(node.val==destValue){
            pathFound=true;
            return true;

        }
        boolean left=searchDest(node.left,destValue,'L');
        boolean right=searchDest(node.right,destValue,'R');
        if(!left && !right){
            res.deleteCharAt(res.length() - 1);
        }
        return left || right;
    }

    public static boolean helper1(TreeNode node, int startValue, int destValue){
        if(node==null) return false;
        if(node.val==startValue){
            searchDest(node.left,destValue,'L');
            searchDest(node.right,destValue,'R');
            return true;
        }
        boolean left=helper1(node.left,startValue,destValue);
        if(left && !pathFound){
            res.append('U');
            if(node.val==destValue){
                pathFound=true;
                return true;
            }
            searchDest(node.right,destValue,'R');
            return true;
        }
        boolean right=helper1(node.right,startValue,destValue);
        if(right && !pathFound){
            res.append('U');
            if(node.val==destValue){
                pathFound=true;
                return true;
            }
            searchDest(node.left,destValue,'L');
            return true;
                    
        }
        return false;
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        pathFound=false;
        res=new StringBuilder("");
        helper1(root,startValue,destValue);
        return res.toString();
    }
}


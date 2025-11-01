public class PathExistsinBinaryTree {
    class Tree {
        int val;
        Tree left;
        Tree right;

        public Tree(int val) {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean findPath(Tree node,int arr[]){
        if(node==null) return arr.length==0;

        return helper(node, arr, 0);
    }
    public static boolean helper(Tree node,int arr[],int index){
        if(node==null) return false;

        if(index>=arr.length || node.val!=arr[index]) return false;

        if(node.left==null && node.right==null && index==arr.length-1){
            return true;
        }

        return helper(node.left, arr, index+1)||helper(node.right, arr, index+1);
    }

}

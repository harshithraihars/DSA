public class AVLTree {
    class Node {
        private int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;
    public AVLTree(){

    }
    public int height(Node node){
        if(node==null) return -1;
        return node.height;

    }

    public boolean isEmpty(){
        return(root==null);
    }

    public void display(){
        display(root,"Root Node");
    }

    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"left child of "+node.getValue()+": ");
        display(node.right,"right child of "+node.getValue()+": ");
    }

    public void insert(int value){
        root=insert(root,value);
    }

    private Node insert(Node node,int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(node.left, value);
        }
        if(value>node.value){
            node.right=insert(node.right, value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }

    private Node rightRotate(Node p){
        // just refer the 1st rule and applu easy pizzy
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;
    }

    private Node leftRotate(Node c){
        // just refer the 1st rule and applu easy pizzy
        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return p;
    }
    // kunals
    // private Node rotate(Node node){
    //     // refre the notes and the corresponding diagrams
    //     if(height(node.left)-height(node.right)>1){
    //         // left heavy we have to perform left rotation
    //         if(height(node.left.left)-height(node.left.right)>0){
    //             // you have to do left left rotation
    //             return rightRotate(node);
    //         }
    //         if(height(node.left.left)-height(node.left.right)<0){
    //             // you have to do left right rotation
    //             node.left=leftRotate(node.left);
    //             return rightRotate(node);
    //         }
    //     }

    //     if(height(node.left)-height(node.right)<-1){
    //         // left heavy we have to perform left rotation
    //         if(height(node.right.left)-height(node.right.right)<0){
    //             // you have to do left left rotation
    //             return leftRotate(node);
    //         }
    //         if(height(node.right.left)-height(node.right.right)>0){
    //             // you have to do left right rotation
    //             node.right=rightRotate(node.left);
    //             return leftRotate(node);
    //         }
    //     }

    //     return node;
    // }


private Node rotate(Node node) {
    int balance = height(node.left) - height(node.right);

    // Left heavy
    if (balance > 1) {
        if (node.left != null && height(node.left.left) >= height(node.left.right)) {
            // Left-Left
            return rightRotate(node);
        }
        if (node.left != null) {
            // Left-Right
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
    }

    // Right heavy
    if (balance < -1) {
        if (node.right != null && height(node.right.right) >= height(node.right.left)) {
            // Right-Right
            return leftRotate(node);
        }
        if (node.right != null) {
            // Right-Left
            node.right = rightRotate(node.right); // <-- you had node.left here, which is wrong
            return leftRotate(node);
        }
    }

    return node;
}


    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null) return true;
        return (height(node.left)-height(node.right)<=1 && balanced(node.left) && balanced(node.right));
    }


    public void populate(int[] nums){
        for(int num:nums){
            this.insert(num);
        }
    }

    public void populateSorted(int []nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int []nums,int start,int end){
        if(start>=end) return;
        int mid=(start+end)/2;
        insert(nums[mid]);
        populateSorted(nums,start,mid-1);
        populateSorted(nums, mid+1, end);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+"\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void Inorder(){
        Inorder(root);
    }
    private void Inorder(Node node){
        if(node==null){
            return;
        }
        preOrder(node.left);
        System.out.print(node.value+"\t");
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value+"\t");
    }

    public int height(){
        return height(root);
    }
    public static void main(String[] args) {
        AVLTree tree=new AVLTree();
        for(int i=0;i<1000;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
    }

}

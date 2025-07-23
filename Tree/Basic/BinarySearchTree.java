public class BinarySearchTree {
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
    public BinarySearchTree(){

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

    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        // 5,2,7,1,4,6,9,8,3,10
        int arr[]={5,3,10};
        tree.populate(arr);
        tree.display();
        tree.preOrder();
        System.out.println();
        tree.Inorder();
        System.out.println();
        tree.postOrder();
    }
}

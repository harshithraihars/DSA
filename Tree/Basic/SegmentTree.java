public class SegmentTree {
    private class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }
    Node root;

    private Node constructTree(int arr[],int startIndex,int endIndex){
        if(startIndex==endIndex){
            // we are at the leaf node;
            Node leaf=new Node(startIndex, endIndex);
            leaf.data=arr[startIndex];
            return leaf;
        }
        Node node=new Node(startIndex, endIndex);
        int mid=(startIndex+endIndex)/2;

        node.left=constructTree(arr, startIndex, mid);
        node.right=constructTree(arr, mid+1, endIndex);

        node.data=node.left.data+node.right.data;
        return node;
    }
    public SegmentTree(int[] arr){
        this.root=constructTree(arr,0,arr.length-1);
    }

    private void traversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+"\t");
        traversal(node.left);
        traversal(node.right);
    }
    private void traversal(){
        traversal(root);
    }
    private void display(Node node){
        String str="";
        if(node.left!=null){
            str+="Interval ["+node.left.startInterval+","+node.left.endInterval+"]"+" data "+node.left.data;
        }
        str+="Interval ["+node.startInterval+","+node.endInterval+"]"+" data "+node.data;
        if(node.right!=null){
            str+="Interval ["+node.right.startInterval+","+node.right.endInterval+"]"+" data "+node.right.data;
        }
        System.out.println(str);
        if(node.left!=null) display(node.left);
        if(node.right!=null) display(node.right);
    }

    public void display(){
        display(root);
    }

    private int query(Node node,int qsi,int qei){
        if(node.startInterval>=qsi && node.endInterval<=qei){
            // node is completely inside query
            return node.data;
        }
        else if(node.startInterval>qei || node.endInterval<qsi){
            // node is outside
            return 0;
        }else{
            return query(node.left, qsi, qei)+query(node.right, qsi, qei);
        }
    }

    public int query(int s,int e){
        return(query(root,s, e));
    }

    private int update(Node node,int index,int val){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.data=val;
                return node.data;
            }
            else{
                int leftData=update(node.left, index, val);
                int rightData=update(node.right, index, val);
                node.data=leftData+rightData;
                return node.data;
            }
        }
        return node.data;
    }

    public void update(int index,int val){
        this.root.data=update(root,index,val);
    }
    public static void main(String[] args) {
        // {3,8,6,7,-2,-8,4,9};
        int arr[]={3,8,6,7,-2,-8,4,9};
        SegmentTree tree=new SegmentTree(arr);
        tree.traversal();
        tree.display();
        System.out.println(tree.query(0,1));;
        tree.update(0, 4);
        System.out.println(tree.query(0, 1));
    }
}

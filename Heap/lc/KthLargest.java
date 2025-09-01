import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int arr[]={3,2,3,1,2,4,5,5,6};;
        System.out.println(findKthLargest(arr,4));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}

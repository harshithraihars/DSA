public class KthLargestElement{
    public static int findKthLargest(int[] nums, int k) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int arr[]=new int[max+1];
        for(int num:nums){
            arr[num]++;
        }
        for(int i=arr.length-1;i>=0;i--){
            k-=arr[i];
            if(k<=0){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,4));;
    }
}
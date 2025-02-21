public class PeakElement {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int prev,next;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid==0){
                prev=Integer.MIN_VALUE;
            }else{
                prev=nums[mid-1];
            }
            if(mid==nums.length-1){
                next=Integer.MIN_VALUE;
            }else{
                next=nums[mid+1];
            }
            if(nums[mid]>=prev && nums[mid]>=next){
                return mid;
            }
            else if(nums[mid]<=next){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}

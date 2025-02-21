public class NiceSubArray {
    public static int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        
        int left=0;
        int right=0;
        while(right<nums.length){
            while( right<nums.length && k>0  ){
                if(nums[right]%2!=0){
                    k--;
                }
                right++;
            }
            count+=1;
            if(nums[left]%2!=0){
                k++;
            }
            left++;
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(arr, 3));
    }
}

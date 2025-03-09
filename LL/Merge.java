public class Merge {
    public static boolean check(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        int left=maxIndex;
        int right=maxIndex+1;
        while(left>0){
            if(nums[left]<nums[left-1]){
                return false;
            }
            left--;
        }
        while(right<nums.length-1){
            if(nums[right]>nums[right+1]){
                return false;
            }
            right++;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(check(arr));
    }
}

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        for(int num:nums){
            System.out.print(num+"\t");
        }
        for(i=0;i<nums.length;i++){
            if (nums[i]!=i+1) {
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
}

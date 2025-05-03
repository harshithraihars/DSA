public class TargetSum {
    public static int targetSum(int nums[],int target,int currsum,int i){
        if(currsum==target && i==nums.length){
            return 1;
        }
        if(i==nums.length){
            return 0;
        }
        int count=0;
        count+=targetSum(nums, target, currsum+nums[i], i+1);
        count+=targetSum(nums, target, currsum-nums[i], i+1);
        return count;
    }
    public static void main(String[] args) {
        int target[]={1};
        System.out.println(targetSum(target, 1, 0, 0));
    }
}

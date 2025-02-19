public class MaximumAscendingSubArray {
    public static int maxAscendingSum(int[] nums) {
        int max = nums[0];
int sum = nums[0];

for (int i = 1; i < nums.length; i++) {
    if (nums[i] > nums[i - 1]) {
        sum += nums[i];
    } else {
        max = Math.max(max, sum);
        sum = nums[i];
    }
}
max = Math.max(max, sum);
    }
    public static void main(String[] args) {
        int arr[]={3,6,10,1,8,9,9,8,9};
        maxAscendingSum(arr);
    }
}

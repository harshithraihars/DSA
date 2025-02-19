import java.util.ArrayList;

public class MaxConsecutiveOne {
    public static int longestOnes(int[] nums, int k) {
        int count=0;
        int left=0;
        int right=0;
        int max=0;
        int index=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                list.add(i);
            }
        }
        while(right<nums.length){
            while(count<k || nums[right]==1){
                if(right<nums.length && nums[right]==0 ){
                    count++;
                }
                right++;
            }
            max=Math.max(max,right-left);
            left=list.get(index)+1;
            index++;
            count--;
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        longestOnes(arr, 3);
    }
}

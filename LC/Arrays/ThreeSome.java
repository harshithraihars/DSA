import java.util.*;
public class ThreeSome {
    public static ArrayList<ArrayList<Integer>> Three(int[] nums){
        ArrayList<ArrayList<Integer>> output=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right) {
                int res=nums[i]+nums[left]+nums[right];
                if(res==0){
                    ArrayList<Integer> nnums=new ArrayList<>();
                    nnums.add(nums[i]);
                    nnums.add(nums[left]);
                    nnums.add(nums[right]);
                    output.add(nnums);
                    left++;
                    while(nums[left]==nums[left-1] && left<right){
                        left++;
                    }
                }else if(res<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println(output);
        return output;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(Three(arr));;
    }
}

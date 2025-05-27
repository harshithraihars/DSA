import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> output=new ArrayList<>();
         int i=0;
        while (i<nums.length) {
            if(nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if (nums[i]-1!=i) {
                output.add(nums[i]);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(findDuplicates(arr));
    }
}

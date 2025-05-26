import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            if(nums[i]!=nums[nums[i]-1]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        List<Integer> output = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                output.add(i + 1);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 4 };
        System.out.println(findDisappearedNumbers(arr));
    }
}
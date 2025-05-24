import java.util.ArrayList;
import java.util.List;

public class CombinationSum4 {
    public static int count(List<Integer> ar, int[] nums, int target) {
        if (target == 0) {
            return 1;
        }
        int solutions = 0;
        for (int num : nums) {
            if (target - num >= 0) {
                ar.add(num);
                solutions += count(ar, nums, target - num);
                ar.remove(ar.size() - 1);
            }
        }
        return solutions;
    }

    public static int combinationSum4(int[] nums, int target) {
        return count(new ArrayList<>(), nums, target);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(combinationSum4(nums, 4));
    }
}

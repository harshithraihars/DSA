import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSUm2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  // Sort to handle duplicates and allow early pruning
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break;

            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, path, result);  // i + 1 to avoid reuse
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int candidates[]={10,1,2,7,6,1,5};
        System.out.println(combinationSum2(candidates, 8));
    }
}

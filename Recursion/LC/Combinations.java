import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> findCombinations(int n, int k, List<Integer> ar) {
        List<List<Integer>> output = new ArrayList<>();
        if (ar.size() == k) {
            output.add(new ArrayList<>(ar));
            return output;
        }
        int startindex = ar.size() > 0 ? ar.get(ar.size() - 1) : 0;
        for (int i = startindex + 1; i <= n; i++) {
            ar.add(i);
            output.addAll(findCombinations(n, k, ar));
            ar.remove(ar.size() - 1);
        }
        return output;
    }

    public static List<List<Integer>> combine(int n, int k) {
        return findCombinations(n, k, new ArrayList<Integer>());

        // return output;
    }

    public static void main(String args[]) {

        System.out.println(combine(4, 2));
    }
}

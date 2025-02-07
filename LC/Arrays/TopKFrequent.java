import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopKFrequent {
    public static int[] getTopK(int nums[], int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: Count frequencies of numbers
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a bucket array based on frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }
        for (int i = 0; i<bucket.length; i++) {
            System.out.println(bucket[i]);
        }

        // Step 3: Collect the top k frequent elements
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[index++] = num;
                    if (index == k)
                        break;
                }
            }
            if (index == k)
                break;
        }

        return res;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        getTopK(nums, 2);
    }
}

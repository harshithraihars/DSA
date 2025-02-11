import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int maxseq = 1;
        for (int num : nums) {
            if (!hs.contains(num - 1)) {
                int currentmax = 1;
                int currentnumber = num;
                while (hs.contains(currentnumber + 1)) {
                    currentnumber += 1;
                    currentmax += 1;
                }
                maxseq = Math.max(maxseq, currentmax);
            }

        }
        return maxseq;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(arr));
    }
}

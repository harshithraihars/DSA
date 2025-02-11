import java.util.HashSet;

public class LongestConsecutiveWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxlength = 0;
        HashSet<Character> hs = new HashSet<>();
        while (right < s.length()) {
            if (!hs.contains(s.charAt(right))) {
                hs.add(s.charAt(right));
                maxlength = Math.max(maxlength, right - left + 1);
                right++;
            } else {
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s1="abcabcbb";
        LongestConsecutiveWithoutRepeating l = new LongestConsecutiveWithoutRepeating();
    }
}

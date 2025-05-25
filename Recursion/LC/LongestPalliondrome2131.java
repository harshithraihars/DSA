import java.util.HashMap;

public class LongestPalliondrome2131 {
    // public static String reverse(String str) {
    //     StringBuilder strrev = new StringBuilder();
    //     strrev.append(str.charAt(1));
    //     strrev.append(str.charAt(0));
    //     return strrev.toString();
    // }

    // public static int longestPalindrome(String[] words) {

    //     HashMap<String, Integer> hs = new HashMap<>();
    //     for (String word : words) {
    //         hs.put(word, hs.getOrDefault(word, 0) + 1);
    //     }
    //     System.out.println(hs);
    //     int length = 0;
    //     for (String word : words) {
    //         hs.put(word, hs.get(word) - 1);
    //         for (String hskey : hs.keySet()) {
    //             if (hs.get(hskey) > 0 && reverse(word).equals(hskey)) {
    //                 length += 4;
    //                 System.out.println(length);
    //                 hs.put(word, hs.get(word) - 1);
    //                 hs.put(hskey, hs.get(hskey) - 1);
    //             }
    //         }
    //         hs.put(word, hs.get(word) + 1);
    //         System.out.println(hs);

    //     }
    //     for (String hskey : hs.keySet()) {
    //         if (hs.get(hskey) > 0 && reverse(hskey).equals(hskey)) {
    //             length += 2;
    //             break;
    //         }
    //     }
    //     return length;

    // }


    public static String reverse(String str) {
        StringBuilder strrev = new StringBuilder();
        strrev.append(str.charAt(1));
        strrev.append(str.charAt(0));
        return strrev.toString();
    }

    public static int longestPalindrome(String[] words) {

        HashMap<String, Integer> hs = new HashMap<>();
        for (String word : words) {
            hs.put(word, hs.getOrDefault(word, 0) + 1);
        }
        System.out.println(hs);
        int length = 0;
        for (String word : words) {
            hs.put(word, hs.get(word) - 1);
            if(hs.get(reverse(word))==null) continue;
            if (hs.get(reverse(word))>0 && hs.get(word)>-1) {
                length+=4;
                hs.put(word, hs.get(word) - 1);
                hs.put(reverse(word), hs.get(reverse(word)) - 1);
            }
            hs.put(word, hs.get(word) + 1);
        }

        for(String hskey:hs.keySet()){
                if(hs.get(hskey)>0  && reverse(hskey).equals(hskey)){
                    length+=2;
                    break;
                }
            }
        return length;

    }

    public static void main(String[] args) {
        String words[] = { "em", "pe", "mp", "ee", "pp", "me", "ep", "em", "em", "me" };
        System.out.println(longestPalindrome(words));
    }
}
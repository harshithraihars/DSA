import java.util.Arrays;

public class StringQuetions {
    // count the number of vowels in a string
    public static int CountVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    // public static boolean Anagram(String str1, String str2) {
    //     if (str1.length() != str2.length()) {
    //         return false;
    //     } else {
    //         char str1array[] = str1.toCharArray();
    //         char str2qrray[] = str2.toCharArray();
    //         Arrays.sort(str1array);
    //         Arrays.sort(str2qrray);
    //         return Arrays.equals(str1array, str2qrray);
    //     }

    // }

    public static boolean Anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } 
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        System.out.println(Anagram("harsu", "harks"));
    }
}
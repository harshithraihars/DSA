import java.util.ArrayList;
import java.util.Arrays;

public class PermutationInString {
    public static boolean checkPermutations(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            arr2[s2.charAt(i)-'a']++;
            if(i>=n1){
                arr2[s2.charAt(i-n1)-'a']--;
            }
            if(Arrays.equals(arr1, arr2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaoo";
        System.out.println(checkPermutations(s1, s2));
    }
}

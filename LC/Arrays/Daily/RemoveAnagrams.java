package Daily;
import java.util.ArrayList;
import java.util.List;

public class RemoveAnagrams {
    public List<String> removeAnagrams(String[] words) {
        int i=0;
        int j=1;
        List<String> res=new ArrayList<>();
        while(j<=words.length){
            while(j<words.length && isPalliondrome(words[i],words[j])){
                j++;
            }
            res.add(words[i]);
            i=j;
            j=j+1;
        }
        return res;
    }
    public static boolean isPalliondrome(String str1,String str2){
        int arr[]=new int[26];
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            arr[ch-'a']--;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}

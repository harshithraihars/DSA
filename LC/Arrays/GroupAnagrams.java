import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> validAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(String str:strs){
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(str);
        }
        return new ArrayList(hm.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagrams = validAnagrams(strs);
        
        System.out.println(anagrams);
    }
}

package advanced;

import java.util.HashMap;
import java.util.Map;

public class LongestPalliondrome {
    public int longestPalindrome(String s) {
         HashMap<Character,Integer> map=new HashMap<>();
        int len=0;
        boolean extra=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            len+=(val/2)*2;
            if(val%2==1) extra=true;
        }
        if(extra) return len+1;
        return len;

    }
}

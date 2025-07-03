import java.util.HashMap;

public class JewelsandStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            if(hs.containsKey(stones.charAt(i))){
                hs.put(stones.charAt(i),hs.get(stones.charAt(i))+1);
            }else{
                hs.put(stones.charAt(i),1);
            }
        }
        int count=0;
        for(int i=0;i<jewels.length();i++){
            count+=hs.get(jewels.charAt(i));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAZZZ"));
    }
}

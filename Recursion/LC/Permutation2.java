import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutation2 {
    public static void Solve(List<Integer> ar,int[] nums,List<List<Integer>> output,HashMap<Integer,Integer> hs){
        if(ar.size()==nums.length){
            if(!output.contains(ar)) output.add(new ArrayList<>(ar));
            return;
        }
        for(int num:nums){
            int elementcount=0;
            for(int a:ar){
                if (num==a) {
                    elementcount++;
                }
            }
            if(elementcount<hs.get(num)){
                ar.add(num);
                Solve(ar,nums,output,hs);
                ar.remove(ar.size()-1);
            }
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int num:nums){
            if(hs.containsKey(num)){
                hs.put(num,hs.get(num)+1);
            }else{
                hs.put(num,1);
            }
        }

        Solve(new ArrayList<>(), nums, output,hs);
        return output;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(permuteUnique(arr));;
    }
}

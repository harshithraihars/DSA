import java.util.ArrayList;
import java.util.List;

public class CombinationSum{
    public static List<List<Integer>> solve(int[] candidates, int target,int currsum,List<Integer> ls,int currentindex){
        List<List<Integer>> output=new ArrayList<>();
        if(currsum==target){
            List<Integer> newls=new ArrayList<>(ls);
            output.add(newls);
            return output;
        }
        for(int i=0;i<candidates.length;i++){
            if(currsum+candidates[i]<=target && i>=currentindex){
                ls.add(candidates[i]);
                output.addAll(solve(candidates, target, currsum+candidates[i],ls,i));
                ls.remove(Integer.valueOf(candidates[i]));
            }
        }
        return output;
    }
    public static void combinationSum(int[] candidates, int target) {
        output.add(new ArrayList<>());
        int curr_sum=0;
        List<Integer> ls=new ArrayList<>();
        System.out.println(solve(candidates, target, curr_sum,ls,0));
    }
    public static List<List<Integer>> output=new ArrayList<>();
    public static void main(String[] args) {
        
        int ar[]={2,3,5};
        // System.out.println(combinationSum(ar,8));
        combinationSum(ar, 8);
    }
}
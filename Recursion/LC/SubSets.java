import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void solve(int[] nums,ArrayList<Integer> ar,List<List<Integer>> output,int currindex){
        if(currindex==nums.length){
            output.add(new ArrayList(ar));
            return;
        }
        output.add(new ArrayList<>(ar));
        for(int i=currindex;i<nums.length;i++){
            ar.add(nums[i]);
            solve(nums,ar,output,i+1);
            ar.remove(ar.size()-1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        solve(nums,new ArrayList<>(),output,0);
        return output;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subsets(arr));
    }
}

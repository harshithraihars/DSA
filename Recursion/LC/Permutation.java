import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void Solve(List<Integer> ar,int[] nums,List<List<Integer>> output){
        if(ar.size()==nums.length){
            output.add(new ArrayList<>(ar));
            return;
        }
        for(int num:nums){
            if(!ar.contains(num)){
                ar.add(num);
                Solve(ar,nums,output);
                ar.remove(ar.size()-1);
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        Solve(new ArrayList<>(),nums,output);
        return output;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));
    }
}

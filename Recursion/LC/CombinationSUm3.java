import java.util.ArrayList;
import java.util.List;

public class CombinationSUm3 {
    public static void Solve(List<Integer> ar,List<List<Integer>> output,int k,int n,int startIndex){
        if(n==0 && ar.size()==k){
            output.add(new ArrayList<>(ar));
            return;
        }
        if(n==0){
            return;
        }
        for(int i=startIndex;i<=9;i++){
            if(n-i>=0){
                ar.add(i);
                Solve(ar,output,k,n-i,i+1);
                ar.remove(ar.size()-1);
            }
        }
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> output=new ArrayList<>();
        Solve(new ArrayList<>(), output, k, n, 1);
        return output;
    }
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }
}

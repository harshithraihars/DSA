import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<i;j++){
                l.add(1);
            }
            int k=1;
            while (k<i-1) {
                l.set(k,res.get(i-2).get(k-1)+res.get(i-2).get(k));
                k++;
            }
            res.add(l);
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        generate(5);
    }
}

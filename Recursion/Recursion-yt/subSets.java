import java.util.ArrayList;
import java.util.List;

public class subSets {
    public static ArrayList<String> subset(String str, String newstr) {
        if (str.isEmpty()) {
            ArrayList<String> ar = new ArrayList<>();
            if (newstr != "")
                ar.add(newstr);
            return ar;
        }
        char ch = str.charAt(0);
        ArrayList<String> ar1 = subset(str.substring(1), newstr + ch);
        ArrayList<String> ar2 = subset(str.substring(1), newstr);
        ar1.addAll(ar2);
        return ar1;
    }


    public static List<List<Integer>> Iterattive(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> DuplicateAvoidIterattive(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        int start=0;
        int end=0;
        outer.add(new ArrayList<Integer>());
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }else{
                start=0;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        // System.out.println(subset("abc", ""));
        int []arr={1,2,2,3,3};
        System.out.println(DuplicateAvoidIterattive(arr));

    }
}
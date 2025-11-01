import java.util.ArrayList;

public class StringPermutation {
    public static void StringPermutat(String perm,String str){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<=perm.length();i++){
            String newperm=perm.substring(0, i)+str.charAt(0)+perm.substring(i,perm.length());
            StringPermutat(newperm, str.substring(1));
        }
    }


    // returning an ArrayList

    public static ArrayList<String> StringPermutat2(String perm,String str){
        if(str.length()==0){
            ArrayList<String> ar=new ArrayList<>();
            ar.add(perm);
            return ar;
        }
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<=perm.length();i++){
            String newperm=perm.substring(0, i)+str.charAt(0)+perm.substring(i,perm.length());
            ArrayList<String> interres=StringPermutat2(newperm, str.substring(1));
            res.addAll(interres);
        }
        return res;
    }

    // count the number

    public static int StringPermutat3(String perm,String str){
        if(str.length()==0){
            return 1;
        }
        int count=0;
        for(int i=0;i<=perm.length();i++){
            String newperm=perm.substring(0, i)+str.charAt(0)+perm.substring(i,perm.length());
            count+=StringPermutat3(newperm, str.substring(1));
            
        }
        return count;
    }

    public static void main(String[] args) {
        // StringPermutat("","abc");
        System.out.println(StringPermutat2("","abc"));;
        // System.out.println(StringPermutat3("","abcd"));;
    }
}

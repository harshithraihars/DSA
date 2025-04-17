import java.util.ArrayList;

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

    public static void main(String[] args) {
        System.out.println(subset("abc", ""));
    }
}
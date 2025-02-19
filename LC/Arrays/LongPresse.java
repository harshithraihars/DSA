public class LongPresse {
    public static boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int n1=name.length();
        int n2=typed.length();
        while(i<n1 && j<n2){
            int ncount=1;
            int tcount=1;
            while(i<n1-1 && name.charAt(i)==name.charAt(i+1)){
                ncount++;
                i++;
            }
            while(j<n2-1 && typed.charAt(j)==typed.charAt(j+1)){
                tcount++;
                j++;
            }
            if(i==n1-1 && j==n2-1 && name.charAt(i)!=typed.charAt(j)){
                return false;
            }
            if(tcount<ncount){
                return false;
            }
            i++;
            j++;
            tcount=1;
            ncount=1;
        }
        if(i==n1 && j==n2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="alex";
        String s2="aaleexa";
        System.out.println(isLongPressedName(s1, s2));
    }
}

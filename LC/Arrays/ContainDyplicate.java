import java.util.HashSet;

public class ContainDyplicate {
    public static boolean CheckDuplicate(int arr[]){
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return false;
            }
            set.add(arr[i]);
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1};
        System.out.println(CheckDuplicate(arr));
        
    }
}

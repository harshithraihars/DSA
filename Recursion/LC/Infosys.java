import java.util.HashSet;

public class Infosys {
    public static int getMax(int l,int r,int k,int arr[]){
        int sum=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=l;i<=r;i++){
            hs.add(arr[i]);
            sum+=arr[i];
        }
        if(sum>0 && hs.size()<=k){
            return sum;
        }
        return 0;
    }
    public static int getAnsw(int n,int k,int[] arr){
        int maximum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                maximum=Math.max(maximum,getMax(i,j,k,arr));
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        // int arr[]={1,2,2,3,2,3,5,1,2,1,1};
        int arr[]={1, 2, 3, 4, 5, 6};
        System.out.println(getAnsw(6,3, arr));
    }
}

import java.util.HashSet;

public class ProductOfArrayExceptSelf {
    public static int[] ProductArray(int arr[]){
        int leftprod=1,rightProd=1;
        int output[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            output[i]=leftprod;
            leftprod*=arr[i];
        }
        for(int i=arr.length-1;i>=0;i--){
            output[i]*=rightProd;
            rightProd*=arr[i];
        }
        for(int num:output){
            System.out.println(num+" ");
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        ProductArray(arr);
    }
}

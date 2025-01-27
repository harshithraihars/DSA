import java.util.Scanner;

public class LargestMember {
    public static int Largest(int arr[]){
        int big=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        return big;
    }
    public static int Largest2(int arr[]){
        int big=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        return big;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int large=Largest(arr);
        System.out.println("Largest ELemnt is "+large);
    }
}

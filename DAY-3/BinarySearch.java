import java.util.Scanner;

public class BinarySearch {
    public static int binary(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter teh target");
        int n=sc.nextInt();
        int res=binary(arr, n);
        if(res!=-1){
            System.out.println("FOund at "+res);
        }else{
            System.out.println("not found");

        }
    }
}

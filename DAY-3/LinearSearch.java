import java.util.Scanner;

public class LinearSearch{
    public static int Linear(int arr[],int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter teh target");
        int n=sc.nextInt();
        int res=Linear(arr, n);
        if(res!=-1){
            System.out.println("FOund at "+res);
        }else{
            System.out.println("not found");

        }
    }
}
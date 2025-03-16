public class Basics {
    public static int PrintDecreasing(int n){
        System.out.println(n);
        if(n==1){
            return 1;
        }else{
            return PrintDecreasing(n-1);
        }
    }
    public static void PrintIncreasing(int n){
        if (n==1) {
            System.out.println(1);
            return;
        }else{
            PrintIncreasing(n-1);
            System.out.println(n);
        }
    }
    public static int factorial(int n){
        if (n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int sumof(int n){
        if (n==1) {
            return 1;
        }
        return n+sumof(n-1);
    }

    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int fibo(int n){
        if(n==0 ||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4};
        PrintDecreasing(5);
        PrintIncreasing(5);
        System.out.println(factorial(5));
        System.out.println(sumof(5));
        System.out.println(isSorted(arr, 0));
        System.out.println(fibo(7));
    }
}

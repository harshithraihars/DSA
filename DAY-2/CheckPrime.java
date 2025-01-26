import java.util.Scanner;

// public class CheckPrime {
//     public static boolean checkPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<n;i++){
//             if(n%i==0) return false;
//         }
//         return true;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n=sc.nextInt();
//         System.out.println("The given number is prime "+checkPrime(n));
//     }
// }



public class CheckPrime {
    public static boolean checkPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The given number is prime "+checkPrime(n));
    }
}

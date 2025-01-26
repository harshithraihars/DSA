import java.util.Scanner;

public class Bionomial{
    public static int fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static int  bio(int n,int r){
        return (fact(n))/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        n=sc.nextInt();
        System.out.println("Enter the r");
        r=sc.nextInt();
        System.out.println("The bionomia coeffiecnt is "+bio(n,r));
    }
}
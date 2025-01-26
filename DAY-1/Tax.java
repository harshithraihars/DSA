import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter your Income");
        long income=sc.nextInt();
        long tax;
        if(income>1000000){
            tax=income/100*30;
        }else if(income>500000){
            tax=income/100*20;
        }else{
            tax=0;
        }
        System.out.println("The Tax is"+tax);
    }
}

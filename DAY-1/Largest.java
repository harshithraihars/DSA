import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10,b=30,c=30;
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=c){
            System.out.println(b);
        }else{
            System.out.println(c);

        }
    }
}

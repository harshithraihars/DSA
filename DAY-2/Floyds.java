public class Floyds {
    public static void Floyd(int number){
        int a=1;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyd(5);
    }
}

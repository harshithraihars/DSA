public class InvertRotateHalfPyramid {
    public static void pyramid(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                if(j>number-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pyramid2(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(4);
        pyramid2(10);
    }
}

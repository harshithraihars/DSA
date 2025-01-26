public class SolidRhombus {
    public static void Solid(int number){
        // not correct
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                if(j>=5-i && j<=9-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Apna(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Apna(4);
    }
}

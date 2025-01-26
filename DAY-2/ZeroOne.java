public class ZeroOne {
    public static void zeroone(int number){
        boolean turn=true;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                if(turn){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
                turn=!turn;
            }
            System.out.println();
        }
    }
    public static void zero_one(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one(5);
    }
}

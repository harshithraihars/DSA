public class InvertedHalf {
    public static void pyramid(int number){
        for(int i=0;i<number;i++){
            for(int j=0;j<number-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}

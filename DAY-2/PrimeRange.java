public class PrimeRange {
    public static void printPrime(int n){
        boolean check=true;
        for(int i=2;i<=n;i++){
            if(i==2){
                System.out.print(i+"\t");
            }else{
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        check=false;
                        break;
                    }
                }
                if(check){
                    System.out.print(i+"\t");
                }
                check=true;
            }
        }
    }
    public static void main(String[] args) {
        printPrime(10);
    }
}

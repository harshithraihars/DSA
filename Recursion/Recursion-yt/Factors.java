import java.util.ArrayList;

public class Factors {
    public static void printFactor(int n){
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i) ar.add(n/i);           
            }
        }
        for(int i=ar.size()-1;i>=0;i--){
            System.out.print(ar.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        printFactor(36);
    }
}

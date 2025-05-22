public class CountGoodNumbers {

    public static int prime[] = { 2, 3, 5, 7};

    public static int Solve(StringBuilder str, long n) {
        int possible=1;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                possible*=5;
            }else{
                possible*=4;
            }
        }
        return possible;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        System.out.println(Solve(str,4));
    }
}

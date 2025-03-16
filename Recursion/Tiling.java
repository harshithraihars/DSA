public class Tiling {
    public static int TilingProblem(int n){
        if(n==0 ||n==1){
            return 1;
        }
        int vertical=TilingProblem(n-1);
        int horizontal=TilingProblem(n-2);
        int totalways=vertical+horizontal;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(3));
    }
}

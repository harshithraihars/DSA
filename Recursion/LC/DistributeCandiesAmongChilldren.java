// answer not found need dp
public class DistributeCandiesAmongChilldren {
    public static long solve(int n,int limit,int count){
        if(count==3 && n==0){
            return 1;
        }
        if(count==3) return 0;
        long solutions=0;
        for(int i=0;i<=limit;i++){
            int remaining=n-i;
            if(limit*(3-count)>=remaining){
                solutions+=solve(remaining,limit,count+1);
            }
        }
        return solutions;
    }
    public static long distributeCandies(int n, int limit) {
        return solve(n,limit,0);
    }
    public static void main(String[] args) {
        System.out.println(distributeCandies(3, 3));;
    }
}

public class PerfectSquares {
    public static int find(int n,int currsum,int count){
        if(currsum==n){
            System.out.println(currsum);
            return count;
        }
        if(currsum>n){
            return 0;
        }
        for(int i=n/2;i>=0;i--){
            currsum+=i*i;
            int current_count=find(n, currsum, count+1);
            if(current_count!=0){
                return current_count;
            }
            currsum-=i*i;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(find(12, 0, 0));;
    }
}

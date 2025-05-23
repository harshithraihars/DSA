public class ArrangeCoins {
    public static int arrangeCoins(int n) {
        long left=0;
        long right=n;
        while(left<=right){
            long mid=left+(right-left)/2;
            long sum=(mid*(mid+1))/2;
            if(sum==n) return (int) mid;
            else if(sum<n){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return (int) right;
    }
    public static void main(String[] args) {
        arrangeCoins(8);
    }
}

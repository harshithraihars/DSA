public class Sqrt{
    public static int findsqrt(int n){
        int start=0;
        int end=n;
        int mid=0;
        while (start<=end) {
            mid=(start+end)/2;
            if (mid*mid==n) {
                return mid;
            }else if(mid*mid<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    public static void main(String args[]){
        System.out.println(findsqrt(12));
    }
}
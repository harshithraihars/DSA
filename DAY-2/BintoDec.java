public class BintoDec {
    public static void BintoDec(int n){
        int pow=0;
        double dec=0;
        int rem;
        while (n>0) {
            rem=n%10;
            dec=Math.pow(2,pow)*rem+dec;
            n=n/10;
            pow++;
        }
        System.out.println((int)dec);
    }
    public static void main(String[] args) {
        BintoDec(11110);
    }
}

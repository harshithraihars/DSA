public class GcdLcm {
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static int findSumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+findSumOfDigits(n/10);
    }
    
    public static int prodOfDigits(int n){
        if(n==0){
            return 1;
        }
        return n%10*prodOfDigits(n/10);
    }


    public static int RevreseNumber(int number,int reverse){
        if (number==0) {
            return reverse;
        }
        reverse=reverse*(int)(Math.pow(10,1))+number%10;
        return RevreseNumber(number/10,reverse);
    }
    
    public static int CountZeros(int number,int count){
        if(number==0){
            return count;
        }
        if(number%10==0) count+=1;
        return CountZeros(number/10, count);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
        System.out.println(findSumOfDigits(1342));
        System.out.println(prodOfDigits(555));
        System.out.println(RevreseNumber(123, 0));
        System.out.println(CountZeros(30204, 0));;
    }
}

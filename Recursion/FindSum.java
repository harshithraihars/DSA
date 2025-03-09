public class FindSum{
    public static int findSum(int num){
        if(num/10<=0){
            return num;
        }
        int sum=0;
        while (num>0) {
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return findSum(sum);
    }
    public static void main(String[] args) {
        System.out.println(findSum(93));
    }
}
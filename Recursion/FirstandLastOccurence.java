public class FirstandLastOccurence {
    public static int FirstOccurence(int arr[],int num,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==num){
            return i;
        }
        return FirstOccurence(arr, num, i+1);
    }
    public static int LastOccurence(int arr[],int num,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==num){
            return i;
        }
        return FirstOccurence(arr, num, i-1);
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        double halfpow=myPow(x,n/2);
        double fullpow=halfpow*halfpow;
        if(n%2!=0){
            fullpow*=x;
        }
        return fullpow;
    }

    public static int first=-1;
    public static int last=-1;

    public static void FindFirstAndLst(String str,int i,char Target){
        if(i==str.length()){
            System.out.println(first+" "+last);
            return;
        }
        if(str.charAt(i)==Target){
            if(first==-1){
                first=i;
            }
            last=i;
        }
        FindFirstAndLst(str, i+1, Target);
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};
        // System.out.println(FirstOccurence(arr, 4, 0));
        // System.out.println(LastOccurence(arr, 4, arr.length-1));

        System.out.println(power(2, 4));
        System.out.println(myPow(2, 5));
        FindFirstAndLst("helloe:eee",0,'e');
    }
}

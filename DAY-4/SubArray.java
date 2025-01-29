public class SubArray {
    public static void MinandMax(int arr[]){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
                sum=0;
            }
        }
        System.out.println("the minumm and maximum sum is "+min+" "+max);

    }
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }
    public static void PrefixSum(int arr[]){
        int sum;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        // find prefix sum
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(sum>max){
                    max=sum;
                }
            }
            
        }
        System.out.println("the maximum sum is "+max);
    }
    public static void kadaans(int arr[]){
        // in case all the numbers are negitive return smallest
        int csum=0,msum=0;
        // find prefix sum
        for(int i=0;i<arr.length;i++){
            csum+=arr[i];
            if(csum>msum){
                msum=csum;
            }if(csum<0){
                csum=0;
            }
        }
        System.out.println(msum);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2};
        // pairs(arr);
        // MinandMax(arr);
        PrefixSum(arr);
        kadaans(arr);
    }
}

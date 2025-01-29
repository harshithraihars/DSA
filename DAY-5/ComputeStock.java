public class ComputeStock{
    // public static int compute(int arr[]){
    //     int profit=0;
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             profit=Math.max(arr[j]-arr[i],profit);
    //         }
    //     }
    //     return profit;
    // }

    public static int compute(int arr[]){
        int profit=0;
        int buyPrice=Integer.MAX_VALUE;
        // arr[i] is the current price
        for(int i=0;i<arr.length-1;i++){
            if(buyPrice<arr[i]){
                profit=Math.max(profit,arr[i]-buyPrice);
            }else{
                buyPrice=arr[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int arr[]={5,5,5};
        System.out.println(compute(arr));
    }
}
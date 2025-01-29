public class WaterStore {
    public static int computeRain(int arr[]){
        int leftLimit[]=new int[arr.length];
        int rightlimit[]=new int[arr.length];
        leftLimit[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftLimit[i]=Math.max(leftLimit[i-1], arr[i]);
        }
        rightlimit[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightlimit[i]=Math.max(rightlimit[i+1], arr[i]);
        }
        
        int holding=0;
        for(int i=0;i<arr.length;i++){
            int cap=Math.min(leftLimit[i], rightlimit[i])-arr[i];
            holding+=cap;
        }
        return holding;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1};
        computeRain(arr);
    }
}

public class PlusOne {
    public static int[] addone(int arr[]){
       for(int i=arr.length-1;i>=0;i--){
        if(arr[i]<9){
            arr[i]++;
            return arr;
        }
        arr[i]=0;
       } 
       int narray[]=new int[arr.length+1];
       narray[0]=1;
       return narray;



    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        addone(arr);
    }
}

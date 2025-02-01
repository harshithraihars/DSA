public class MoveZero {
    public static void movezero(int arr[]){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                arr[k++]=arr[i];
            }
        }
        while (k < arr.length) {
            arr[k++] = 0;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        movezero(arr);
    }
}

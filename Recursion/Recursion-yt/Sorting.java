public class Sorting {
    public static void bubbleSort(int arr[],int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSort(arr, row, col+1);
        }else{
            bubbleSort(arr, row-1,0);
        }
    }
    public static void SelectionSort(int arr[],int row,int col,int max){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[max]<arr[col]) max=col;
            SelectionSort(arr, row, col+1, max);
        }else{
            int temp=arr[row-1];
            arr[row-1]=arr[max];
            arr[max]=temp;
            SelectionSort(arr, row-1,0,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,3,1};
        bubbleSort(arr, arr.length-1, 0);
        // SelectionSort(arr, 4, 0,0);
        for(int num:arr){
            System.out.println(num);
        }
    }
}

import java.util.Arrays;

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


    public static int[] MergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=MergeSort(Arrays.copyOfRange(arr,0, mid));
        int right[]=MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return Merge(left,right);
    }

    public static int[] Merge(int left[],int right[]){
        int i=0,j=0,k=0;
        int newarr[]=new int[left.length+right.length];
        while (i<left.length && j<right.length) {
            if(left[i]<right[j]){
                newarr[k++]=left[i];
                i++;
            }else{
                newarr[k++]=right[j];
                j++;
            }
        }

        while (i<left.length) {
            newarr[k++]=left[i];
            i++;
        }
        while (j<right.length) {
            newarr[k++]=right[j];
            j++;
        }

        return newarr;
    }


    public static void Quick(int arr[],int low,int high){
        if(low>=high) return;
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while (s<=e) {
            while (arr[s]<pivot) {
                s++;
            }
            while (arr[e]>pivot) {
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;k
                s++;
                e--;
            }
        }
        Quick(arr, low,e);
        Quick(arr,s, high);
    }
    
    public static void MergeSortInPlace(int arr[],int start,int end){
        if(end-start==1){
            return;
        }
        int mid=start+(end-start)/2;
        MergeSortInPlace(arr, start,mid);
        MergeSortInPlace(arr, mid,end);
        MergeInplace(arr,start,mid,end);
    }

    public static void MergeInplace(int[] arr,int start,int mid,int end){
        int i=start,j=mid,k=0;
        int newarr[]=new int[end-start];
        while (i<mid &&j<end) {
            if(arr[i]<arr[j]){
                newarr[k++]=arr[i];
                i++;
            }else{
                newarr[k++]=arr[j];
                j++;
            }
        }

        while (i<mid) {
            newarr[k++]=arr[i];
            i++;
        }
        while (j<end) {
            newarr[k++]=arr[j];
            j++;
        }

        for(k=0;k<newarr.length;k++){
            arr[start+k]=newarr[k];
        }
    }



    public static void main(String[] args) {
        int arr[]={4,2,3,9,6,8,1};
        // bubbleSort(arr, arr.length-1, 0);
        // SelectionSort(arr, 4, 0,0);

        // int [] res=MergeSort(arr);
        // MergeSortInPlace(arr, 0, arr.length);
        Quick(arr, 0, arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

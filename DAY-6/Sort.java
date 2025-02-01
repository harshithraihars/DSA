public class Sort{
    public static void CountSort(int arr[]){
        int maxval=Integer.MIN_VALUE;
        // finding the maximum value
        for(int i=0;i<arr.length;i++){
           maxval=Math.max(arr[i], maxval);
        }
        int count[]=new int[maxval];
        // its like if the element is 2 at 2th index we make the count+1
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        // from the left side untill its count is 0 you append the index to the original array
        for(int i=0;i<count.length;i++){
            while (arr[i]>0) {
                arr[j]=i;
                arr[i]--;
                j++;
            }
        }
    }

    public static void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
           int temp=arr[i];
           int prev=i-1;
        //    do it untill it gets its correct index
           while (prev>=0 && arr[prev]>temp) {
            arr[prev+1]=arr[prev];
            prev--;
           }
           arr[prev+1]=temp;
        }
    }

    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[minIndex]>arr[j]){
                // finding the minimum value and getting that index
                minIndex=j;
               }
            }
            // swapping the minimum value index and ith index
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void Bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            // check already sortd
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        // int arr[]={5,4,1,3,2};
        int arr[]={1,4,1,3,2,4,3,7};
        // Bubble(arr);
        // Selection(arr);
        Insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
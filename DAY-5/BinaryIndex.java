public class BinaryIndex {
    public static int Binary(int arr[], int elem, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == elem) {
                return mid;
            }
            if (arr[mid] > elem) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int FindIndex(int arr[], int elem) {
        int cuttingIndex = min(arr);
        if (elem >= arr[0] && elem <= arr[cuttingIndex - 1]) {
            return Binary(arr, elem, 0, cuttingIndex - 1);
        } else {
            return Binary(arr, elem, cuttingIndex, arr.length - 1);
        }
    }

    public static int min(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left<right) {
            int mid=(left+right)/2;
            if(mid>0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[left]<=arr[mid] && arr[mid]>arr[right]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(FindIndex(arr, 0)); // Expected Output: 4
    }
}


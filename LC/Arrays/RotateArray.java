public class RotateArray {
    public static void reverse(int left,int right,int arr[]){
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void Rotate(int arr[], int k) {
        System.out.println(arr.length-1);
        reverse(0, arr.length-1, arr);
        
        reverse(0, k-1, arr);
        
        if(k<arr.length-1){
            reverse(k, arr.length-1, arr);
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;
        Rotate(nums, k);
    }
}

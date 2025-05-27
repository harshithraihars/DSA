public class Duplicate {
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+1) {
                if (arr[arr[i] - 1] != arr[i]) {
                    int temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                }else{
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}

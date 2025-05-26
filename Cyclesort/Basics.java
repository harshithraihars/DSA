public class Basics {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 2, 4 };
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-1!=i) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int num : arr) {
            System.out.print(num + "\t");
        }
    }
}

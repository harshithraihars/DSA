public class Assign2D {
    // number of 7 s in 2D array
    public static int numberof7(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    // sum of numbers in the second array
    public static void sumof2ndrow(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[1][i];
        }
        System.out.println(sum);
    }
    
    public static void Transpose(int arr[][]) {
        int newarr[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newarr[j][i] = arr[i][j];
            }
        }
        printarr(arr);
        printarr(newarr);
    }
    public static void printarr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int arr[][]={
        // {4,7,8},
        // {8,8,7}
        // };
        // System.out.println(numberof7(arr));

        // int arr[][] = {
        //         { 1, 4, 9 },
        //         { 11, 4, 3 },
        //         { 2, 2, 3 }
        // };
        // sumof2ndrow(arr);


        int arr[][] = {
            { 1,2,3},
            { 4,5,6 },
            { 7,8,9 }
    };
    Transpose(arr);
    }
}

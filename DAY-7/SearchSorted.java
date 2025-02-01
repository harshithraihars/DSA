public class SearchSorted {
    public static void SerachSorted(int matrix[][],int target){
        int row=0;
        int col=matrix[0].length-1;;
        while (row<matrix.length && col>=0) {
            if(matrix[row][col]==target){
                System.out.println("element found at index "+row+" "+col);
                return;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        System.out.println("not found");
    }
    public static void SerachSorted2(int matrix[][],int target){
        int row=matrix.length-1;;
        int col=0;
        while (col<matrix[0].length && row>=0) {
            if(matrix[row][col]==target){
                System.out.println("element found at index "+row+" "+col);
                return;
            }else if(target>matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        int mat[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        SerachSorted2(mat,30);
    }
}

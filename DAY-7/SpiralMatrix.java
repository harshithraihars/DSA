public class SpiralMatrix{
    public static void spiral(int matrix[][]){
        int nmat[]=new int[matrix.length*matrix[0].length];
        int k=0;
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while (startRow<=endRow && startCol<=endCol) {
            for(int j=startCol;j<=endCol;j++){
                // System.out.print(matrix[startRow][j]+" ");
                nmat[k]=matrix[startRow][j];
                k++;
            }
            for(int i=startRow+1;i<=endRow;i++){
                // System.out.print(matrix[i][endCol]+" ");
                nmat[k]=matrix[i][endCol];
                k++;
            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                nmat[k]=matrix[endRow][j];
                k++;
                // System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endCol-1;i>=startCol+1;i--){
                if(startCol==endCol){
                    break;
                }
                nmat[k]=matrix[i][startCol];
                k++;
                // System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        for(int i=0;i<nmat.length;i++){
            System.out.print(nmat[i]+" ");
        }
    }
    public static void main(String args[]){
        int mat[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spiral(mat);
    }
}
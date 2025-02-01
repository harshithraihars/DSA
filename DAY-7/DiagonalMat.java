public class DiagonalMat {
    public static void Diagonal(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i+i!=matrix.length-1){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
            int mat[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9},
            };
            Diagonal(mat);
    }
}

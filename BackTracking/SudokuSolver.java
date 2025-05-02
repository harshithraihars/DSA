public class SudokuSolver {
    public static boolean Solve(int board[][]){
        int row=-1;
        int col=-1;
        boolean isEmpty=true;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    isEmpty=false;
                    break;
                }
                
            }
            // if(isEmpty==false){
            //     break;
            // }
        }
        if(isEmpty){
            // you have forund the answer
            return true;
        }
        for(int number=1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
                if(Solve(board)){
                    return true;
                }
                else{
                    board[row][col]=0;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int board[][],int row,int col,int num){
        // check individual row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        // for(int nums[]: board){
        //     if(nums[col]==num){
        //         return false;
        //     }
        // }
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        int sqrt=(int) Math.sqrt(board.length);
        int rstart=row-row%sqrt;
        int cstart=col-col%sqrt;
        for(int i=rstart;i<rstart+sqrt;i++){
            for(int j=cstart;j<cstart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(Solve(board)){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

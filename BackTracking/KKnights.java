public class KKnights {
    public static void printBoard(boolean board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]) System.out.print("X"+"\t");
                else System.out.print("O"+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Knights(boolean board[][],int row,int col,int knights){
        if(knights==0){
            printBoard(board);
            return;
        }
        if(row==board.length-1 && col==board.length){
            return;
        }

        if(col==board.length){
            Knights(board, row+1,0, knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            Knights(board, row, col+1, knights-1);
            board[row][col]=false;
        }
        Knights(board, row, col+1, knights);

    }
    public static boolean isSafe(boolean board[][],int row,int col){

        if(isvalid(board, row-2, col-1)){
            if(board[row-2][col-1]) return false;
        }
        if(isvalid(board, row-2, col+1)){
            if(board[row-2][col+1]) return false;
        }
        if(isvalid(board, row-1, col-2)){
            if(board[row-1][col-2]) return false;
        }
        if(isvalid(board, row-1, col+2)){
            if(board[row-1][col+2]) return false;
        }

        return true;
    }

    public static boolean isvalid(boolean board[][],int row,int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        boolean board[][]=new boolean[4][4];
        Knights(board, 0, 0, 4);
    }
}

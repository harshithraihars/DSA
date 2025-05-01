public class Nqueens{
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

    public static boolean isSafe(boolean board[][],int row,int col){
        // vertical
        for(int i=0;i<row;i++){
            if(board[i][col]) return false;
        }
        // left diagonal

        int leftmax=Math.min(row, col);
        for(int i=1;i<=leftmax;i++){
            if(board[row-i][col-i]) return false;
        }

        // right diagonal
        int rightmax=Math.min(row,board.length-col-1);
        for(int i=1;i<=rightmax;i++){
            if(board[row-i][col+i]) return false;
        }

        return true;
    }
    public static int Queens(boolean board[][],int row){
        if(row==board.length){
            printBoard(board);
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=Queens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    public static void main(String args[]){
        boolean board[][]=new boolean[4][4];
        System.out.println(Queens(board,0));;
    }
}
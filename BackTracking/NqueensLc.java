import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NqueensLc {
    public static boolean isSafe(char board[][],int row,int col){
        // vertical
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        // left diagonal

        int leftmax=Math.min(row, col);
        for(int i=1;i<=leftmax;i++){
            if(board[row-i][col-i]=='Q') return false;
        }

        // right diagonal
        int rightmax=Math.min(row,board.length-col-1);
        for(int i=1;i<=rightmax;i++){
            if(board[row-i][col+i]=='Q') return false;
        }

        return true;
    }
    public static List<List<String>> Queens(char[][] board,int row){
        List<List<String>> output=new ArrayList<>();
        if(row==board.length){
            List<String> ans=new ArrayList<>();
            for(char[] rows:board){
                ans.add(new String(rows));
            }
            output.add(ans);
            return output;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                output.addAll(Queens(board, row+1));
                board[row][col]='.';
            }
        }
        return output;
    }
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        return Queens(board, 0);
    }

    public static void main(String[] args) {
        List<List<String>> ans=solveNQueens(4);
        for(List i:ans){
            System.out.println(i.toString());
        }
    }
}

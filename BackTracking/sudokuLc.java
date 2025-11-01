public class sudokuLc {
    public static boolean Solve(char board[][]){
        int row=-1;
        int col=-1;
        boolean isEmpty=true;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    row=i;
                    col=j;
                    isEmpty=false;
                    break;
                }
                
            }
            if(isEmpty==false){
                break;
            }
        }
        if(isEmpty){
            // you have forund the answer
            return true;
        }
        for(int number=1;number<=9;number++){
            char dig=(char) ('0'+number);
            if(isSafe(board,row,col,dig)){
                board[row][col]=dig;
                if(Solve(board)){
                    return true;
                }
                else{
                    board[row][col]='.';
                }
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][],int row,int col,char num){
        // check individual row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
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
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
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

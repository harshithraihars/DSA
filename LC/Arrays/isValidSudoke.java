
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class isValidSudoke {
    public static boolean checkSudoku(char[][] board){
        HashSet<String> hs=new HashSet<>();
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                char cellvalue=board[row][col];
                if(cellvalue != '.'){
                    int boxnumber=(row/3)*3+(col/3);

                    if(!hs.add("row"+row+cellvalue) ||!hs.add("col"+col+cellvalue)|| !hs.add("box"+boxnumber+cellvalue)){
                        return false;
                    }
                }
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char board[][]={{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(checkSudoku(board));
    }
}

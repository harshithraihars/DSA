public class wordSearch {
    public static boolean isValid(char[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
            return true;
        }
        return false;
    }

    public static boolean found(char[][] board, String word, int i, int row, int col) {
        if (i == word.length())
            return true;

        if (isValid(board, row, col - 1)) {
            if (board[row][col - 1] == word.charAt(i)) {
                char currchar = board[row][col - 1];
                board[row][col - 1] = '.';
                if (found(board, word, i + 1, row, col - 1))
                    return true;
                board[row][col - 1] = currchar;
            }
        }

        if (isValid(board, row, col + 1)) {
            if (board[row][col + 1] == word.charAt(i)) {
                char currchar = board[row][col + 1];
                board[row][col + 1] = '.';
                if (found(board, word, i + 1, row, col + 1))
                    return true;
                board[row][col + 1] = currchar;
            }
        }
        if (isValid(board, row - 1, col)) {
            if (board[row - 1][col] == word.charAt(i)) {
                char currchar = board[row - 1][col];
                board[row - 1][col] = '.';
                if (found(board, word, i + 1, row - 1, col))
                    return true;
                board[row - 1][col] = currchar;
            }
        }
        if (isValid(board, row + 1, col)) {
            if (board[row + 1][col] == word.charAt(i)) {
                char currchar = board[row + 1][col];
                board[row + 1][col] = '.';
                if (found(board, word, i + 1, row + 1, col))
                    return true;
                board[row + 1][col] = currchar;
            }
        }
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    char temp = board[i][j];
                    board[i][j] = '.'; // mark as visited
                    if (found(board, word, 1, i, j))
                        return true;
                    board[i][j] = temp;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        System.out.println(exist(board, "ABCB"));
    }
}

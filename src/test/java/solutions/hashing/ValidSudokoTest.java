package solutions.hashing;

import org.junit.jupiter.api.Test;

import static solutions.hashing.ValidSudoko.isValidSudoku;

public class ValidSudokoTest {
    @Test
    public void nullBoard() {
        char[][] board = null;
        boolean result = isValidSudoku(board);
        assert !result;
    }

    @Test
    public void incompleteRowBoard() {
        char[][] board = new char[8][];
        boolean result = isValidSudoku(board);
        assert !result;
    }

    @Test
    public void incompleteColumnBoard() {
        char[][] board = new char[9][];

        board[0] = new char[] {'5', '3', '.', '.', '7', '.', '.', '.', '.'};
        board[1] = new char[] {'6', '7', '.', '1', '9', '5', '.', '.', '.'};
        board[2] = new char[] {'.', '9', '8', '.', '.', '.', '.', '6', '.'};
        board[3] = new char[] {'8', '6', '.', '.', '6', '.', '.', '.', '3'};
        board[4] = new char[] {'4', '8', '.', '8', '.', '3', '.', '.', '1'};
        board[5] = new char[] {'7', '2', '.', '.', '2', '.', '.', '.', '6'};
        board[6] = new char[] {'.', '6', '.', '.', '.', '.', '2', '8', '.'};
        board[7] = new char[] {'.', '4', '.', '4', '1', '9', '.', '.', '5'};
        board[8] = new char[] {'.', '.', '.', '8', '.', '.', '7', '9'};

        boolean result = isValidSudoku(board);
        assert !result;
    }

    @Test
    public void noDuplicates() {
        char[][] board = new char[9][];

        board[0] = new char[] {'5', '3', '.', '.', '7', '.', '.', '.', '.'};
        board[1] = new char[] {'6', '7', '.', '1', '9', '5', '.', '.', '.'};
        board[2] = new char[] {'.', '9', '8', '.', '.', '.', '.', '6', '.'};
        board[3] = new char[] {'8', '6', '.', '.', '6', '.', '.', '.', '3'};
        board[4] = new char[] {'4', '8', '.', '8', '.', '3', '.', '.', '1'};
        board[5] = new char[] {'7', '2', '.', '.', '2', '.', '.', '.', '6'};
        board[6] = new char[] {'.', '6', '.', '.', '.', '.', '2', '8', '.'};
        board[7] = new char[] {'.', '4', '.', '4', '1', '9', '.', '.', '5'};
        board[8] = new char[] {'.', '.', '.', '8', '.', '.', '7', '9'};

        boolean result = isValidSudoku(board);
        assert result;
    }

    @Test
    public void duplicates() {
        char[][] board = new char[9][];

        board[0] = new char[] {'5', '3', '.', '.', '7', '.', '.', '.', '.'};
        board[1] = new char[] {'6', '7', '.', '1', '9', '5', '.', '.', '.'};
        board[2] = new char[] {'.', '9', '8', '.', '.', '.', '.', '6', '.'};
        board[3] = new char[] {'8', '6', '.', '.', '6', '.', '.', '.', '3'};
        board[4] = new char[] {'4', '8', '.', '8', '.', '3', '.', '.', '1'};
        board[5] = new char[] {'7', '2', '.', '.', '2', '.', '.', '.', '6'};
        board[6] = new char[] {'.', '6', '.', '.', '.', '.', '6', '8', '.'};
        board[7] = new char[] {'.', '4', '.', '4', '1', '9', '.', '.', '5'};
        board[8] = new char[] {'.', '.', '.', '8', '.', '.', '7', '9', '.'};

        boolean result = isValidSudoku(board);
        assert !result;
    }
}

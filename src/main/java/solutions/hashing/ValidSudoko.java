package solutions.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoko {
    public static boolean isValidSudoku(char[][] board) {

        if (board == null || board.length != 9) {
            return false;
        }

        List<Set<Character>> rowSet = new ArrayList<>();
        List<Set<Character>> colSet = new ArrayList<>();
        List<Set<Character>> subGrid = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rowSet.add(new HashSet<>());
            colSet.add(new HashSet<>());
            subGrid.add(new HashSet<>());
        }

        for (int row = 0; row < board.length; row++) {
            if (board[row].length != 9) return false;
            for (int col = 0; col < board[row].length; col++) {
                char currVal = board[row][col];
                int gridNo = ((row / 3) * 3 + (col / 3));
                // System.out.println("row:" + row + " col:" + col + " grid:" + gridNo + " val:" + currVal);
                if (currVal != '.') {
                    if (rowSet.get(row).contains(currVal) ||
                            colSet.get(col).contains(currVal) ||
                            subGrid.get(gridNo).contains(currVal)) {
                        System.out.println("Duplicate: " + currVal);
                        return false;
                    } else {
                        rowSet.get(row).add(currVal);
                        colSet.get(col).add(currVal);
                        subGrid.get(gridNo).add(currVal);
                    }
                }
            }
        }

        return true;
    }
}

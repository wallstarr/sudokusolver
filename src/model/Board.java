package model;


import java.awt.event.KeyEvent;
import java.util.ArrayList;

import Controller.Controller;


// Represents a Sudoku game
public class Board {

    private ArrayList<Integer> board;

    public static final int WIDTH_DIMENSION = 900;
    public static final int HEIGHT_DIMENSION = 540;

    private int selected;

    // initializes a board such that board.size() == 81
    public Board() {
        board = new ArrayList<Integer>(81);
        for (int t = 0; t < 81; t++) {
            board.add(null);
        }
    }


    public static int[][] rows = {{0, 1, 2, 3, 4, 5, 6, 7, 8},
            {9, 10, 11, 12, 13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22, 23, 24, 25, 26},
            {27, 28, 29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42, 43, 44},
            {45, 46, 47, 48, 49, 50, 51, 52, 53},
            {54, 55, 56, 57, 58, 59, 60, 61, 62},
            {63, 64, 65, 66, 67, 68, 69, 70, 71},
            {72, 73, 74, 75, 76, 77, 78, 79, 80}};

    public static int[][] columns = {{0, 9, 18, 27, 36, 45, 54, 63, 72},
            {1, 10, 19, 28, 37, 46, 55, 64, 73},
            {2, 11, 20, 29, 38, 47, 56, 65, 74},
            {3, 12, 21, 30, 39, 48, 57, 66, 75},
            {4, 13, 22, 31, 40, 49, 58, 67, 76},
            {5, 14, 23, 32, 41, 50, 59, 68, 77},
            {6, 15, 24, 33, 42, 51, 60, 69, 78},
            {7, 16, 25, 34, 43, 52, 61, 70, 79},
            {8, 17, 26, 35, 44, 53, 62, 71, 80}};

    public static int[][] boxes = {{0, 1, 2, 9, 10, 11, 18, 19, 20},
            {3, 4, 5, 12, 13, 14, 21, 22, 23},
            {6, 7, 8, 15, 16, 17, 24, 25, 26},
            {27, 28, 29, 36, 37, 38, 45, 46, 47},
            {30, 31, 32, 39, 40, 41, 48, 49, 50},
            {33, 34, 35, 42, 43, 44, 51, 52, 53},
            {54, 55, 56, 63, 64, 65, 72, 73, 74},
            {57, 58, 59, 66, 67, 68, 75, 76, 77},
            {60, 61, 62, 69, 70, 71, 78, 79, 80}};


    // MODIFIES: this
    // EFFECTS: "selected" value is assigned to value i
    public void selectBoardPosition(int i) {
        selected = i;
    }

    public void keyPressed(int key) {
        if (key == KeyEvent.VK_C) {
            clear();
        }
    }


    public void clear() {
        board = new ArrayList<Integer>(81);
        for (int t = 0; t < 81; t++) {
            board.add(null);
        }
        selected = -1;
    }

    // setter for board
    public void setBoard(int index, Integer val) {
        board.set(index, val);
    }

    // getter for board
    public int getValOnBoard(int index){
        return board.get(index);
    }

    public ArrayList<Integer> getBoard() {
        return board;
    }


    // EFFECTS: checks if board is solved, else moves on to the sub-boards
    public Board solveOneBoard() {
        Controller.board = this;
        if (solvedBoard()) {
            return this;
        } else {
            return solveListOfBoard(nextValidBoards());
        }
    }


    // EFFECTS: goes through list of boards, backtracks if nextBoards.isEmpty()
    public Board solveListOfBoard(ArrayList<Board> nextBoards) {
        if (nextBoards.isEmpty()) {
            return new Board();
        } else {
            Board first = nextBoards.get(0).solveOneBoard();
            if (first.passedBoard()) {
                return first;
            } else {
                nextBoards.remove(0);
                return solveListOfBoard(nextBoards);
            }
        }
    }

    // EFFECTS: returns true if solvedBoard() == true
    public boolean passedBoard() {
        boolean failState = solvedBoard();
        return failState;
    }


    // REQUIRES: board.size() == 81
    // EFFECTS: returns true if board is valid, false otherwise
    public boolean checkBoardValidity() {
        boolean validRows = checkBoardOnTwoDimensionalArray(rows);
        boolean validColumns = checkBoardOnTwoDimensionalArray(columns);
        boolean validBoxes = checkBoardOnTwoDimensionalArray(boxes);
        boolean validity = validRows && validColumns && validBoxes;
        return validity;
    }

    // REQUIRES: arr MUST be one of rows, columns, or boxes for it to mean anything
    // EFFECTS: returns true if the board is valid for arr
    public boolean checkBoardOnTwoDimensionalArray(int[][] arr) {
        for (int[] a: arr) {
            ArrayList oneToNine = new ArrayList<Integer>(9);
            for (int e = 0; e < 9; e++) {
                oneToNine.add(e+1);
            }
            for (int i: a) {
                if (board.get(i) == null) {                      // if number does not exist on board
                    continue;
                } else if (! oneToNine.contains(board.get(i))) { // if number has already been removed
                    return false;
                } else {                                         // if number has not been removed
                    oneToNine.remove(board.get(i));
                }
            }
        }
        return true;
    }

    // REQUIRES: solvedBoard() == false
    // EFFECTS: filters through nextBoardsOneToNine() using checkBoardValidity()
    public ArrayList<Board> nextValidBoards() {
        ArrayList<Board> boards = nextBoardsOneToNine();
        ArrayList<Board> toBeRemoved = new ArrayList<Board>();
        for (int t = 0; t < 9; t++) {
            if (! boards.get(t).checkBoardValidity()) {
                toBeRemoved.add(boards.get(t));
            } else continue;
        }
        for (Board bo: toBeRemoved) {
            boards.remove(bo);
        }
        return boards;
    }


    // REQUIRES: solvedBoard() == false
    // EFFECTS: returns a list of 9 sub boards, where the position at findNullSpot() will have 1-9
    public ArrayList<Board> nextBoardsOneToNine() {
        ArrayList<Board> boardsOneToNine = new ArrayList<Board>(9);
        for (int i = 0; i < 9; i++) {
            boardsOneToNine.add(createNewBoard(i+1));
        }
        return boardsOneToNine;
    }

    // REQUIRES: solvedBoard() == false
    // EFFECTS: returns a new board that has the same board except with num in
    //          place of null at findNullSpot()
    private Board createNewBoard(int num) {
        Board newBoard = new Board();
        for (int t = 0; t < 81; t++) {
            if (board.get(t) == null) continue;
            else newBoard.setBoard(t, board.get(t));
        }
        newBoard.setBoard(findNullSpot(), num);
        return newBoard;
    }

    // EFFECTS: returns the next available (null) spot on the board
    public int findNullSpot() {
        for (int p = 0; p < 81; p++) {
            if (board.get(p) == null) {
                return p;
            } else continue;
        }
        return -1;
    }

    // EFFECTS: returns false is there is a null element on the board
    public boolean solvedBoard() {
        return ! board.contains(null);
    }

    // EFFECTS: returns the number value before findNullSpot()
    // note: purely for testing purposes
    public int lastNumberInBoard() {
        if (findNullSpot() == 0) {
            return 0;
        } else return board.get(findNullSpot() - 1);
    }
}

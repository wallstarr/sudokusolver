package tests;

import model.Board;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class BoardTests {

    Board initial;

    @Before // setup
    public void setup() {
        initial = new Board();
    }

    @Test // checks for when the rows are valid, columns/boxes don't matter
    public void testValidityCheckerWhenValidRows() {
        initial.setBoard(0, 3);
        initial.setBoard(1, 4);
        initial.setBoard(2, 2);
        initial.setBoard(9, 4);
        initial.setBoard(10, 5);
        initial.setBoard(71, 9);
        initial.setBoard(79, 9);
        initial.setBoard(80, 8);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.rows));
    }

    @Test // checks for when the columns are valid, rows/boxes don't matter
    public void testValidityCheckerWhenValidColumns() {
        initial.setBoard(0, 3);
        initial.setBoard(9, 4);
        initial.setBoard(18, 2);
        initial.setBoard(35, 2);
        initial.setBoard(53, 3);
        initial.setBoard(4, 1);
        initial.setBoard(76, 2);
        initial.setBoard(80, 9);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.columns));
    }

    @Test // checks for when the columns are valid, rows/boxes don't matter
    public void testValidityCheckerWhenValidBoxes() {
        initial.setBoard(2, 5);
        initial.setBoard(20, 6);
        initial.setBoard(3, 2);
        initial.setBoard(21, 5);
        initial.setBoard(60, 2);
        initial.setBoard(61, 1);
        initial.setBoard(62, 9);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.boxes));
    }

    @Test // checks for when the rows are invalid, columns/boxes don't matter
    public void testValidityCheckerWhenInvalidRows() {
        initial.setBoard(0, 3);
        initial.setBoard(1, 4);
        initial.setBoard(2, 2);
        initial.setBoard(9, 4);
        initial.setBoard(10, 5);
        initial.setBoard(79, 9);
        initial.setBoard(80, 8);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.rows));
        initial.setBoard(74, 8);
        assertFalse(initial.checkBoardOnTwoDimensionalArray(Board.rows));
    }

    @Test // checks for when the columns are invalid, rows/boxes don't matter
    public void testValidityCheckerWhenInvalidColumns() {
        initial.setBoard(0, 3);
        initial.setBoard(9, 4);
        initial.setBoard(18, 2);
        initial.setBoard(35, 2);
        initial.setBoard(53, 3);
        initial.setBoard(4, 1);
        initial.setBoard(76, 2);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.columns));
        initial.setBoard(67, 2);
        assertFalse(initial.checkBoardOnTwoDimensionalArray(Board.columns));
    }

    @Test // checks for when the boxes are invalid, rows/columns don't matter
    public void testValidityCheckerWhenInvalidBoxes() {
        initial.setBoard(2, 5);
        initial.setBoard(20, 6);
        initial.setBoard(3, 2);
        initial.setBoard(21, 5);
        initial.setBoard(60, 2);
        initial.setBoard(61, 1);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.boxes));
        initial.setBoard(80, 1);
        assertFalse(initial.checkBoardOnTwoDimensionalArray(Board.boxes));
        initial.setBoard(80, 3);
        initial.setBoard(77, 6);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.boxes));
        initial.setBoard(57, 6);
        assertFalse(initial.checkBoardOnTwoDimensionalArray(Board.boxes));
        initial.setBoard(57, 5);
        initial.setBoard(56, 6);
        assertTrue(initial.checkBoardOnTwoDimensionalArray(Board.boxes));
    }

    @Test // tests if the board is solved function
    public void testSolvedBoard() {
        assertFalse(initial.solvedBoard());
        for (int t = 0; t < 80; t++) {
            initial.setBoard(t, 0);
            assertFalse(initial.solvedBoard());
        }
        initial.setBoard(80, 0);
        assertTrue(initial.solvedBoard());
    }

    @Test
    public void testFindNullSpot() {
        assertEquals(0, initial.findNullSpot());
        initial.setBoard(0, 1);
        initial.setBoard(1, 4);
        assertEquals(2, initial.findNullSpot());
        for (int t = 0; t < 78; t++) {
            initial.setBoard(t + 2, 3);
        }
        assertEquals(80, initial.findNullSpot());
        initial.setBoard(80, 5);
        assertEquals(-1, initial.findNullSpot());
    }

    @Test
    public void testNextBoardsOneToNine() {
        assertEquals(initial.findNullSpot(), 0);
        ArrayList<Board> nextBoards = initial.nextBoardsOneToNine();
        assertEquals(9, nextBoards.size());
        assertEquals(1, nextBoards.get(0).findNullSpot());
        assertEquals(1, nextBoards.get(0).lastNumberInBoard());
        assertEquals(5, nextBoards.get(4).lastNumberInBoard());
        assertEquals(9, nextBoards.get(8).lastNumberInBoard());
    }

    @Test
    public void testNextValidBoards() {
        initial.setBoard(0, 5);
        initial.setBoard(1, 9);
        initial.setBoard(2, 3);
        initial.setBoard(8, 6);
        initial.setBoard(12, 3);
        initial.setBoard(13, 1);
        initial.setBoard(14, 2);
        initial.setBoard(57, 7);
        initial.setBoard(75, 4);
        ArrayList<Board> nextBoards = initial.nextValidBoards();
        assertEquals(initial.findNullSpot(), 3);
        assertEquals(1, nextBoards.size());
        assertEquals(8, nextBoards.get(0).getValOnBoard(3));
    }

    @Test
    public void testSolverEasy() {
        initial.setBoard(0, 4);
        initial.setBoard(3, 5);
        initial.setBoard(4, 1);
        initial.setBoard(6, 3);
        initial.setBoard(8, 2);
        initial.setBoard(9, 9);
        initial.setBoard(12, 2);
        initial.setBoard(15, 6);
        initial.setBoard(16, 8);
        initial.setBoard(19, 3);
        initial.setBoard(20, 7);
        initial.setBoard(21, 4);
        initial.setBoard(24, 1);
        initial.setBoard(28, 7);
        initial.setBoard(30, 1);
        initial.setBoard(31, 8);
        initial.setBoard(34, 2);
        initial.setBoard(35, 5);
        initial.setBoard(38, 5);
        initial.setBoard(39, 9);
        initial.setBoard(41, 6);
        initial.setBoard(43, 3);
        initial.setBoard(45, 8);
        initial.setBoard(46, 2);
        initial.setBoard(49, 7);
        initial.setBoard(51, 4);
        initial.setBoard(53, 1);
        initial.setBoard(55, 1);
        initial.setBoard(56, 6);
        initial.setBoard(57, 8);
        initial.setBoard(58, 9);
        initial.setBoard(60, 5);
        initial.setBoard(64, 9);
        initial.setBoard(67, 4);
        initial.setBoard(68, 3);
        initial.setBoard(71, 7);
        initial.setBoard(72, 3);
        initial.setBoard(73, 8);
        initial.setBoard(79, 9);

        ArrayList<Integer> solution = new ArrayList<Integer>(81);

        solution.add(4);
        solution.add(6);
        solution.add(8);
        solution.add(5);
        solution.add(1);
        solution.add(9);
        solution.add(3);
        solution.add(7);
        solution.add(2);
        solution.add(9);
        solution.add(5);
        solution.add(1);
        solution.add(2);
        solution.add(3);
        solution.add(7);
        solution.add(6);
        solution.add(8);
        solution.add(4);
        solution.add(2);
        solution.add(3);
        solution.add(7);
        solution.add(4);
        solution.add(6);
        solution.add(8);
        solution.add(1);
        solution.add(5);
        solution.add(9);

        solution.add(6);
        solution.add(7);
        solution.add(3);
        solution.add(1);
        solution.add(8);
        solution.add(4);
        solution.add(9);
        solution.add(2);
        solution.add(5);
        solution.add(1);
        solution.add(4);
        solution.add(5);
        solution.add(9);
        solution.add(2);
        solution.add(6);
        solution.add(7);
        solution.add(3);
        solution.add(8);
        solution.add(8);
        solution.add(2);
        solution.add(9);
        solution.add(3);
        solution.add(7);
        solution.add(5);
        solution.add(4);
        solution.add(6);
        solution.add(1);

        solution.add(7);
        solution.add(1);
        solution.add(6);
        solution.add(8);
        solution.add(9);
        solution.add(2);
        solution.add(5);
        solution.add(4);
        solution.add(3);
        solution.add(5);
        solution.add(9);
        solution.add(2);
        solution.add(6);
        solution.add(4);
        solution.add(3);
        solution.add(8);
        solution.add(1);
        solution.add(7);
        solution.add(3);
        solution.add(8);
        solution.add(4);
        solution.add(7);
        solution.add(5);
        solution.add(1);
        solution.add(2);
        solution.add(9);
        solution.add(6);

        Board solvedBoard = initial.solveOneBoard();

        for (int t = 0; t < 81; t++) {
            int v1 = solution.get(t);
            int v2 = solvedBoard.getValOnBoard(t);
            assertEquals(v1, v2);
        }
    }

    @Test
    public void testSolverHard() {
        initial.setBoard(1, 2);
        initial.setBoard(4, 4);
        initial.setBoard(6, 1);
        initial.setBoard(9, 4);
        initial.setBoard(19, 1);
        initial.setBoard(24, 7);
        initial.setBoard(27, 2);
        initial.setBoard(28, 3);
        initial.setBoard(32, 6);
        initial.setBoard(35, 8);
        initial.setBoard(36, 1);
        initial.setBoard(41, 8);
        initial.setBoard(43, 5);
        initial.setBoard(47, 8);
        initial.setBoard(48, 9);
        initial.setBoard(53, 2);
        initial.setBoard(59, 1);
        initial.setBoard(61, 9);
        initial.setBoard(62, 7);
        initial.setBoard(63, 8);
        initial.setBoard(66, 6);
        initial.setBoard(68, 4);
        initial.setBoard(74, 7);
        initial.setBoard(75, 8);

        ArrayList<Integer> solution = new ArrayList<Integer>(81);

        solution.add(7);
        solution.add(2);
        solution.add(6);
        solution.add(3);
        solution.add(4);
        solution.add(9);
        solution.add(1);
        solution.add(8);
        solution.add(5);
        solution.add(4);
        solution.add(8);
        solution.add(5);
        solution.add(1);
        solution.add(6);
        solution.add(7);
        solution.add(2);
        solution.add(3);
        solution.add(9);
        solution.add(9);
        solution.add(1);
        solution.add(3);
        solution.add(2);
        solution.add(8);
        solution.add(5);
        solution.add(7);
        solution.add(6);
        solution.add(4);

        solution.add(2);
        solution.add(3);
        solution.add(4);
        solution.add(7);
        solution.add(5);
        solution.add(6);
        solution.add(9);
        solution.add(1);
        solution.add(8);
        solution.add(1);
        solution.add(7);
        solution.add(9);
        solution.add(4);
        solution.add(2);
        solution.add(8);
        solution.add(3);
        solution.add(5);
        solution.add(6);
        solution.add(5);
        solution.add(6);
        solution.add(8);
        solution.add(9);
        solution.add(1);
        solution.add(3);
        solution.add(4);
        solution.add(7);
        solution.add(2);

        solution.add(6);
        solution.add(4);
        solution.add(2);
        solution.add(5);
        solution.add(3);
        solution.add(1);
        solution.add(8);
        solution.add(9);
        solution.add(7);
        solution.add(8);
        solution.add(9);
        solution.add(1);
        solution.add(6);
        solution.add(7);
        solution.add(4);
        solution.add(5);
        solution.add(2);
        solution.add(3);
        solution.add(3);
        solution.add(5);
        solution.add(7);
        solution.add(8);
        solution.add(9);
        solution.add(2);
        solution.add(6);
        solution.add(4);
        solution.add(1);

        Board solvedBoard = initial.solveOneBoard();

        for (int t = 0; t < 81; t++) {
            int v1 = solution.get(t);
            int v2 = solvedBoard.getValOnBoard(t);
            assertEquals(v1, v2);
        }
    }
}
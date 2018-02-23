package game;

import junit.framework.TestCase;

public class Tests extends TestCase {
	private int r = 1;
	private int c = 1;
	
	int[][] board = SolvedBoardGenerator.GameBoard(r, c);
	  
	//TODO split the testGameBoardFunctionReturnsValidSolved9x9Board into three smaller test: rows, columns, and boxes.
	
//	public void testRowsCannotContainSameDigit()
//	{
//		
//	}
	
//	public void testGameBoardFunctionReturnsValidSolved9x9Board()
//	{
//		assertTrue(SolvedBoardGenerator.isValid(board));
//	}
}

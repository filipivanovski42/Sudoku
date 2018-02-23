package game;
import java.util.concurrent.ThreadLocalRandom;

public class SolvedBoardGenerator {
	
	
	
	public static void main(String[] args)	//TODO the main function seems out of place in this class. There should be another class where main is called.
	{
		int rows = 9;
		int columns = 9;
		
		int[][]gameBoard = GameBoard(rows, columns);
		Print.Draw(gameBoard, rows, columns);
	}
	
	public static int[][] GameBoard(int r, int c)	//Initializes the sudoku grid.
	{
		int randomNumber = ThreadLocalRandom.current().nextInt(1, 10);
		
	 	int[][] newBoard = new int[r][c];
	 	
	 	for(int i = 0; i < r; i++)
	 	{
	 		for(int j = 0; j < c; j++)
	 		{
	 			newBoard [i][j] = randomNumber;//TODO fill the array properly rather than filling it with random numbers.
	 		}
	 	}
	 	
	 	return newBoard;
	}
	
	public static boolean rowIsValid(int[][] board)
	{
		
		return false;
	}
}

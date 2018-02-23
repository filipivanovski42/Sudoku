package game;

public class Print {
	
	public static void Draw(int[][] board, int r, int c)	//Draws the sudoku grid in console.
	{
		System.out.println("Drawing sudoku grid.\n");
		
		for(int i = 0; i < r; i++)	//Outer loop starts here and iterates through the rows of the grid.
	 	{	
			if (i == 0)	//Draws the top horizontal border of the grid.
			{
				for(int l = 0;l < 37; l++)
	 			{
	 				System.out.print("-");
	 			}
				System.out.print("\n");
			}
			
	 		for(int j = 0; j < c; j++)	//Inner loop starts here and iterates through the columns of the grid.
	 		{
	 			if (j == 0)	//Draws the leftmost vertical border of the grid.
	 			{
	 				System.out.print("| ");
	 			}
	 			System.out.print(board [i][j]);	//Draws the digits.
	 			
	 			if ((j + 1) % 3 == 0 && j != c-1)	//Draws half of the vertical inner borders.
	 			{
	 				System.out.print(" | ");
	 			}
	 			else if (j < c-1)
	 			{
	 				System.out.print("   ");	//Leaves an extra empty space instead of a border where it's needed.
	 			}
	 			
	 		}
	 		if((i + 1) % 3 == 0 || i == r - 1)	//Draws a part of the rightmost vertical border and draws the middle and bottom horizontal borders.
	 		{
	 			System.out.print(" |\n");
	 			for(int k = 0;k < 37; k++)
	 			{
	 				System.out.print("-");
	 			}
	 			System.out.print("\n");
	 		}
	 		else
	 		{
	 			System.out.print(" |\n");	//Draws a part of the rightmost vertical border and draws the middle vertical borders.
	 			for(int k = 0;k < 3; k++)
	 			{
	 				System.out.print("|");
	 				for(int l = 0; l < 11; l++)
	 				{
	 					System.out.print(" ");
	 				}
	 			}
	 			System.out.print("|");	//Finishes the rightmost vertical border.
	 			System.out.print("\n");
	 		}
	 	}
	}
}

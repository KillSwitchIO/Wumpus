package wumpusMain;

public class PrintGrid 
{
	public static void print(char[][] grid_to_print)
	{
		for(int pos_y = 0; pos_y < grid_to_print.length; pos_y ++)
		{
			for(int pos_x = 0; pos_x < grid_to_print.length; pos_x++)
				{
					System.out.print(grid_to_print[pos_y][pos_x]);
					System.out.print(" ");
				}
			System.out.println();
		}
	}
}

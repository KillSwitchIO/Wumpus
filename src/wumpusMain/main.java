package wumpusMain;
import java.util.Arrays;
import java.util.Random;


public class main 
{
	/*
	 * none
	 * breeze
	 * stench
	 * breeze_stench
	 * 
	 * 
	 * 
	 * Agent or player is: p
	 * Wumpus is: w
	 * Air is: e
	 * Gold is: g
	 */

	public static void main(String[] args) 
	{
		int[] player_coord = {0,0}; // y,x		
//		System.out.println(RandomAspect.getNextNum(5, 10));
//		System.out.println(RandomAspect.percentage_of_size(5, 10, 6));
		
//		for testing random numbers
//		int[] test_rand_num = new int[10];
//		for(int pos = 0; pos < test_rand_num.length; pos++)
//		{
//			test_rand_num[pos] = RandomAspect.getNextNum(0, 6);
//		}
//		System.out.println(Arrays.toString(test_rand_num));
		
//		for testing multi grid creation
/*		for(int number = 0; number < 10; number++)
		{
			char[][] wumpus_grid = GenerateGrid.newGrid(6, 3, player_coord);
			for(int pos_y = 0; pos_y < wumpus_grid.length; pos_y ++)
			{
				for(int pos_x = 0; pos_x < wumpus_grid.length; pos_x++)
					{
						System.out.print(wumpus_grid[pos_y][pos_x]);
						System.out.print(" ");
					}
				System.out.println();
			}
			System.out.println();
		}*/
		
// 		for testing grid creation
		char[][] wumpus_grid = GenerateGrid.newGrid(RandomAspect.getNextNum(5, 10), -1, player_coord);
		PrintGrid.print(wumpus_grid);
		
		System.exit(0);
	}

}

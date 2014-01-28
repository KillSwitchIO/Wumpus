package wumpusMain;
import java.util.Random;


public class RandomAspect 
{
	static Random random_genorator = new Random();
	
	public static int[][] getRandomCoordForEnt(int grid_size, int number_of_holes, int[] player_coord)
	{
		//variables
		int y_pos = 0;
		int x_pos = 0;
		int adtional_generations = 3; //the one for player and one for Wumpus and one for the gold
		int[][] coord_array = new int[number_of_holes + adtional_generations][2];
		boolean first_time_in_for_loop = true;
		boolean done = true;
		
		//generate random coordinate array
		for(int colum = 0; colum < coord_array.length; colum++)
		{
			if (first_time_in_for_loop) 
				{
					coord_array[colum][0] = player_coord[0];
					coord_array[colum][1] = player_coord[1];
					first_time_in_for_loop = false;
				}
			
			else
			{
				do //regenerates numbers if one matches an existing pair.
				{
					done = true;
					y_pos = getNextNum(0, grid_size);
					x_pos = getNextNum(0, grid_size);
					
					for(int inner_colum = 0; inner_colum < colum; inner_colum++)
					{
						if (coord_array[inner_colum][0] == y_pos && coord_array[inner_colum][1] == x_pos) done = false;
					}
				} while (!done);
				
				coord_array[colum][0] = y_pos;
				coord_array[colum][1] = x_pos;
			}
		}		
		
		
		return coord_array;
	}
	
	public static int getNextNum(int min, int max)
	{
		int number = (random_genorator.nextInt((max - min)) + min);
		return number;
	}
}

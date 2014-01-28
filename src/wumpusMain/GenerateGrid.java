package wumpusMain;
import java.util.Arrays;

/*
 * a = air
 * w = Wumpus
 * h = hole
 * g = gold
 * p = player / agent
 * 
 * if -1 is detected as the hole peramater it will generate any
 * 
 * example grid:
 *  {'p','a','a','a','w'},
	{'a','a','a','g','a'},
	{'a','h','a','a','a'},
	{'a','a','h','a','a'},
	{'a','a','a','a','a'}
 */


public class GenerateGrid 
{
	public static char[][] newGrid(int size, int number_of_holes, int[] player_coord)
	{
		char created_grid[][] = new char[size][size]; //Initialize array
		
		if (number_of_holes == -1)
		{
			int percentage = RandomAspect.getNextNum(5, 11);
			number_of_holes = (int) ((size * size) * ((double)percentage / 100)); //takes a percentage max spaces avaible on grid and returns number between 5%-10%
			System.out.println(number_of_holes);
		}
		
		int[][] entity_position_array = RandomAspect.getRandomCoordForEnt(size, number_of_holes, player_coord);
		
		System.out.println(Arrays.deepToString(entity_position_array)); //testing
		
		for(int pos_y = 0; pos_y < created_grid.length; pos_y++)
		{
			for(int pos_x = 0; pos_x < created_grid.length; pos_x++) //place empty spaces
				{
					created_grid[pos_y][pos_x] = '.';
				}
		}
		
		created_grid[entity_position_array[0][0]][entity_position_array[0][1]] = 'p'; //always use entity_pos_array[0][] as player
		created_grid[entity_position_array[1][0]][entity_position_array[1][1]] = 'w'; //always use entity_pos_array[1][] as Wumpus
		created_grid[entity_position_array[2][0]][entity_position_array[2][1]] = 'g'; //always use entity_pos_array[1][] as gold
		
		for (int position = 3; position < entity_position_array.length; position++)
		{
			created_grid[entity_position_array[position][0]][entity_position_array[position][1]] = 'h'; //place hole
		}
		
		return created_grid;
	}
	
}


//char[][] wumpus_grid = {
//{'p','a','a','a','w'},
//
//{'a','a','a','g','a'},
//
//{'a','h','a','a','a'},
//
//{'a','a','h','a','a'},
//
//{'a','a','a','a','a'}
//};
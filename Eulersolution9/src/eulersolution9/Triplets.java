package eulersolution9;

public class Triplets {
	int xSquare,ySquare,zSquare;
	int sum =0;
	int product =0;
	
	public  int  pythagoreanTriplet(int value)
	{

		for(int x = 1 ; x< value; x++){
			for(int y =1; y<value; y++){
				for(int z=1; z<value; z++){
					xSquare = x*x;
					ySquare =y*y;
					zSquare = z*z;
					int sum = x+y+z;
					if((xSquare +ySquare ==zSquare)&&(sum ==value))
					{
						product =x * y * z;
					}
				}
			}
		}return value;
	}
}

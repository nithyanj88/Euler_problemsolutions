package euler;

public class Euler16 {
	


public  int multiplesof3and5(){
	int value = 0;
	for(int j=0;j<1000;j++)
	{
	if (j%3 == 0 || j%5 == 0)
	{
	value = value+ j;
	}
	}
	System.out.print("sum of all natural numbers that are multiples of 3 and 5 below 1000\n");
	System.out.println(+value);
	return value;
}

}
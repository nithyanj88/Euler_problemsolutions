
public class Fibonacci {
		static int   fibA = 0;  
		static	int fibB = 1;  
		static	int fib = 1;  
		static	int total = 0;  
		static	int remainder;
		
		public int sumOfEvenFibonaccinumbers(int range)  
		{
			while (fib < range)  
			{	
				remainder= fib %2;
				if (remainder == 0)  
				{  
					total += fib;  
				}  
				fib = fibA + fibB;  
				fibA = fibB;  
				fibB = fib;  
			}  
			return total;
		}
		
	}



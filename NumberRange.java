
public class NumberRange {

	
	public long sumOfPrimeNumbers(long range){
		long sumOfNumbers = 0;
		
		for (long i=1; i <range; i++ )
		{
			long j;
			for (j=2; j<i; j++){
				long n = i%j;
				if (n==0){
					break;
				}
			}
			if(i == j){
				System.out.println("  "+i);
				sumOfNumbers = sumOfNumbers+i;
			}

		}
		return sumOfNumbers;
		
	}
}
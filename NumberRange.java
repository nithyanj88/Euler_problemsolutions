
public class NumberRange {

	public   static void main(String[] args) throws Exception{
		long sum = new NumberRange().sumOfPrimeNumbers(2000000);
		System.out.println(sum);
	}
	
	public long sumOfPrimeNumbers(long range){
		long sumOfNmuners = 0;
		
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
				sumOfNmuners = sumOfNmuners+i;
			}

		}
		return sumOfNmuners;
		
	}
}
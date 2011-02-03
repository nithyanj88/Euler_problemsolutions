import junit.framework.TestCase;


public class FibonacciTest extends TestCase {

	public void checkForSumOfEvenprimenumber()
	{
		assertEquals(4613732,new Fibonacci().sumOfEvenFibonaccinumbers(4000000));
	
	}
	
}

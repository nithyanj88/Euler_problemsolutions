import junit.framework.TestCase;


public class NumberRangeTest extends TestCase {
	
	public void testChecksthesumOfprimeNumbers(){
		//assertEquals(142913828922, new NumberRange().sumOfPrimeNumbers(10));
		assertEquals(142913828922l, new NumberRange().sumOfPrimeNumbers(2000000));
	}

}

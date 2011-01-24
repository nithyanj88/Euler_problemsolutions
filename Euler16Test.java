package euler;

import junit.framework.TestCase;

public class Euler16Test extends TestCase {
	
	public void testShouldVerifySumOfMutiplesof3or5(){
		Euler16 eu = new Euler16();
		assertEquals(233168, eu.multiplesof3and5());
	}

}

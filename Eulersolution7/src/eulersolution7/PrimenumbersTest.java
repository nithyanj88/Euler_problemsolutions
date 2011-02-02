package eulersolution7;

import junit.framework.TestCase;

public class PrimenumbersTest extends TestCase {

	public void testShouldChecktherequiredPrimeNumber(){
	assertEquals(104743, new Primenumbers().getTheRequiredPrimeNumber(10001));
	}
	}


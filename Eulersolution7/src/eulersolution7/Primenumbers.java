package eulersolution7;

public class Primenumbers {
	public int RequiredPrimeNumber( int countOfNumbers){
		int count = 0;
		int number = 0;
		int primeNumber = 0;
		int numberrange = 10000;
		boolean NotPrime = false;


		for(int i =2 ; i<numberrange ; i++){
			NotPrime = isPrime(NotPrime, i);
			if(!NotPrime){
				number =i;
				count+= 1;

			}NotPrime = false;
			if(count == countOfNumbers){
				primeNumber = number;
				break;

			}
		}
		return primeNumber;
	}


	private static boolean isPrime(boolean value, int i) {
		for(int j =2 ; j< i ; j++){
			if(i%j == 0)
				value =true;


		}
		return value;
	}
}
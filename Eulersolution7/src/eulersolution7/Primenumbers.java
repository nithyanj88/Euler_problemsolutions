package eulersolution7;

public class Primenumbers {
	 public int getTheRequiredPrimeNumber( int countOfNumbers){
		 int count = 0;
		 int number = 0;
		 int primeNumber = 0;
		 int numberrange = 10000000;
		 boolean isNotPrime = false;

		 
		 for(int i =2 ; i<numberrange ; i++){
		 isNotPrime = isPrime(isNotPrime, i);
		 if(!isNotPrime){
		 number =i;
		 count+= 1;

		 }isNotPrime = false;
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
		 public static void main(String[] args) {
			int num = new Primenumbers().getTheRequiredPrimeNumber(10001);
			System.out.println(num);
			
		}
		 }
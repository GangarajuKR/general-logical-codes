package logical_coading;

public class CheckNumberIsPrime {

	public static void main(String[] args) {
		CheckNumberIsPrime.checkNumberIsPrime(28);
	}
	
	public static void checkNumberIsPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? number + " is prime number" : number + " is not a prime number");
	}
}

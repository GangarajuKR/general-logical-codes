package logical_coading;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		PrimeNumbers primeNumbersObj = new PrimeNumbers();
		System.out.println(primeNumbersObj.printPrimeNumbers(50));
	}
	
	public ArrayList<Integer> printPrimeNumbers(int number) {
	    ArrayList<Integer> primeList = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				
				if (i%j == 0) {
					count++;		
				}
			}
			if (count == 2) {
				primeList.add(i);
			}
		}
		return primeList;
	}
}

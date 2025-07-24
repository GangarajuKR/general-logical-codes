package logical_coading;

public class SixDigidPalindrome {
	
	public static void main(String[] args) {
		SixDigidPalindrome obj = new SixDigidPalindrome();
		obj.sixDigitPalindromes();
	}
	
	public void sixDigitPalindromes() {
		for(int i = 1; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for(int k = 0; k < 9; k++) {
					int number = i * 100000 + j * 10000 + k * 1000 + k * 100 + j * 10 + i * 1;
					System.out.println(number);
				}
			}
		}
	}

}

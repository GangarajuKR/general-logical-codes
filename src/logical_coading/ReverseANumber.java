package logical_coading;

public class ReverseANumber {
	
	public static void main(String[] args) {
		System.out.println(ReverseANumber.reverseANumber(12348));
	}

	public static int reverseANumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int lastNum = num % 10;
            reversed = reversed * 10 + lastNum;
            num /= 10;
        }
        return reversed;
	}

















































    //		int reversed = 0;
//		while (num != 0) {
//			reversed = reversed * 10 + num % 10;
//			num /= 10;
//		}
//
//		return reversed;
}

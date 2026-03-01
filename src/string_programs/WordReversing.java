package string_programs;

public class WordReversing {

	public static void main(String[] args) {
		
		String s="hi how are you";

		String[] arr = s.split(" ");

		for (String str: arr) {
			char[] eachStringArr = str.toCharArray();
			for (int i = str.length()-1; i >= 0; i--) {
				System.out.print(eachStringArr[i]);
			}
			System.out.print(" ");
		}
		
		
//		int start = 0;
//		int next = 1;
//		int length = 7;
//
//		for (int i = 0; i < length; i++) {
//			int temp = start + next;
//			System.out.print(start+ ", ");
//			start = next;
//			next = temp;
//		}
//
//		select * from employees sort by salary desc where city = 'Bangalore' limit = 5;
	}
}

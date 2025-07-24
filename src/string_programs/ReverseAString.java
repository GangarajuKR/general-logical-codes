package string_programs;

public class ReverseAString {
	
	public static void main(String[] args) {
		String str = "Gangaraju K R";
		ReverseAString obj = new ReverseAString();
		
		System.out.println(obj.reverseTheString(str));
		
	}
	
	private StringBuilder reverseTheString(String sourceString) {
		char arr [] = sourceString.toCharArray();
		StringBuilder reversedString = new StringBuilder();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			reversedString.append(arr[i]);
		}
		return reversedString;
	}

}

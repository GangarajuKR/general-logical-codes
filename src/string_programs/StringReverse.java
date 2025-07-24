package string_programs;

public class StringReverse {
//	public static void main(String [] args) {
	void main() {
		String str = "Gangaraju K R";
		StringReverse obj = new StringReverse();
		System.out.println(obj.reverseAString(str));
	}

	public StringBuilder reverseAString(String sourceString) {
		char arr [] = sourceString.toCharArray();
		StringBuilder constructedString = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			constructedString.append(arr[i]);
		}
		return constructedString;
	}
}

package string_programs;

public class LongPrefix {
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//    If there is no common prefix, return an empty string "".
//
//
//
//    Example 1:
//
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//    Example 2:
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.

//    Input: s = "race a car"
//    Output: false
//    Explanation: "raceacar" is not a palindrome.
public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
         String strings = str.replaceAll("[^a-zA-z]", "").toLowerCase();
    System.out.println("strings:"+ strings);
         StringBuilder revStr = new StringBuilder(strings);
    System.out.println(revStr.reverse());
//         for (int i = strings.length()-1; i >= 0; i-- ) {
//             revStr += strings.charAt(i);
//         }

         if (strings.equals(revStr.reverse().toString())) {
             System.out.print("Is palindrome");
         } else {
             System.out.print("Is not a palindrome");
         }

}




//    public static void main(String[] args) {
//        String [] str = {"flower","flow","floght"};
//        String prefix = "";
//        String longestPref = "";
//        for (int i = 0; i < str[0].length() - 1; i++) {
//            prefix += str[0].charAt(i);
//
//            for (int j = 1; j < str.length - 1; j++) {
//                String nextPref = "";
//                for (int k = 0; k < str[j].length()-1; k++) {
//                    nextPref += str[j].charAt(k);
//                    if (!prefix.equals(nextPref)) {
//                        break;
//                    } else {
//                        longestPref = prefix;
//                    }
//                }
//
//            }
//        }
//        System.out.print(longestPref);
//    }
}

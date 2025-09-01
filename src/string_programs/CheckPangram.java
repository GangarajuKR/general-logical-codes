package string_programs;

public class CheckPangram {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lay dog";
        s = s.toLowerCase();
        boolean bool = true;
        for (char i = 'a'; i <= 'z'; i++) {
            if (!s.contains(Character.toString(i))) {
                bool = false;
                break;
            }
        }

        if (bool)
            System.out.print("The given string is ANAGRAM");
        else
            System.out.print("The given string is NOT ANAGRAM");
    }
}

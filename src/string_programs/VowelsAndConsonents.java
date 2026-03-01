package string_programs;

public class VowelsAndConsonents {

    public static void main(String[] args) {
        String s = "Testing";
        char[] chArr = s.toLowerCase().toCharArray();
        int vowels = 0;
        int consonents = 0;

        for (char ch: chArr) {
            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else
                consonents++;
        }

        System.out.println("Vowels:"+vowels);
        System.out.println("Consonents:"+consonents);
    }
}

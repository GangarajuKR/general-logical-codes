package string_programs;

public class ChangeCase {
    public static void main(String[] args) {


    }

    public static void changeCase(String s) {
        // code here
        char c = Character.toUpperCase(s.charAt(0));
        System.out.println(c+s.substring(1));
        System.out.print(s.toUpperCase());
    }
}

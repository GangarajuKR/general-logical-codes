package logical_coading;

public class NumberLogics {

    public static void main(String[] ganga) {
        NumberLogics obj = new NumberLogics();
        int number = 11;
        System.out.println(obj.isPrimeNumber(number));
    }

    // Is Prime number
    public boolean isPrimeNumber (int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int number) {
        int originalNum = number;
        int reversedNum = 0;

        while (number != 0) {
            int lastNum = number % 10;
            reversedNum = reversedNum * 10 + lastNum;
            number /= 10;
        }

        return reversedNum == originalNum;
//        if (reversedNum == originalNum) {
//            System.out.print("Yes it's a Palindrome.");
//        } else {
//            System.out.print("It's not a Palindrome.");
//        }
    }

    // Is Armstrong number
    public boolean isArmstrongNum(int num) {
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int lastDig = num % 10;
            sum += lastDig * lastDig * lastDig;
            num /= 10;
        }

        return  originalNum == sum;
    }
}

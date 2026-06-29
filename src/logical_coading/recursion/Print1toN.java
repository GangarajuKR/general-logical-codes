package logical_coading.recursion;

public class Print1toN {
    public static void main(String[] args) {
//        printUptoN(5);
//        System.out.print(sumOfN(7));
//        System.out.println(factorialOfN(11));
        System.out.println(xPowerOfN(3, 6));
    }

    static int xPowerOfN(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * xPowerOfN(x, n -1);
    }

    static int factorialOfN(int n) {
        if (n == 1) return 1;
        return n * factorialOfN(n - 1);
    }

    static int sumOfN(int n) {
        if (n == 0) return  0;
        return n + sumOfN(n - 1);
    }

    static void printUptoN(int n) {
        if (n == 0) {
            return;
        }
        printUptoN(n - 1);
        System.out.print(n+", ");
    }

//
//    //Sum of N numbers
//    static int sumOfN (int n) {
//        if (n == 0) return 0;
//        return n + sumOfN(n-1);
//    }


}

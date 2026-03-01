package logical_coading;

public class NumberLogicsWithoutInput {

    public static void main (String[] args) {
        NumberLogicsWithoutInput obj = new NumberLogicsWithoutInput();
        obj.printFibonacci(10);
    }

    //Fibonacci series
    public void printFibonacci(int limit) {
        int first = 0;
        int next = 1;
        System.out.print(first + ", "+ next + ", ");
        for (int i = 2; i < limit; i++) {
            int current = first + next;
            System.out.print(current + ", ");
            first = next;
            next = current;
        }
    }
}

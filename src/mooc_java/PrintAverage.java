package mooc_java;

import java.util.Scanner;

public class PrintAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		double total = 0;

		int passingCount = 0;
		double passingTotal = 0;

		while (true) {
			int enteredValue = scan.nextInt();

			if (enteredValue == -1) {
				break;
			}
			if (enteredValue >= 0 && enteredValue <= 100) {
				count++;
				total += enteredValue;

				if (enteredValue >= 50) {
					passingCount++;
					passingTotal += enteredValue;
				}
			}

		}

		System.out.println("Point average (all): " + total / count);
		System.out.println("Point average (passing): " + passingTotal / passingCount);
		System.out.println("Pass percentage: " + (100 * passingCount / count));

	}
}

package mooc_java;
import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
//		int[] numbers = {6, 5, 8, 7, 5, 11};
//		System.out.println("Smallest: " + MainProgram.smallest(numbers));
//		System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
//		System.out.print(MainProgram.indexOfSmallestFrom(numbers, 0));
//		System.out.print(","+MainProgram.indexOfSmallestFrom(numbers, 1));
//		System.out.println(","+MainProgram.indexOfSmallestFrom(numbers, 2));
		
		//======================================
//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
		
		//Selection sort
		int[] numbers = {8, 3, 7, 9, 1, 2, 4};
		System.out.println(Arrays.toString(numbers));
		MainProgram.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	//Sorting(Selection sort)
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
			System.out.println(i+"==> "+Arrays.toString(array));
		}
	}
	
	//Swapping numbers
	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	//return smallest of an int array
	public static int smallest(int[] array){
	    // write your code here
		int smallest = array[0];
		for(int i: array) {
			if (i < smallest) {
				smallest = i;
			}
		}
		
		return smallest;
	}
	
	//Index of the smallest value
	public static int indexOfSmallest(int[] array){
		int smallest = array[0];
		int index = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
				index = i;
			}
		}
		
		return index;
	}
	
	//Index of the smallest value after a certain value
	public static int indexOfSmallestFrom(int[] array, int startIndex) {
		int smallest = array[startIndex];
		int index = startIndex;
		
		for (int i = startIndex+1; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
				index = i;
			}
		}
		
		return index;
	}
}

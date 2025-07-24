package mooc_java;

public class BinarySearch {

	public static void main(String[] args) {
		//			 0  1  2  3  4  5  6  7   8
		int[] arr = {1, 2, 3, 4, 6, 8, 9, 10, 12};
		System.out.println(searchIndex(arr, 3));
	}
	
	public static int searchIndex(int[] array, int searchValue) {
		
		int rangeStart = 0;
		int rangeEnd = array.length - 1;
		
		int foundIndex = -1;
		while (rangeStart <= rangeEnd) {
			System.out.println(rangeStart+ " <====> " + rangeEnd);

			int middle = (rangeStart + rangeEnd) / 2;
			System.out.println("mddle ==>"+ middle);
			if (array[middle] == searchValue) {
				foundIndex = middle;
				break;
			} else if (array[middle]  < searchValue) {
				rangeStart = middle + 1;
			} else if (array[middle]  > searchValue) {
				rangeEnd = middle - 1;
			}
		}
		return foundIndex;
	}
}
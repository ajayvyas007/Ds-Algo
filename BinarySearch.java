package blog_site;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int arrayLength = arr.length;
		int selectionElement = 4;
		int resultInndex = binarySearchUsingIteration(arr, 0, arrayLength-1, selectionElement);
		
		if(resultInndex>=0) {
			System.out.println("Element is available on "+resultInndex+ " this index.");
		} else {
			System.out.println("Element is not available.");
		}
		
	}

	
	/**
	 * This function solve the problem with the recursion function
	 * @param arr is array in which we need to find the index
	 * @param startingInndex starting index of provided array
	 * @param lastIndex last index of provided array
	 * @param selectionElement, which element is need to search in the provided array
	 * @return index where the element is present in the array
	 */
	private static int binarySearch(int[] arr, int startingInndex, int lastIndex, int selectionElement) {
		
		if(lastIndex >= startingInndex) {
			int mid = startingInndex + (lastIndex -1) /2;
			System.out.println(" Mid is "+mid+ "Start index: "+startingInndex +" Last index "+ lastIndex);
			
			
			if(arr[mid] == selectionElement)
				return mid;
			
			if(arr[mid] > selectionElement)
				return binarySearch(arr, startingInndex, mid - 1 , selectionElement);
			
			return binarySearch(arr, mid + 1, lastIndex, selectionElement);
		}
		
		return -1;
	}
	
	
	/**
	 * Binary Search using iteration
	 * @param arr
	 * @param startingInndex
	 * @param lastIndex
	 * @param selectionElement
	 * @return
	 */
	private static int binarySearchUsingIteration(int[] arr, int startingInndex, int lastIndex, int selectionElement) {
		
		while(startingInndex <= lastIndex) {
			
			int mid = startingInndex + (lastIndex -1) /2;
			
			if(arr[mid] == selectionElement)
				return mid;
			
			if(arr[mid] > selectionElement)
				lastIndex = mid - 1;
			
			if(arr[mid] < selectionElement)
				startingInndex = mid+1;
		}
		
		return -1;
	}
	

}

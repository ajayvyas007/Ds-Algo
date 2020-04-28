package blog_site;


public class MergeSort {

	public static void main(String[] args) {
		
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		
		mergeSort(arr, 0, arr.length-1);
		
		printArray(arr);
		
	}
	
	

	public static void mergeSort(int[] arr, int startingIndex, int lastInndex) {
		
		
		if(startingIndex < lastInndex) {
			
			int midIndex = (startingIndex + lastInndex)/2;
			
			mergeSort(arr, startingIndex, midIndex);
			
			mergeSort(arr, midIndex +1, lastInndex);
			
			marge(arr, startingIndex, midIndex, lastInndex);
			
			
		}
	}

	public static void marge(int[] arr, int lowerBound, int mid, int upperBoud) {
		
		//size of two subarrays to be merged
		int sizeOfFirstSubArray = mid - lowerBound +1;
		int sizeOfSecondSubArray = upperBoud - mid;
		
		//Create a two temp arrays
		int[] firstArray = new int[sizeOfFirstSubArray];
		int[] secondArray = new int[sizeOfSecondSubArray];
		
		//put value to temp arrays
		for(int i = 0; i < sizeOfFirstSubArray; i++)
			firstArray[i] = arr[lowerBound + i];
		
		for(int j = 0; j < sizeOfSecondSubArray; j++)
			secondArray[j] = arr[mid +1 + j];
		
		
		//starting index of first and secound subarrays
		int x=0,y=0;
		
		//starting index of merged array
		int a = lowerBound;
		
		while (x < sizeOfFirstSubArray && y < sizeOfSecondSubArray) {
			if(firstArray[x] <= secondArray[y]) {
				arr[a] = firstArray[x];
				x++;
			} else {
				arr[a] = secondArray[y];
				y++;
			}
			
			a++;
		}
		
		while(x < sizeOfFirstSubArray) {
			arr[a] = firstArray[x];
			x++;
			a++;
		}
		
		while(y < sizeOfSecondSubArray) {
			arr[a] = secondArray[y];
			y++;
			a++;
		}
	
	}


	private static void printArray(int[] arr) {
		 int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
		
	}
}

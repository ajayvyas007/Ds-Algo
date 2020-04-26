package blog_site;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 64,25,12,22,11 };
		
		selectionSort(arr);
	}
	
	private static void selectionSort(int[] arr) {
		
		
		for(int a = 0;a<arr.length-1;a++) {
			
			int min_index = a;
			
			for(int b = a+1; b<arr.length;b++)
				if(arr[min_index] > arr[b])
					min_index = b;
			
			int temp = arr[a];
			arr[a] = arr[min_index];
			arr[min_index] = temp;
					
					
		}
		
		printSortedArray(arr);
	}
	
	private static void printSortedArray(int[] a) {
		for(int x = 0; x< a.length;x++) {
			System.out.print(" "+a[x]);
		}
	}
}

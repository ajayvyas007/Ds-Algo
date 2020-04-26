package blog_site;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int arr[] = { 12, 11, 13, 5, 6 };
		
		insertionSort(arr);
		
	}
	
	public static void insertionSort(int[] a) {
		
		int index = 0, j = 0;
		
		for(int i=1; i<a.length; i++) {
			int Key = a[i];
			j = i-1;
			
			while(j >= 0 && a[j] > Key) {
				a[j+1] = a[j];
				j--;
				
			}
			
			a[j+1] = Key;
		}
		
		printArray(a);
	}
	
	static void printArray(int arr[]) 
    { 
		
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }

}

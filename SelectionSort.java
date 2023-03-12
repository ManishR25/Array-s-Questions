package Arrays;

public class SelectionSort {
	
	public static void selectionSortArray(int [] arr){
		int n=arr.length;
		
		for(int i=0; i< n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					int k=arr[j];
					arr[j] = arr[i];
					arr[i] = k;
				}
			}
		}
	}
	
	public static void printArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1,0,5,2,9,3};
		selectionSortArray(arr);
		printArray(arr);

	}

}

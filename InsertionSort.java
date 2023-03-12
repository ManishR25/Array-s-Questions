package Arrays;

public class InsertionSort {

	public static void insertionSortArray(int [] arr) {
		
		int n=arr.length;
		for(int i=1; i<n; i++) {
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] =temp;
		}
		
	}
	public static void printArray(int[] arr) {
		
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr= {9,2,5,6,3,15,8};
		insertionSortArray(arr);
		printArray(arr);

	}

}

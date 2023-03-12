package Arrays;

public class BubbleSort {
	
	public static void bubbleSortArray(int [] arr) {
		
		for(int i=0; i< arr.length - 1; i++) {
			for (int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j + 1]) {
					int k=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = k;
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

             int [] arr= {10,30,20,40,9};
             bubbleSortArray(arr);
             printArray(arr);

	}

}

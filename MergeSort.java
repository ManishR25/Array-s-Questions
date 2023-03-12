package Arrays;

public class MergeSort {
	
	public static void printArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int [] mergeSortArray(int [] arr1, int [] arr2) {
		int m= arr1.length;
		int n= arr2.length;
		
		int []arr3 = new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		while(i < m && j < n) {
			if(arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
			
		}
		while(i<m) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		return arr3;
	}
	
	public static void main(String[] args) {

           int [] arr1 = {1,3,5,7,9,11,13};
           int [] arr2 = {0,2,4,6,8,10,12,14};
           
           int [] arr=mergeSortArray(arr1, arr2);
           printArray(arr);

	}

}

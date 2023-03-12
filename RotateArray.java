package Arrays;

public class RotateArray {

	public static void rotateArray(int [] arr, int d) {
		
		int n=arr.length;
		int temp=d;
		while(d<n){
			System.out.print(arr[d] + " ");
			d++;
		}
		int i=0;
		while(i<temp) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}
//	public static void printArray(int [] arr) {
//		int n=arr.length;
//		
//		for(int i=0; i<n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
	
	public static void main(String[] args) {

		int [] arr = {1, 3, 6, 11,12, 17, 22, 26, 30, 33, 38};
		int d=7;
		rotateArray(arr,d);
		//printArray(arr);

	}

}

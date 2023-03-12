package Arrays;

public class secondLargestElement {
	
	public static int secondLargestElementArray(int [] arr) {
		
		int n=arr.length;
		//System.out.println(n);
		int max=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max=arr[i];
			}	
		}
		int secondMax = -1;
		
		for(int i=0; i<n; i++) {
			if(arr[i] < max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		
		int [] arr = {2,28,4,1,3,6,13};
		
		int result_array=secondLargestElementArray(arr);
		System.out.println(result_array);
	}

}

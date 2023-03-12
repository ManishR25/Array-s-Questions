package Arrays;

public class checkArrayRotation {
	
	public static int ArrayRotation(int [] arr) {
		
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i] > 0 && arr[i] < 2) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		int [] arr= {10,20,30,1};
		
		int result_array=ArrayRotation(arr);
		System.out.println(result_array);

	}

}

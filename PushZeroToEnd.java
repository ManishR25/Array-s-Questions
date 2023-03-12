package Arrays;

public class PushZeroToEnd {
	
	public static void pushZeroToEndArray(int [] arr) {
		
		int n= arr.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == 0 && arr[j] !=0) {
					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
		}
	}
	
	public static void printArray(int [] arr) {
		int n= arr.length;
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

            int [] arr = {0,1,1,0,1,0,1};
            pushZeroToEndArray(arr);
            printArray(arr);
	}

}

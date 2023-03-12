package Arrays;

public class copyArrayIntoAnotherArray {
	
	public static void printArray(int [] arr2) {
		int n=arr2.length;
		int i;
		for(i=0; i<n; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
	
	public static void copyIntoANotherArray(int [] arr1) {
		int n=arr1.length;
		
		int [] arr2 = new int[n];
		int i=0;
		//System.out.print(arr1[i] +  " ");
		for(i=0; i<n; i++) {
			arr2[i] = arr1[i] + 1;
			
		}
		
		printArray(arr2);
	}
	
	

	public static void main(String[] args) {

            int [] arr1= {1,2,3,4,5,6};
            
            for(int i=0; i<arr1.length; i++) {
            	System.out.print(arr1[i] + " " );
            }
            System.out.println();
            copyIntoANotherArray(arr1);
            
	}

}

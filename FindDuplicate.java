package Arrays;

public class FindDuplicate {
	
	public static int duplicateFind(int [] arr) {
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			int count =0;
			for(int j=0; j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > 1) {
				return arr[i];
			}
		}
		return -1;
	}
         public static void main(String [] args) {
        	 
        	 int [] arr = {1,2,4,4,5,6};
        	 int result_arr = duplicateFind(arr);
        	 System.out.println(result_arr);
         }
}

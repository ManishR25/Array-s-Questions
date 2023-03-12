package Arrays;

public class IntersectionOfTwoArray {

	public static void intersect(int [] arr1, int [] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		for(int i=0; i < size1; i++) {
			for(int j=0; j< size2; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {

         int [] arr1 = {2, 6, 1, 2};
         int [] arr2 = {1, 2, 3, 4, 2};
         intersect(arr1, arr2);

	}

}

package Arrays;

public class BasicsOfArray {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		arr[3]=12;
		arr[9]=23;
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		System.out.println(arr[9]);
		
		char cArray[] = new char[10];
		cArray[2]= 'A';
		System.out.println(cArray[2]);
		System.out.println(cArray[3]);
		
		double dArray[] = new double[10];
		dArray[1]=23.56;
		System.out.println(dArray[1]);
		System.out.println(dArray[3]);
		
		long lArray[] = new long[5];
		lArray[1]= 12356989;
		System.out.println(lArray[1]);
		System.out.println(lArray[3]);
	}

}

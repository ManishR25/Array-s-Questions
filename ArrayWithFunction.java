package Arrays;
import java.util.*;

public class ArrayWithFunction {

	
	public static int [] takeInput() {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the " + i + " th Element");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {

        int arr[]=takeInput();
        printArray(arr);

	}

}

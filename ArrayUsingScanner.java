package Arrays;

import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the " + i + "th element of the array");
			arr[i] = sc.nextInt();
		}
		System.out.println("Complete Array:- ");
		for(int i=0; i<n; i++) {
			
			System.out.print(arr[i] + " ");
		}

	}

}

package Arrays;

import java.util.Scanner;

public class LargestElementOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int maxElement=Integer.MIN_VALUE;
		int element=0;
		for(int i=0; i<n; i++) {
			System.out.println("Enter the " + i + "th element of the array:");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i] > maxElement ) {
				maxElement = arr[i]; 
			}
		}
		System.out.println(maxElement);

	}

}

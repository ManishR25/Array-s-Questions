package Arrays;

public class SumOfTwoArrays {

	public static void sumOf2Arrays(int [] arr1, int [] arr2, int [] output){

	
		int i=arr1.length-1;
		int j=arr2.length-1;
		int num=0;
		int carry=0;
		int rem=0;
		int k=output.length-1;
		

		while(i>=0 && j>=0) {
			num = arr1[i] + arr2[j] + carry;
			carry = num / 10;
			rem = num % 10;
			output[k] = rem;
			i--;
			j--;
			k--;
		}
		while(i>=0) {
			num = arr1[i] + carry;
			//carry = num % 10;
			rem = num /10;
			output[k] =num;
			i--;
			k--;
		}
		while(j>=0) {
			num = arr1[j] + carry;
			//carry = num % 10;
			rem = num /10;
			output[k] =num;
			j--;
			k--;
		}
		
		output[k] = carry;
		for(int l=0; l<output.length; l++) {
			System.out.print(output[l]);
		}
		
	}
	
	public static void main(String[] args) {

         int arr1[]= {6,9,8,5};
         int arr2[]= {0};
         int n=arr1.length;
         int m=arr2.length;
         int k=0;
         if(n == m) {
        	 k = n+1;
         }
         if(n > m) {
        	 k= n + 1;
         }else {
        	 k = m + 1;
         }
         int output[] = new int[k];
         sumOf2Arrays(arr1,arr2, output);
        

	}

}

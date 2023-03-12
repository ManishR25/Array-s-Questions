package Arrays;

public class Sort_0_1_2 {
	
	public static void sort012(int [] arr) {
		int zeros=0;
		int ones=0;
		int twos=0;
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				zeros++;
			}else if(arr[i] == 1) {
				ones++;
			}else if(arr[i] == 2) {
				twos++;
			}
		}
		//System.out.println(zeros);
		//System.out.println(ones);
		//System.out.println(twos);
		
		//int [] temp = new int[n];
		
		int i=0;
		while(i<n) {
			while(i<zeros) {
				arr[i] = 0;
				i++;
			}
			while(i<zeros + ones) {
				arr[i] = 1;
				i++;
			}
			while(i<zeros + ones + twos) {
				arr[i] = 2;
				i++;
			}
		}
		
		for(int j=0; j<n; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}

	public static void main(String[] args) {

          int [] arr= {2,1,0,1,2,0,1};
          
          sort012(arr);

	}

}

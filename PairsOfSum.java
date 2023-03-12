package Arrays;

public class PairsOfSum {
	
	public static int PairSum(int [] arr, int num) {
		int paircount=0;
		int n=arr.length;
		
		for(int i=0; i < n - 1; i++) {
			for(int j=i+1; j < n; j++) {
				if( (arr[i] + arr[j]) == num) {
					paircount++;
				}
			}
		}
		return paircount;
	}

	public static void main(String[] args) {
		
		int [] arr= {1,2,4,6,7,8,3};
		int x=5;
		int result_pair_sum = PairSum(arr,x);
		System.out.println(result_pair_sum);

	}

}

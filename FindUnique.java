package Arrays;

public class FindUnique {

	 public static int findUnique(int[] arr){
      int n=arr.length;
     
     for(int i=0; i<n; i++){
    	 int count =0;
       for(int j= 0 ; j<n; j++){
              if(arr[i] == arr[j]){
               count++;
              }
              //System.out.println(unique);
       }
       if(count ==1) {
     	  return arr[i];
       }
       
     }
      return -1;
}
	
	public static void main(String[] args) {
		
		int [] arr= {2, 3, 1, 6, 3, 6, 2};
		int result = findUnique(arr);
		System.out.println(result);
	}

}

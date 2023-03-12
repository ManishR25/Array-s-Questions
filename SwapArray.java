package Arrays;

public class SwapArray {

	public static void swapAlternate(int arr[]) {
    	int n=arr.length;
   
    		for(int i = 0; i <n ; i=i+2){

                for(int j = i + 1; j > i; j--){
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                    
                 
                } 
                
           }
           for(int i = 0; i < n; i++){
               System.out.print(arr[i]+" ");
           }
    	
    }
	
	public static void main(String[] args) {

             int arr []= {1,2,3,4,5};
             swapAlternate(arr);

	}

}

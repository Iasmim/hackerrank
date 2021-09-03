package quicksortalgorithm;
class QuickSortAlgorithm {
    //at eat step we choice a pivot element
    // rigth element
    //we bring all element swaller than pivot to the left side of pivoy
    
      /*Step 1 − Make any element as pivot
    Step 2 − Partition the array on the basis of pivot
    Step 3 − Apply quick sort on left partition recursively
    Step 4 − Apply quick sort on right partition recursively*/
    
    
    public int partition(int[] arr, int low, int high){
     int pivot = arr[high];
     int i = low -1;
        System.out.println(i);
     
        for (int j = low; j < high; j++) {
            System.out.println("j"+j);
            if(arr[j] <= pivot)
            {
              i++;
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
            
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        printArray(arr);
        
     
     return i+1;
    }
    
    void sort(int[] arr, int low, int high){
     if(low < high)
     {
       int pi = partition(arr, low, high);
       
       sort(arr,low, pi-1);
       sort(arr, pi+1, high);
     
     }
    }
    
    
    /* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		int arr[] = {10, 7, 8, 9, 1, 5}; 
		int n = arr.length; 

		QuickSortAlgorithm ob = new QuickSortAlgorithm();
		ob.sort(arr, 0, n-1); 

		System.out.println("sorted array"); 
		printArray(arr); 
	} 
    
}

class mergeSort {

    void merge(int arr[], int[] leftArr, int[] rightArr){
        int nL = leftArr.length;
        int nR = rightArr.length;
        // i is for iterating through the left sub array, j for right, then k for the merged array
        int i = 0, j = 0, k = 0;
        // the iterators must not go over their own arrays
        while (i < nL && j < nR){
            // compare both arrays
            if (leftArr[i] >= rightArr[j]){
                arr[k] = rightArr[j];
                j++;
            } else {
                arr[k] = leftArr[i];
                i++;
            }
            // make sure to also increment the merged array for insertion
            k++;
        }

        // cleanup
        // what if one of the conditions in the upper while loop is finally false?
        // we  still need to pick up all the elements from the either right or left array when one of them doesn't meet the condition anymore
        while (i < nL){
            // no comparison needed because the right array is already done inserted or reached right array size
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < nR){
            // no comparison needed because the left array is already done inserted or reached left array size
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    

    
    void sort(int[] arr)
    {
        int n = arr.length;
        
        // if size is only 1, it is assumed that it is sorted and no comparison needed
        if (n < 2){
            return;
        }
        
        // get the middle index of the original array
        int mid = n / 2;
        // intialize two temp arrays (subarrays)
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        // fill up these two subarrays
        for (int i = 0; i < mid; i++){
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++){
            // must start with the 0 index in rightArr when filling up
            rightArr[i - mid] = arr[i];
        }

        sort(leftArr);
        sort(rightArr);
        merge(arr, leftArr, rightArr);
    }
 
    // A utility function to print array of size n
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {4, 5, 9, 3, 5, 1, 2, 6, 3};
 
        System.out.println("Given array is");
        printArray(arr);
 
        mergeSort ob = new mergeSort();
        ob.sort(arr);
 
        System.out.println("\nSorted array is");
        printArray(arr);
      
    }
}
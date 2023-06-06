class binarySearch {
    



    // ********* BASIC EXPLANATION *********
    // Array will have to be sorted.
    // We can have two pointer, pointing at the first element and last index
    // Another pointer to point at the middle of the array.
    // We can grab the middle element by adding the index of first and last and dividing them both by 2

    //          0  1  2   3   4   5   6  7
    // Array: [ 3, 4, 9, 10, 15, 20, 25, 35 ] --> Target: 9
    // 
    



    // search for the index of the key you're looking for
    int getIndex(int[] arr, int target){

        // use two pointers technique: point at first element and last index
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if (arr[midIndex] == target){
                return midIndex;
            }
            else if (target > arr[midIndex]){
                // change the left index to the right of the middle index or + 1
                leftIndex = midIndex + 1;
            }
            else {
                rightIndex = midIndex - 1;
            }
        }
        
        return -1;
    }

    int getFirstIndex(int arr[], int target){
         // use two pointers technique: point at first element and last index
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int result = -1;
        

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if (arr[midIndex] == target  && arr[midIndex - 1] != target){
               
                // result is the first occurence
                result = midIndex;
                // the right index is the last occurence
                return arr[rightIndex];
                
            }
            else if (target > arr[midIndex]){
                // change the left index to the right of the middle index or + 1
                leftIndex = midIndex + 1;
            }
            else {
                rightIndex = midIndex - 1;
            }
        }
        
        return result;
    }
    public static void main(String[] args){
        
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5; // should return index 2
        binarySearch search = new binarySearch();
        System.out.println(search.getFirstIndex(arr, target));

    }
}
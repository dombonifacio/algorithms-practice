class binarySearch {

    // Must implement this with decrease and conquer, that's why we use binary search,

    // ********* BASIC EXPLANATION OF BINARY SEARCH *********
    // 1. Left pointer pointing at first element, right pointer pointing at n - 1
    // 2. Middle pointer to point at middle by (left + right) /  2
    // 3. Middle pointer will be responsible for decreasing and returning right index of specific target
    // 4. If target is greater than middle index, go to the right subarray (split array) by adjusting left pointer to mid + 1
    // 5. If target is less than, go to the left subarray by adjusting right pointer tto mid - 1
    // 6. REMEMBER: Left should never collide with Right pointer! Make it Left <= Right
    // We can grab the middle element by adding the index of first and last and dividing them both by 2

    //          0  1  2   3   4   5   6  7
    // Array: [ 3, 4, 9, 10, 15, 20, 25, 35 ] --> Target: 9
    // 
    



    

    int getFirstIndex(int arr[], int target){
         // use two pointers technique: point at first element and last index
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int result = -1;
        

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            // checks if target is the first occurence
            if (arr[midIndex] == target  && arr[midIndex - 1] != target){
               
                // result is the first occurence
                result = midIndex;
                
                return result;

                // we can push the indexes to an array then use those indexes to access like a nested index
                
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
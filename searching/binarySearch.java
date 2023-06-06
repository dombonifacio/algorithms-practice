class binarySearch {

    // Must implement this with decrease and conquer, that's why we use binary search,

    // ********* BASIC EXPLANATION OF BINARY SEARCH *********
    // 1. Left pointer pointing at first element, right pointer pointing at n - 1
    // 2. Middle pointer to point at middle by (left + right) /  2
    // 3. Middle pointer will be responsible for decreasing and returning right index of specific target
    // 4. If target is greater than middle index, go to the right subarray (split array) by adjusting left pointer to mid + 1
    // 5. If target is less than, go to the left subarray by adjusting right pointer tto mid - 1
    // 6. REMEMBER: Left should never collide with Right pointer! Make it Left <= Right

    // Array needs to be sorted, otherwise, middle pointer wouldn't know which subarray to solve


    int getFirstIndex(int arr[], int target){
         // use two pointers technique: point at first element and last index
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        // initialize to -1 if not first occurence if not found
        int result = -1;
        
        // check first if first index already matches the target
        if (arr[leftIndex] == target){
            result = leftIndex;
            return result;
            
        }
        while (leftIndex <= rightIndex){
            
            int midIndex = (leftIndex + rightIndex) / 2;
            // checks if target is the first occurence
            // Middle index can sit the same at left pointer. Make sure left of middle index is not a target, because that won't be first occurence anymore.
        
            // arr[midIndex] == target  && arr[midIndex - 1] != target will occur an error if first occurence is at the very first index
            if (arr[midIndex] == target  && arr[midIndex - 1] != target ){ 
               
                // result is the first occurence
                result = midIndex;
                
                return result;


                
            }
            
            
            // keep going if not found
            else if (target > arr[midIndex]){
                // change the left index to the right of the middle index or + 1
                leftIndex = midIndex + 1;
            }
            else {
                // if target is less than middle index, the target is in the left subarray
                rightIndex = midIndex - 1;
            }
        }
        
        return result;
    }

    int count(int[] arr, int target){
        // get the first index

        int left = getFirstIndex(arr, target);
        int counter = 0;
        // index to keep moving in the array or use for counting
        int index = left;
        // start with the first occurence in array

        while (arr[index] == target && index < arr.length){
            counter++;
            index++;
        }
        return counter;
        // keep counting until the elements in the array matches with the target. prevent going over the array as well

      
    }
    public static void main(String[] args){
        // 1,2,3,1, 5,4,2,1,3,1
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 4, 5};
        int target = 3; // should return index 2
        binarySearch search = new binarySearch();
        System.out.println(search.getFirstIndex(arr, target));
        System.out.println(search.count(arr, target));

    }
}
import java.util.Arrays;

class KeyOccurenceTwo {

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

        int counter = 0;
        int left = getFirstIndex(arr, target);
        if (left == -1){
            System.out.println("Target not found.");
            return counter;
        }
       

        int index = left;
        // start with the first occurence in array

        while (arr[index] == target && index < arr.length){
            counter++;
            index++;
        }
        
        // index to keep moving in the array or use for counting
        return counter;

       
        // keep counting until the elements in the array matches with the target. prevent going over the array as well

      
    }

    public static void main(String[] args){

        KeyOccurenceTwo sol = new KeyOccurenceTwo();
        int[] arr = {2,3, 5,4,2,3, 1};
        Arrays.sort(arr);

        System.out.println(sol.count(arr, 1));

       
        
    }
}
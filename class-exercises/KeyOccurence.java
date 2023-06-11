import java.util.Arrays;

class KeyOccurence {

    public int decreaseConquer(int[] arr, int target){

        // return occurences of a key value using decrease and conquer (linear search)
        int counter = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
           if (target == arr[i]){
                counter++;
           }
        }

        return counter;
    }

    public int divideConquer(int[] arr, int target){
        int counter = 0;

        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        int index = 0;

        // sorted array
        // 1. divide first the array into two
        // 2. check if the target is in the left subarray or right subarray
        // 3. if target exists, implement while loop starting from that index
        
        // left subarray:
        // Start at left index (0) up till middle index

        // right subarray:
        // Start at mid + 1 up till right index (n - 1)

        // initialize an index for left subarray to search for target
        // if not found in index, make index start at right subarray
        
        // [ 2, 2, 4, 6, 9, 9, 9, 9, 10]

        while (index <= mid){
            if (target == arr[index]){
                counter++;
                index++;
            } else {
                index++;
            }
        }
        


        return counter;
    }


    public boolean IsAnagram(char[] wordOne, char[] wordTwo){
        // check first if two words are the same length
        


        return false;
    }

    
    public static void main(String[] args){

        // convert all the letters to lowercases
     
        
        KeyOccurence sol = new KeyOccurence();

        // Tech

    














        // *************** Divide and Conquer ***************
        // int[] arr = {1, 0, 2, 2, 3};

        // int func = sol.divideConquer(arr, 2);
        // if (func == -1){
        //     System.out.println("Target not found");
        // }
        // else{
        //     System.out.println("Key Occurence: " + func);
        // }
        
    }
}
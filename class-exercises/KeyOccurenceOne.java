import java.util.Arrays;

public class KeyOccurenceOne {
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

    public static void main(String[] args){
        KeyOccurenceOne sol = new KeyOccurenceOne();

        int[] arr = {1,2,3,1, 5,4,2,1,3,1};
        Arrays.sort(arr);

        System.out.println(sol.decreaseConquer(arr, 1));

    }
}

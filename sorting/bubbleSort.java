package sorting;

public class bubbleSort {


    public int[] sortArr(){

        int nums[] = {5, 3, 1, 2, 9};
        

        for (int i = 0; i < nums.length; i++){
           
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    
                    

                }
            }
        }

        return nums;
    }

    public static void main(String[] args){
        System.out.println("Hello");
        bubbleSort s = new bubbleSort();

        int[] myArr = s.sortArr();

        for (int i =0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }
    }
}

class insertionSort {
    
    private void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]= temp;
        }

    }

    



    public static void main(String[] args){
        System.out.println("Hello World");

        int[] myArr = {7, 2, 6, 4, 3, 8, 1};

        insertionSort sort = new insertionSort();
        sort.insertSort(myArr);
        for ( int i = 0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }
        

    }
}
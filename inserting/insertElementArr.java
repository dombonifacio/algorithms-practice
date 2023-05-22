public class insertElementArr{

  

    // 1. insert elements into myArr
    public int[] insert(int[] arr, int element){
        // 1. make a copy of the arr so we could insert elements into the new arr. (we can't insert elements in to arr because size is final)
        // 2. start inserting elements into the new arr
        // 3. return that new arr
        int SIZE = arr.length + 1; // 6
        int[] newArr = new int[SIZE]; // 6
        for (int i = 0; i < newArr.length - 1; i++){ // 5
            // index or arrays start at 0 so index will be : 0 1 2 3 4
            newArr[i] = arr[i];

            System.out.println("i: " + i + " element: " + newArr[i]);
            
        }
        // gets inserted at index 5
        newArr[SIZE - 1] = element;

        

        return newArr;
        
    }

   
    
    public void test(int[] myArr){
        
        int[] count = new int[6];
        for (int i = 0; i < myArr.length - 2; i++){
            for (int j = i + 1; j < myArr.length - 1; j++){
                
                if (myArr[i] < myArr[j]) {
                    count[j] = count[j] + 1;
                }
                else {
                    count[i] = count[i] + 1;
                } 
                System.out.println(myArr[myArr.length-1]);
             
            }
           
        }
        // for (int i = 0; i < count.length; i++){
        //     System.out.println(count[i]);
        // }
           
    }
    


    public static void main (String[] args){
        int[] arr = {2, 3, 4, 5, 6};
        int[] myArr = {42, 17, 18, 23, 37, 9};
    
        insertElementArr getS = new insertElementArr();
        // getS.insert(arr, 7);
        getS.test(myArr);
   

        
       
    }
}
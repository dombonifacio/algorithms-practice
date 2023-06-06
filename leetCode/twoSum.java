
class twoSum{


    // For visualization why j = 1 won't work
    // [2, 7, 11, 9]
    // outer loop: 2, inner loop: 7
    // outer loop: 2, inner loop: 11
    // outer loop: 2, inner loop: 9
    // * * outer loop: 7, inner loop: 7 -> j will always start at index 1, allowing duplicate numbers

    public int[] getTwoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        for (int i = 0; i < nums.length - 1; i++){
         
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    newArr[0] = i;
                    newArr[1] = j;
                    
                    return newArr;
                }
                
                
            }
        }
        
       
       return new int[]{-1, -1};
    }

    public static void main(String[] args){

        int[] myArr = {5, 6, 9, 8, 20};
       // int[] newArr = new int[2];
        
        twoSum ans = new twoSum();
        ans.getTwoSum(myArr, 17);

       

        
        
        
       // System.out.println(ans.getTwoSum(myArr, 9));

        
    }




}